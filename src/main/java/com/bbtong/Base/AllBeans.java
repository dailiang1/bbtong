package com.bbtong.Base;

import lombok.Data;

@Data
public class AllBeans {
    /**
     * 主键/ID（和豆申请表）
     */
    private Integer beansId;

    /**
     * 用来记录是那个代理人提交的
     */
    private Integer userId;

    /**
     * 用来记录代理人的姓名
     */
    private String userName;

    /**
     * 人.车生活卡号，赠送和豆给卡激活人
     */
    private String cardNumber;

    /**
     * 用来记录和豆申请是否完成(0表示未处理，1表示已处理)
     */
    private String beansState;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     * 和豆订单申请的时间
     */
    private String beansTime;

    /**
     * 和豆订单申请审核的时间
     */
    private String newbeansTime;

    /**
     * 审核这条信息的管理员信息
     */
    private String adminName;
}
