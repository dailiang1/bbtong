package com.bbtong.Base.dj;

import lombok.Data;

@Data
public class AdminDaily {
    /**
     * 日结表主键id
     */
    private Integer dailyId;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 代理人姓名
     */
    private String agentName;

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

    /**
     * 出单的时间
     */
    private String dailyTime;
}
