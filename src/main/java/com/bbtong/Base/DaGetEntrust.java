package com.bbtong.Base;

import lombok.Data;

@Data
public class DaGetEntrust {
    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 表示委托是否被接(0表示未接单，1表示已接单，2表示已完成，3表示没人接单，4表示委托人主动撤单)
     */
    private Integer entrustState;

    /**
     *  保险公司的名称(通过保险公司的ID查询出来的)
     */
    private String insuranceCompanyName;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 电话号码(需要验证)
     */
    private String userPhone;
}
