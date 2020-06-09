package com.bbtong.Base;

import lombok.Data;

/**
 * 查询显示用户有意向委托的信息(实体类)
 */

@Data
public class UserIntention {
    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 用户的手机号
     */
    private String userPhone;

    /**
     * 发布委托人的id
     */
    private Integer userId;

    /**
     * 委托当前的状态
     */
    private Integer entrustState;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 委托的金额
     */
    private Double entrustMoney;

    /**
     * 期望委托的服务费(可以为空，私下交易联系)
     */
    private Double entrustServiceCharge;

    /**
     * 前端选择对应的城市，直接存储城市的字符串
     */
    private String entrustAddress;

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
     * 车的品牌(如：大众，奔驰等)
     */
    private String entrustCarBrand;

    /**
     * 委托的备注
     */
    private String entrustRemark;

    /**
     * 车类型表的ID(表示新车或旧车)
     */
    private Integer carTypeId;

    /**
     * 车的类型(新车或续保)
     */
    private String carTypeName;

    /**
     * 车保类型的价格范围表ID
     */
    private Integer amountRangeId;


    /**
     * 车保金额的范围(如：低于30万，30-50万)
     */
    private String amountRangeName;

    /**
     * 需要投保些什么类型的保险，自己语言描述
     */
    private String entrustInsure;

    /**
     * 需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置
     */
    private Double entrustReturnMoney;

    /**
     * 还单的时间，多久之内把单给还了(用天来做单位)
     */
    private Integer entrustReturnTime;

    /**
     * 是否投保商业车损险(0表示不投，1表示投。默认选择是1)
     */
    private Integer entrustBusiness;

}
