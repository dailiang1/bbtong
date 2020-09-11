package com.bbtong.Base.dj;

import lombok.Data;

/**
 *大家保险用户查询台账记录的实体类
 */

@Data
public class LedgerBook {
    /**
     * 今日交强险费用
     */
    private Double todayCompulsory;

    /**
     * 今日商业险费用
     */
    private Double todayCommercial;

    /**
     * 昨日交强险费用
     */
    private Double yesterdayCompulsory;

    /**
     * 昨日商业险费用
     */
    private Double yesterdayCommercial;

    /**
     * 本周交强险费用
     */
    private Double weeklyCompulsory;

    /**
     * 本周商业险费用
     */
    private Double weeklyCommercial;

    /**
     * 本月交强险费用
     */
    private Double instantCompulsory;

    /**
     * 本月商业险费用
     */
    private Double instantCommercial;

    /**
     * 本年交强险费用
     */
    private Double YearCompulsory;

    /**
     * 本年商业险费用
     */
    private Double YearCommercial;
}
