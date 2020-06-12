package com.bbtong.Base;

/**
 * 用户在还单的时候 获取数据
 */

import lombok.Data;

@Data
public class UserEntrust {
    /**
     * 委托单的总数量
     */
    private Integer userEntrustNumber;

    /**
     * 接单的总数量
     */
    private Integer userOrderNumer;

    /**
     * 委托单的总金额
     */
    private Double userEntrustMoney;

    /**
     * 接单的总金额
     */
    private Double userOrderMoney;
}
