package com.bbtong.Base;

import lombok.Data;

@Data
public class GetDaEntrust {
    /**
     * 订单的评分的时间(表示这一单正式结束的时间)
     */
    private String entrustGradeTime;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 委托的金额(委托费用)
     */
    private Double entrustMoney;

    /**
     *  需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置
     */
    private Double entrustReturnMoney;

    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;
}
