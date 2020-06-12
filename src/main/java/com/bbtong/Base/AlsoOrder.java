package com.bbtong.Base;

import lombok.Data;

/**
 * 接受还单内容的实体类
 */
@Data
public class AlsoOrder {

    /**
     * 还单表主键的id
     */
    private Integer deliveryOrderId;

    /**
     * 还单用户的id
     */
    private Integer newUserId;

    /**
     * 还单的车牌号
     */
    private String deliveryOrderNumber;

    /**
     * 还单的金额
     */
    private Double deliveryOrderMoney;

    /**
     * 还单的状态 (0表示未确认 1确定 2驳回订单信息有误)
     */
    private Integer deliveryOrderState;

    /**
     * 用户的姓名
     */
    private String userName;

    /**
     * 表示这一单更新的时间
     */
    private String entrustGradeTime;
}
