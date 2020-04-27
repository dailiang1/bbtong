package com.bbtong.Service.Impl;

import com.bbtong.Dao.ConsumeDao;
import com.bbtong.Pojo.Beans;
import com.bbtong.Pojo.BeansUser;
import com.bbtong.Pojo.Consume;
import com.bbtong.Service.ConsumeService;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 消费卡申请表
 */

@Service
public class ConsumeServiceImpl implements ConsumeService {

    @Resource
    private ConsumeDao consumeDao;

    /**
     * 用户提交消费卡的申请
     * @param consume userId 用户的user_id
     * @param consume consumeNumber 的用户提交的大家保险的单号
     * @return
     */
    @Override
    public ResultPage Submit(Consume consume) {
        //创建实体来接受数据库返回的数据
        ResultPage resultPage=new ResultPage();
        //根据用户的ID去查询，他的代理编号，储存到实体类当中
        consume.setUserNumber(consumeDao.User_Number(consume.getUserId()));
        //将数据存到数据库中去
        int zhi=consumeDao.Submit(consume);
        if(zhi>0){
            resultPage.setCode(200);
            resultPage.setMessage("提交成功");
        }else{
            resultPage.setCode(400);
            resultPage.setMessage("提交失败,请重试");
        }
        return resultPage;
    }

    /**
     *用户查询对应状态的数据
     * @param userId 用户的ID
     * @param index 当前的页数
     * @param consumeState 当前是什么状态的(0表示未审核，1表示已审核)
     * @return 戴辆
     */
    @Override
    public ResultPage Query(Integer userId, Integer index, Integer consumeState) {
        //创建Result的实体来接受返回的参数
        ResultPage resultPage=new ResultPage();
        //一页显示的多少的条数据
        resultPage.setSize(5);
        //当前是多少页
        resultPage.setIndex(index);

        //创建map的实例来查询存储数据
        Map<String,Object> map=new HashMap<String, Object>();
        //那个用户的查询的
        map.put("userId",userId);
        //查询什么状态的数据
        map.put("consumeState",consumeState);
        //用实体类来接受，有多少条的数据
        resultPage.setCount(consumeDao.QueryNumber(map));
        //用来计算当前有多少页
        resultPage.setPageCount((int)Math.ceil((double)resultPage.getCount()/resultPage.getSize()));
        if(resultPage.getPageCount()==index){
            resultPage.setCode(200);
            resultPage.setMessage("当前已经是最后一页");
            map.put("end",resultPage.getSize()*index);
            resultPage.setData(consumeDao.Query(map));
            return  resultPage;
        }
        //将一页显示多少条数据，存到map中
        map.put("end",resultPage.getSize()*resultPage.getIndex());
        List<Consume> beansList=consumeDao.Query(map);
        if(beansList.size()>0||beansList.size()==0){
            resultPage.setCode(200);
            resultPage.setMessage("查询数据成功");
            resultPage.setData(beansList);
        }else{
            resultPage.setCode(400);
            resultPage.setMessage("查询数据失败");
        }
        return resultPage;
    }

    /**
     * 管理员查看消费卡申请的订单或审核订单
     * @param index 当前的页数
     * @param consumeState 当前什么状态的数据 (0表示未审核，1表示已审核)
     * @return
     */
    @Override
    public ResultPage SelectQuery(Integer index, Integer consumeState) {
        //创建Result的实体来接受返回的参数
        ResultPage resultPage=new ResultPage();
        //创建map函数来存储数据,用于后端的查询
        Map<String,Object> map=new HashMap<String, Object>();
        //将查询什么数据的参数存到map中
        map.put("consumeState",consumeState);
        //将页数存起来
        resultPage.setIndex(index);
        //一页显示几条数据
        resultPage.setSize(5);
        //用来接受存储，还有多少条待审核的数据
        resultPage.setCount(consumeDao.SelectQueryNumber(map));
        //计算总的页数
        resultPage.setPageCount((int)Math.ceil((double)resultPage.getCount()/resultPage.getSize()));
        if(resultPage.getPageCount()==index){
            resultPage.setCode(200);
            resultPage.setMessage("当前已经是最后一页");
            //忽略多少条数据
            map.put("state",(index-1)*resultPage.getSize());
            //查询多少条数据
            map.put("end",resultPage.getSize());
            resultPage.setData(consumeDao.SelectQuery(map));
            return  resultPage;
        }
        //忽略多少条数据
        map.put("state",(index-1)*resultPage.getSize());
        //查询多少条数据
        map.put("end",resultPage.getSize());
        List<Consume> beansList=consumeDao.SelectQuery(map);
        if(beansList.size()>0||beansList.size()==0){
            resultPage.setCode(200);
            resultPage.setMessage("查询数据成功");
            resultPage.setData(beansList);
        }else{
            resultPage.setCode(400);
            resultPage.setMessage("查询数据失败");
        }
        return resultPage;
    }

}
