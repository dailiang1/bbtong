package com.bbtong.Base;

import lombok.Data;

/**
 * 管理员 查询对应的委托详情
 */

@Data
public class ParticularsEntrust {
    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 发布委托人的ID
     */
    private Integer userId;

    /**
     * 委托人的姓名
     */
    private String userName;

    /**
     * 有意向接单人的ID(是一个字符串来接受这些人，用逗号来分割)
     */
    private String newUserId;

    /**
     * 有意向的人数
     */
    private int newUserIdCount;

    /**
     * 最终接单人的ID(根据ID，显示其的满意度，委托数，联系电话)
     */
    private Integer finallyUserId;

    /**
     * 出保公司
     */
    private String insuranceCompanyName;

    /**
     * 受保公司
     */
    private String newInsuranceCompanyName;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 车的品牌(如：大众，奔驰等)
     */
    private String entrustCarBrand;

    /**
     * 前端选择对应的城市，直接存储城市的字符串
     */
    private String entrustAddress;

    /**
     * 委托的备注
     */
    private String entrustRemark;

    /**
     * 委托单开始的时间(获取下单时候的时间)
     */
    private String entrustStartTime;

    /**
     * 需要投保些什么类型的保险，自己语言描述
     */
    private String entrustInsure;

    /**
     * 期望委托的服务费(可以为空，私下交易联系)
     */
    private Double entrustServiceCharge;

    /**
     * 委托的金额
     */
    private Double entrustMoney;

    /**
     * 需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置
     */
    private Double entrustReturnMoney;

    /**
     * 还单的时间，多久之内把单给还了(用天来做单位)
     */
    private Integer entrustReturnTime;

    /**
     * 表示委托是否被接(0表示未接单，1表示已接单，2表示待确认完成，3表示已完成，4表示没人接单，5表示委托人主动撤单,6表示委托还单结束)
     */
    private Integer entrustState;

    /**
     *
     */
    private boolean zz = false;

}
