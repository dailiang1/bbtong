package com.bbtong.Base;

import lombok.Data;

@Data
public class AdminEntrust {
    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;
    /**
     * 发布委托人的ID
     */
    private Integer userId;
    /**
     * 发布委托人的姓名
     */
    private Integer userName;

    /**
     * 发布委托人的电话
     */
    private Integer userPhone;

    /**
     * 指定对应要出的保单公司(可以为空) 默认是1表示所有公司
     */
    private Integer insuranceCompanyId;

    /**
     * 指定对应要出的保单公司(可以为空)
     */
    private Integer insuranceCompanyName;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 委托单开始的时间(获取下单时候的时间)
     */
    private String entrustStartTime;

    /**
     * 委托的金额
     */
    private Double entrustMoney;
}
