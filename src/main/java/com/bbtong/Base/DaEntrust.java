package com.bbtong.Base;

import lombok.Data;

/**
 * 大家保险查询显示对应的数据
 */

@Data
public class DaEntrust {

    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 委托的金额
     */
    private Double entrustMoney;

    /**
     * 期望委托的服务费(可以为空，私下交易联系)
     */
    private Double entrustServiceCharge;

    /**
     * 需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置
     */
    private Double entrustReturnMoney;

    /**
     * 前端选择对应的城市，直接存储城市的字符串
     */
    private String entrustAddress;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 指定对应要出的保单公司(可以为空) 默认是1表示所有公司
     */
    private Integer insuranceCompanyId;

    /**
     * 保险公司名称(如大家保险，平安保险)
     */
    private String insuranceCompanyName;

    /**
     * 委托单开始的时间(获取下单时候的时间)
     */
    private String entrustStartTime;

    /**
     * 委托单结束的时间
     */
    private String entrustEndTime;

    /**
     * 还单的时间期限(获取委托表中的时间)
     */
    private String entrustReturnTime;
    /**
     * 表示委托是否被接(0表示未接单，1表示已接单，2表示已完成，3表示没人接单，4表示委托人主动撤单)
     */
    private Integer entrustState;

    /**
     * 有意向接单人的ID(是一个字符串来接受这些人，用逗号来分割)
     */
    private String newUserId;

    /**
     * 用来切割分离之后储存有意向的人数
     */
    private Integer number;
}
