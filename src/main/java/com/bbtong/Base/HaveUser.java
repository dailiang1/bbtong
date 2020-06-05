package com.bbtong.Base;

import lombok.Data;

/**
 * 用户添加有意向委托，查询用户的一些信息的实体类
 */

@Data
public class HaveUser {
    /**
     * 个人的诚信等级
     */
    private Double userIntegrity;

    /**
     * 开通年费的状态(1,表示已经开通。0表示没有开通)
     */
    private Integer userMemberState;

    /**
     *  用来判断他当前是否还能接单(0表示可以接单，1表示不可以)
     */
    private String userOrderState;

    /**
     * 表示当前委托人是否可以。选择有意向委托(0表示可以，1表示不可以)
     */
    private Integer intentionState;

    /**
     * 第一次测试的时候判断其有没有验证身份
     */
    private Integer testState;
}
