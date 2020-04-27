package com.bbtong.Service;

import com.bbtong.Pojo.Consume;
import com.bbtong.Util.ResultPage;

/**
 * 消费卡申请表
 */

public interface ConsumeService {
    /**
     * 用户提交消费卡申请的方法
     * @param consume userId 用户的user_id
     * @param consume consumeNumber 的用户提交的大家保险的单号
     * @return 戴辆
     */
    ResultPage Submit(Consume consume);

    /**
     * 用户查询自己的消费卡审核的状态
     * @param userId 用户的ID
     * @param index 当前的页数
     * @param consumeState 当前是什么状态的(0表示未审核，1表示已审核)
     * @return 戴辆
     */
    ResultPage Query(Integer userId, Integer index,Integer consumeState);

    /**
     * 表示管理员查询审核对应的数据
     * @param index 当前的页数
     * @param consumeState 当前什么状态的数据 (0表示未审核，1表示已审核)
     * @return 戴辆
     */
    ResultPage SelectQuery(Integer index,Integer consumeState);
}
