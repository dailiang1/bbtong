package com.bbtong.Base;

import lombok.Data;

@Data
public class OrderEntrust {
    /**
     * 主键/ID (还单表)
     */
    private Integer deliveryOrderId;

    /**
     * 还单用户的ID
     */
    private Integer newUserId;

    /**
     * 获取发布委托的金额
     */
    private Double deliveryOrderMoney;

    /**
     * 表示这一单结束的时间
     */
    private String entrustGradeTime;

    /**
     * 车牌号码
     */
    private String deliveryOrderNumber;

    /**
     * 用户名字
     */
    private String userName;

}
