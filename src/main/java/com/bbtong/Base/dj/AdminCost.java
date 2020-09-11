package com.bbtong.Base.dj;

import lombok.Data;

@Data
public class AdminCost {
    //交强险费用
    private double compulsory;

    //交强险百分比
    private String percentageCompulsory;

    //商业险费用
    private double commercial;

    //商业险百分比
    private String percentageCommercial;
}
