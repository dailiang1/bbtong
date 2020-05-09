package com.bbtong.Service.Impl;

import com.bbtong.Base.DaEntrust;
import com.bbtong.Base.DaParticulars;
import com.bbtong.Base.Information;
import com.bbtong.Dao.EntrustDao;
import com.bbtong.Pojo.Entrust;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 委托订单表
 */

@Service
public class EntrustServiceImpl implements EntrustService {

    /**
     * 委托订单的dao层
     */
    @Resource
    private EntrustDao entrustDao;

    /**
     * 用户发布委托订单
     *
     * @param entrust 用来存储controller层传来的数据
     * @return 戴辆
     */
    @Override
    public Result AddEntrust(Entrust entrust) {
        //创建实体来接收数据
        Result result = new Result();
        //创建数据来接受后台返回的结果
        int zhi = entrustDao.AddEntrust(entrust);
        //用来判断是否添加成功，如果成功的话，就返回结果成功
        if (zhi > 0) {
            result.setCode(200);
            result.setMessage("发布成功");
        } else {
            result.setCode(400);
            result.setMessage("发布失败");
        }
        return result;
    }

    /**
     * 大家保险的用户查询自己的委托单
     *
     * @param userId 用户的ID
     * @param index  当前的页数
     * @return 戴辆
     */
    @Override
    public ResultPage DaSelectEntrust(Integer userId, Integer index) {
        //创建函数来接受数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来接受数据
        Map<String, Object> map = new HashMap<String, Object>();
        //设置一页显示多少条数据
        resultPage.setSize(5);
        //设置当前的页码
        resultPage.setIndex(index);
        //将数据存到map数组中用于查询总的条数，以及页数
        map.put("userId", userId);
        map.put("state", 0);
        //将返回的条数用resultPage的数据接收
        resultPage.setCount(entrustDao.DaSelectEntrustNumber(map));
        //计算总的页数,先计算总的页数，然后向下取整，再将其转换成int类型
        resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
        //如果当前页数为总页数，则表示查询到了最后一页，显示最后一页的数据
        if (index == resultPage.getPageCount() || index > resultPage.getPageCount()) {
            map.put("end", resultPage.getSize() * resultPage.getPageCount());
        } else {
            map.put("end", resultPage.getSize() * index);
        }
        //创建数组来接受对应的数据
        List<DaEntrust> daEntrustList = entrustDao.DaSelectEntrust(map);
        //判断是否查到了数据，来进行操作
        if (daEntrustList.size() > 0) {
            //查到了数据，对于数组的数据，应该用foreach循环来循环显示
            for (DaEntrust item : daEntrustList) {
                //如果没有人对此单有意向的话就让其为0
                if (null == item.getNewUserId()) {
                    item.setNumber(0);
                    break;//break跳出当前的循环，进入下面的循环
                }
                //创建一个数组来接受有多少人数
                String list[] = item.getNewUserId().split(",");
                //将有多少人有意向存到对应人数字段中
                item.setNumber(list.length);
            }
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(daEntrustList);
        } else {
            resultPage.setCode(400);
            resultPage.setMessage("查询失败");
        }
        return resultPage;
    }

    /**
     * 大家保险的用户查询自己对应的委托信息
     *
     * @param userId    用户的ID
     * @param entrustId 委托订单的ID
     * @return 戴辆
     */
    @Override
    public Result DaParticulars(Integer userId, Integer entrustId) {
        //创建对应接受数据的实体
        Result result = new Result();
        //创建map的函数来进行数据的操作
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId存到map中用于sql的查询操作
        map.put("userId", userId);
        //将entrustId存到map中用于sql的查询
        map.put("entrustId", entrustId);
        //查询对应订单的信息的和人数
        List<DaParticulars> daParticularsList = entrustDao.DaParticulars(map);
        if (daParticularsList.size() > 0) {//判断数组是不是为空，如果数组为空的话，则表示没有数据
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(daParticularsList);
        } else {
            result.setCode(400);
            result.setMessage("没有用户或当前异常");
        }
        return result;
    }

    /**
     * 大家保险的用户将委托派给指定的人
     *
     * @param userId               发布委托人的ID
     * @param finallyUserId        接收委托人的ID
     * @param entrustId            委托的ID
     * @param friendName           接单人的姓名
     * @param friendPhone          接单人的电话
     * @param InsuranceCompanyName 接单人保险公司的名称
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage SendOrders(Integer userId, Integer finallyUserId, Integer entrustId, String friendName, String friendPhone, String InsuranceCompanyName) {
        //创建resultpage的实体来接收数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来接受参数，进行操作
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId和newUserId，以及entrustId存到map中进行操作
        map.put("userId", userId);//委托人的ID
        //查询委托人的姓名和电话
        Information information = entrustDao.Information(map);
        map.put("userName", information.getUserName());//委托人的姓名
        map.put("userPhone", information.getUserPhone());//委托人的电话
        map.put("userInsuranceCompanyName", information.getInsuranceCompanyName());//委托人的保险公司
        map.put("finallyUserId", finallyUserId);//接单人的ID
        map.put("entrustId", entrustId);//委托的ID
        map.put("friendName", friendName);//接单人的姓名
        map.put("friendPhone", friendPhone);//接单人的电话
        map.put("insuranceCompanyName", InsuranceCompanyName);//接单人保险公司名称
        try {
            //第一步将委托派送给指定的人，并且将委托的状态变成已经接单，并且接受返回的结果，
            int UpdateEntrust = entrustDao.UpdateEntrust(map);
            //第二步将除了接单的人之外的其他人，变的可以有意向委托
            int UpdateNewUserId = entrustDao.UpdateNewUserId(map);
            //第三步将两个人确认好友关系
            int AddFriend = entrustDao.AddFriend(map);
            //第四步将信息写入到接单表中
            int AddOrder = entrustDao.AddOrder(map);
            resultPage.setCode(200);
            resultPage.setMessage("派单成功");
        } catch (Exception e) {
//            resultPage.setCode(300);
//            resultPage.setMessage("没有指派成功");
//            throw new ArithmeticException(e.getMessage());
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(500);
            resultPage.setMessage("出现异常");
        }
        return resultPage;
    }


}
