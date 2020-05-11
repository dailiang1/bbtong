package com.bbtong.Service.Impl;

import com.bbtong.Base.DaEntrust;
import com.bbtong.Base.DaParticulars;
import com.bbtong.Base.HaveUser;
import com.bbtong.Base.Information;
import com.bbtong.Dao.EntrustDao;
import com.bbtong.Pojo.Entrust;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultHave;
import com.bbtong.Util.ResultPage;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.taglibs.standard.tag.common.sql.DataSourceUtil;
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
            //第五步将接单人可以接单的状态修改成不可以接单
            int UpdateOrder = entrustDao.UpdateOrder(map);
            resultPage.setCode(200);
            resultPage.setMessage("派单成功");
        } catch (Exception e) {
//            resultPage.setCode(300);
//            resultPage.setMessage("没有指派成功");
//            throw new ArithmeticException(e.getMessage());
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("出现异常");
        }
        return resultPage;
    }

    /**
     * 委托人查询自己发布的委托
     *
     * @param userId 委托人的ID
     * @return 戴辆
     */
    @Override
    public Result IssueRecord(Integer userId) {
        //创建实体类来接收查询的数据,并且返回数据给controller层
        Result result = new Result();
        //创建函数来接受数据,entrustlist中存的数据
        List<Entrust> entrustList = entrustDao.IssueRecord(userId);
        if (entrustList.size() > 0) {//判断数组的长度是否大0，如果大于0 的话，则说明有数据，
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(entrustList);
        } else {//如果进入else 则说明没有数据
            result.setCode(400);
            result.setMessage("没有数据，或出现了异常");
        }
        return result;
    }

    /**
     * 用户查询自己接过的委托
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    @Override
    public Result OrderRecord(Integer userId) {
        //创建实体类来接受，返回的数据和将数据执行的结果返回给controller层
        Result result = new Result();
        //创建对应的list数组来接受数据
        List<Entrust> entrustList = entrustDao.OrderRecord(userId);
        if (entrustList.size() > 0) {//判断数组的长度是否大0，如果大于0 的话，则说明有数据，
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(entrustList);
        } else {//如果进入else 则说明没有数据
            result.setCode(400);
            result.setMessage("没有数据，或出现了异常");
        }
        return result;
    }

    /**
     * 用户有意向委托
     *
     * @param userId    用户的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    @Transactional
    @Override
    public ResultHave HavaEntrust(Integer userId, Integer entrustId) {
        //创建实体类来操作数据
        ResultHave resultHave = new ResultHave();
        //创建map函数来进行数据的操作
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将用户Id写入到map中
        map.put("entrustId", entrustId);//将委托ID写入到map中
        try {
            //第一步 先查询数据库 1.用户是否还能有意向 2.是否还能接单 3.是否开发通了年费 4.诚信是否合格
            HaveUser haveUser = entrustDao.SelectUser(map);
            //2.判断诚信是否达标
            if (haveUser.getUserIntegrity() == 0) {
                resultHave.setCode(100002);
                resultHave.setMessage("当前诚信不合格");
                return resultHave;
            }
            //2.判断其诚信是否达标
            if (haveUser.getUserMemberState() == 0) {
                resultHave.setCode(100001);
                resultHave.setMessage("请先开通年费");
                return resultHave;
            }
            //3.判断他当前是否还可以接单
            if (haveUser.getUserOrderState().equals("1")) {
                resultHave.setCode(100003);
                resultHave.setMessage("请先完成对应要处理的订单");
                return resultHave;
            }
            //4.判断他当前是否还有意向的机会
            if (haveUser.getIntentionState().equals("1")) {
                resultHave.setCode(100004);
                resultHave.setMessage("当前已经没有，有意向的机会了");
                return resultHave;
            }
            //第二步 通过委托ID查询对应的所有有意向人的ID
            String newUserId = entrustDao.NewUserId(map);
            //创建一个数组来接受数据
            String[] newUser = newUserId.split(",");
            //创建foreach循环来循环函数
            for (String item : newUser
            ) {
                if (item.equals(userId.toString())) {
                    resultHave.setCode(100009);
                    resultHave.setMessage("当前已经意向了");
                    return resultHave;
                }
            }
            //判断长度是否大于0，如果大于零则说明不是第一个添加到数组中的时候就需要加","号,如果是第一个就直接添加
            if (newUser.length > 0) {
                newUserId = newUserId + "," + userId;
            } else {
                //将int类型转换成string类型
                newUserId = userId.toString();
            }
            //创建map函数来将数据存储起来
            map.put("newUserId", newUserId);

            //第三步 将用户写入到有意向的用户中
            int updatenewUserId = entrustDao.Update(map);
            if (updatenewUserId == 0) {
                resultHave.setCode(300);
                resultHave.setMessage("出现异常");
                return resultHave;
            }
            //第四步 将用户自己的有意向机会改成1(表示不可以)
            int Intention = entrustDao.Intention(map);
            if (Intention == 0) {
                resultHave.setCode(300);
                resultHave.setMessage("出现异常");
                return resultHave;
            }
            resultHave.setCode(200);
            resultHave.setMessage("添加成功");
        } catch (Exception e) {//出现异常的话就捕捉，然后事务回滚
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultHave.setCode(300);
            resultHave.setMessage("出现异常");
        }
        return resultHave;
    }
}
