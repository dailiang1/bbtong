package com.bbtong.Service;

import com.bbtong.Pojo.Entrust;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultHave;
import com.bbtong.Util.ResultPage;
import com.sun.org.apache.regexp.internal.RE;

/**
 * 委托订单表
 */

public interface EntrustService {
    /**
     * 客户发布委托的方法
     *
     * @param entrust 用来存储controller层传来的数据
     * @return
     */
    Result AddEntrust(Entrust entrust);

    /**
     * 大家保险查询自己的委托
     *
     * @param userId 用户的ID
     * @param index  当前的页数
     * @return 戴辆
     */
    ResultPage DaSelectEntrust(Integer userId, Integer index);

    /**
     * 大家保险的用户查询自己对应的委托的信息
     *
     * @param userId    用户的ID
     * @param entrustId 委托订单的ID
     * @return 戴辆
     */
    Result DaParticulars(Integer userId, Integer entrustId);

    /**
     * 将委托派给指定的人
     *
     * @param entrustId     委托的ID，用来操作用户
     * @param userId        发布委托人的ID
     * @param finallyUserId 接收委托人的ID
     * @param friendName    接单人的姓名
     * @param friendPhone   接单人的电话
     * @return 戴辆
     */
    ResultPage SendOrders(Integer userId, Integer finallyUserId, Integer entrustId, String friendName, String friendPhone, String InsuranceCompanyName);

    /**
     * 委托人查询自己发布的委托
     *
     * @param userId 委托人的ID
     * @return 戴辆
     */
    Result IssueRecord(Integer userId);

    /**
     * 委托人查询自己接过的委托
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    Result OrderRecord(Integer userId);

    /**
     * 用户有意向委托
     *
     * @param userId    用户的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    ResultHave HaveEntrust(Integer userId, Integer entrustId);

    /**
     * 查询用户有意向的委托信息
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    ResultHave UserIntention(Integer userId);

    /**
     * 用户查询自己当前有意向的委托的信息
     *
     * @param userId    用户的ID
     * @param entrustId 当前要取消委托的ID
     * @return 戴辆
     */
    Result OffIntention(Integer userId, Integer entrustId);

    /**
     * 用户查询他当前正在处理的委托
     * @param userId 用户的userId
     * @return 戴辆
     */
    ResultHave QueryEntrust(Integer userId);

    /**
     * 用户完成委托之后确认
     * @param userId 发布委托用户的ID
     * @param newUserId 接单人的ID
     * @param entrustId 委托的ID
     * @param entrustReturnMoney 需要还单的金额
     * @param entrustReturnTime 规定还单的期限
     * @return 戴辆
     */
    Result Accomplish(Integer userId,Integer newUserId,Integer entrustId,Double entrustReturnMoney, Integer entrustReturnTime);

    /**
     * 委托人确认审核对应的委托是否完成了，如果完成了的话，就将委托的状态修改
     * @param userId 委托人的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    Result DaAffirm(Integer userId,Integer entrustId);

    /**
     * 用户查询正在处理委托的还单记录
     * @param userId 用户ID
     * @param entrustId 当前正在处理的委托的ID
     * @return 戴辆
     */
    Result UserSelectDeliveryOrder(Integer userId,Integer entrustId);

    /**
     * 用户还单的时候提交 信息写入到数据库中去
     * @param newUserId 还单人的ID
     * @param deliveryOrderNumber 委托的车牌号
     * @param deliveryOrderMoney 还的委托的金额
     * @return 戴辆
     */
    ResultHave UserAlso(Integer newUserId, String deliveryOrderNumber, Double deliveryOrderMoney);
}
