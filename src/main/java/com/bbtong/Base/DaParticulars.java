package com.bbtong.Base;

import lombok.Data;

/**
 * 通过委托订单ID，去查询信息。(查询信息返回的实体类)
 */
@Data
public class DaParticulars {
    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 电话号码(需要验证)
     */
    private String userPhone;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 保险公司名称(发布委托用户的保险公司的名称，用来显示是哪家保险的代理人)
     */
    private String insuranceCompanyName;

    /**
     * 主键/ID 为自增的 (代理人表)
     */
    private Integer userId;
}
