package com.bbtong.Base;

import lombok.Data;

/**
 * 其他保险大厅显示的数据实体类
 */

@Data
public class AtEntrust {
    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 委托的金额
     */
    private Double entrustMoney;

    /**
     * 期望委托的服务费(可以为空，私下交易联系)
     */
    private Double entrustReturnMoney;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 委托单开始的时间(获取下单时候的时间)
     */
    private String entrustStartTime;
}
