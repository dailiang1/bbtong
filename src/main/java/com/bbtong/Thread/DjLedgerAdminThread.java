package com.bbtong.Thread;

import com.bbtong.Base.dj.AdminCost;
import com.bbtong.Base.dj.Cost;
import com.bbtong.Dao.DjLedgerDao;
import com.bbtong.custom.Time;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * 管理员查询总台账的线程
 */
@Repository
public class DjLedgerAdminThread {
    //注入dao层
    @Resource
    private DjLedgerDao djLedgerDao;

    /**
     * 查询总台账的线程
     */
    public class SumDaily implements Callable<AdminCost> {

        //查询起始的时间
        private String startTime;

        //查询结束的时间
        private String endTime;

        //如果index为1，就是查询今日的，index为2就是查询本月的
        private Integer index;

        //创建对应的构造方法
        public SumDaily(String startTime, String endTime, Integer index) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.index = index;
        }

        @Override
        public AdminCost call() throws Exception {
            return querySumDaily(startTime, endTime, index);
        }
    }

    //查询对应的方法
    public AdminCost querySumDaily(String startTime, String endTime, Integer index) {
        //创建接收数据的实体
        AdminCost adminCost = null;
        //创建map函数用来存储数据
        Map<String, String> map = new HashMap<String, String>();
        map.put("startTime", startTime);//起始时间
        map.put("endTime", endTime);//结束时间
        try {
            //用实体类来接收 dao层查到的数据
            adminCost = djLedgerDao.querySumDaily(map);
            //判断adminCost是不是为null，如果adminCost为null的话，则说明没有查询到数据
            if (adminCost == null) {
                adminCost = new AdminCost();
                //就将交强险和商业险赋值为0.0
                adminCost.setCommercial(0.0);
                adminCost.setCompulsory(0.0);
                adminCost.setPercentageCommercial("0%");
                adminCost.setPercentageCompulsory("0%");
            } else {
                //接受这个月 或者 是这一年的交强险和商业金额
                Cost cost = percentage(index);
                //后面的两0表示保留几位小数
                DecimalFormat df = new DecimalFormat("#.00");
                //计算这天或这月在本月或本年的占比
                adminCost.setPercentageCommercial(df.format((adminCost.getCommercial() / cost.getCommercial()) * 100) + "%");
                adminCost.setPercentageCompulsory(df.format((adminCost.getCompulsory() / cost.getCompulsory()) * 100) + "%");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return adminCost;
    }

    /**
     * 查询对应时间段的交强险和商业险
     *
     * @param index 用来判断数据
     * @return 戴辆
     */
    public Cost percentage(Integer index) {
        //创建接受数据的实体类
        Cost cost = null;
        //创建自己写的时间的实体
        Time time = new Time();
        //创建map函数来存储数据
        Map<String, String> map = new HashMap<String, String>();
        if (index == 1) {//判断，如果index=1 就是查询 本月的交强险金额 和 商业险金额
            map.put("startTime", time.Monthly().get("startTime"));//将本月起始的时间存到map中
            map.put("endTime", time.Monthly().get("endTime"));//将本月结束的世界存到map中
        } else {
            map.put("startTime", time.Year().get("startTime"));//将本年起始的时间存到map中
            map.put("endTime", time.Year().get("endTime"));//将本年结束的世界存到map中
        }
        //接受返回的数据
        cost = djLedgerDao.AdminCost(map);
        return cost;//数据返回出去
    }
}
