package com.bbtong.Base.dj;

import lombok.Data;

/**
 * 提交台账的实体类
 */
@Data
public class PostDaily {
    /**
     * 用户id(对应的就是用户表中的数据)
     */
    private Integer userId;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 代理人id
     */
    private Integer agentId;

    /**
     * 代理人姓名
     */
    private String agentName;

    /**
     * 车商名称
     */
    private String dealerName;

    /**
     * 部门的id
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 车牌号
     */
    private String licensePlateNumber;

    /**
     * 交强险金额
     */
    private Double compulsory;

    /**
     * 商业险金额
     */
    private Double commercial;

}
