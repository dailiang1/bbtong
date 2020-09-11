package com.bbtong.Base.dj;

import lombok.Data;

/**
 * 总台账记录表
 */

@Data
public class SumCost {
    //今日交强险总费用
    private Double todaySumCompulsory;

    //今日交强险总费用占比
    private String todaySumCompulsoryPercentage;

    //今日商业险总费用
    private Double todaySumCommercial;

    //今日商业险总费用占比
    private String todaySumCommercialPercentage;

    //本月交强险总费用
    private Double monthSumCompulsory;

    //本月交强险总费用占比
    private String monthSumCompulsoryPercentage;

    //本月商业险总费用
    private Double monthSumCommercial;

    //本月商业险总费用占比
    private String monthSumCommercialPercentage;
}
