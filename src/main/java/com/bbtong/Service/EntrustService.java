package com.bbtong.Service;

import com.bbtong.Pojo.Entrust;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.sun.org.apache.regexp.internal.RE;

/***
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
     * @param entrustId 委托的ID，用来操作用户
     * @param userId    发布委托人的ID
     * @param finallyUserId 接收委托人的ID
     * @param friendName  接单人的姓名
     * @param friendPhone  接单人的电话
     * @return 戴辆
     */
    ResultPage SendOrders(Integer userId, Integer finallyUserId, Integer entrustId,String friendName,String friendPhone,String InsuranceCompanyName);
}
