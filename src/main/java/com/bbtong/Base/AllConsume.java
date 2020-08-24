package com.bbtong.Base;

import lombok.Data;

@Data
public class AllConsume {
    /**
     * 主键/ID (消费卡申请表)
     */
    private Integer consumeId;

    /**
     * 用来记录是那个代理人提交的
     */
    private Integer userId;

    /**
     * 代理人姓名
     */
    private String userName;

    /**
     * 提交大家保险保单号
     */
    private String consumeNumber;

    /**
     * 用来记录消费卡申请是否完成(0表示未处理，1表示已处理)
     */
    private String consumeState;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     * 提交消费卡申请的时间
     */
    private String consumeTime;

    /**
     * 消费卡申请审核的时间
     */
    private String newconsumeTime;

    /**
     * 审核这条信息的管理员姓名
     */
    private String adminName;
}
