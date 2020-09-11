package com.bbtong.Base.dj;

import lombok.Data;

@Data
public class NewDaily {
    /**
     * 日结表主键id
     */
    private Integer dailyId;

    /**
     * 用户id(对应的就是用户表中的数据)
     */
    private Integer userId;

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
