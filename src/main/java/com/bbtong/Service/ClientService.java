package com.bbtong.Service;

import com.bbtong.Pojo.Client;
import com.bbtong.Pojo.SelectClient;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;

/**
 * 客户表
 */

public interface ClientService {

    /**
     * 用户添加自己的客户
     *
     * @param client 这里面存储着，用户传来的数据到serviceImpl中进行操作
     * @return 戴辆
     */
    Result AddClient(Client client);

    /**
     * 用户查询自己对应的客户信息，然后显示
     *
     * @param userId 用户自己的ID
     * @param typeId 查询的是什么用户 1准客户，2本网客户，3他网客户
     * @param index  当前是多少页
     * @return 戴辆
     */
    ResultPage SelectQuery(Integer userId, Integer typeId, Integer index);

    /**
     * 查询对应的客户的详情信息
     *
     * @param userId   用户的ID
     * @param clientId 客户的ID
     * @return 戴辆
     */
    ResultPage Particulars(Integer userId, Integer clientId);

    /**
     * 提醒用户哪些客户，在这一个月内生日
     *
     * @param userId  用户ID
     * @param Time    当前的时间
     * @param NewTime 加上一个月的时间
     * @return 戴辆
     */
    ResultPage Birthday(Integer userId, Integer Time, String NewTime, Integer index);

    /**
     * 用户快到车险的客户提醒(提提前一个月提醒)
     *
     * @param userId  用户的userId
     * @param Time    当前的时间
     * @param NewTime 一个月以后的时间
     * @param index   当前是多少页
     * @return 戴辆
     */
    ResultPage InsuranceWarn(Integer userId, String Time, String NewTime, Integer index);

    /**
     * 用户修改对应客户的信息
     *
     * @param selectClient 里面存储着修改之后的客户信息
     * @return
     */
    Result ClientRedact(SelectClient selectClient);

    /**
     * 用户删除客户的方法
     *
     * @param userId   用户的id
     * @param ClientId 客户的id
     * @return 戴辆
     */
    Result DelectClient(Integer userId, Integer ClientId);
}
