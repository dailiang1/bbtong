package com.bbtong.Pojo;

import lombok.Data;

/**
 * 查询返回和豆申请表的实体
 */
@Data
public class BeansUser {
    /**
     * 主键/ID（和豆申请表）
     */
    private Integer beansId;

    /**
     * 用来记录是那个代理人提交的
     */
    private Integer userId;

    /**
     *  人.车生活卡号，赠送和豆给卡激活人
     */
    private String cardNumber;

    /**
     *  用来记录和豆申请是否完成(0表示未处理，1表示已处理)
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
     * 电话号码(需要验证)
     */
    private String userPhone;

    /**
     * 审核该条管理员的姓名
     */
    private String adminName;
}
