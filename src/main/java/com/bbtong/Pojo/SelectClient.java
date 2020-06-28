package com.bbtong.Pojo;

import lombok.Data;

/**
 * 用户查询显示自己的客户的信息的表
 */

@Data
public class SelectClient {
    /**
     * 主键/ID (客户表)
     */
    private Integer clientId;

    /**
     * 客户的联系方式(非必填选项，手机，微信等第三方工具)
     */
    private String clientWay;

    /**
     * 客户的姓名
     */
    private String clientName;

    /**
     * 客户需要出的保单公司(对应选择对应的保单公司ID)
     */
    private Integer insuranceCompanyId;

    /**
     *客户需要出单保险公司的名称
     */
    private  String insuranceCompanyName;

    /**
     * 客户的身份证号码
     */
    private String clientIdentityCard;

    /**
     * 客户身份证的正面
     */
    private String clientIdentityCardFront;

    /**
     * 客户身份证的反面
     */
    private String clientIdentityCardVerso;

    /**
     *  客户投保城市(前端传过来的值)
     */
    private String clientAddress;

    /**
     * 客户出保日期
     */
    private String clientComeTime;

    /**
     * 客户到保时间
     */
    private String clientExpirationTime;

    /**
     * 客户的行驶证副本图片
     */
    private String clientDrivingLicense;

    /**
     * 客户的生日(客户的生日，自动截取身份证的日期)
     */
    private String clientBirthday;

    /**
     * 客户车型(自己备注客户车的类型)
     */
    private String clientType;

    /**
     * 客户类型表的ID
     */
    private Integer typeId;

    /**
     * 客户类型表中客户的名称
     */
    private String typeName;

    /**
     * 用户的ID，这是属于哪个用户的客户
     */
    private Integer userId;

    /**
     * 给客户的备注
     */
    private String clientRemark;

    /**
     * 客户的车牌号
     */
    private String clientLicenseNumber;
}
