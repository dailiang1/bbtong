package com.bbtong.Thread;

import com.bbtong.Base.dj.Cost;
import com.bbtong.Base.dj.LedgerBook;
import com.bbtong.Dao.DjLedgerDao;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * 大家保险用户进行日结台账的线程类
 */
@Repository
public class DjLedgerThread {

    //创建对应dao层的方法
    @Resource
    private DjLedgerDao djLedgerDao;

    /**
     * 查询对应的线程
     */
    public class LedgerBookThread implements Callable<Cost> {
        //用户的id
        private Integer userId;

        //查询起始的时间
        private String startTime;

        //查询结束的时间
        private String endTime;

        //创建对应的构造方法
        public LedgerBookThread(Integer userId, String startTime, String endTime) {
            this.userId = userId;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public Cost call() throws Exception {
            return ledgerBook(userId, startTime, endTime);
        }
    }

    //查询对应的信息的方法
    public Cost ledgerBook(Integer userId, String startTime, String endTime) {
        //创建接收数据的实体
        Cost cost =null;
        //创建map函数来操作和存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将userID存到map中
        map.put("startTime", startTime);//将起始的时间存到对应的map中
        map.put("endTime", endTime);//将结束的时间存到map中
        try {
            //用实体类来接受dao层查询到的数据
            cost = djLedgerDao.ledgerBook(map);
            //判断cost是不是为null，如果cost为null的话，则说明没有查询到数据
           if (cost==null){
               cost=new Cost();
               //就将交强险和商业险赋值为0.0
               cost.setCommercial(0.0);
               cost.setCompulsory(0.0);
           }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现错误");
        }
        return cost;
    }
}
