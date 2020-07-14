package com.bbtong.Base;

import lombok.Data;

/**
 * 审核用户的一些信息
 */

@Data
public class UserCheck {
    /**
     * 主键/ID 为自增的 (代理人表)
     */
    private Integer userId;

    /**
     * 表示当前委托人是否可以。选择有意向委托(0表示可以，1表示不可以)
     */
    private Integer intentionState;

    /**
     * 表示第一次测试的时候，注册的人是否审核了(0为待审核，1已审核)
     */
    private Integer testState;

    /**
     * A类表示：大保险代理(铁通员工)，B类表示大家保险代理(非铁通员工)，C类表示非大家保险代理。分别用0，1， 2表示
     */
    private Integer userTietong;
    /**
     * 用来判断他当前是否还能接单(0表示可以接单，1表示不可以)
     */
    private Integer userOrderState;
    /**
     * 用户的状态(0表示没有实名，1表示待审核，2表示审核没通过，3表示实名认证了)
     */
    private Integer userState;
    /**
     * 开通年费的状态(1,表示已经开通。0表示没有开通)
     */
    private Integer userMemberState;

    /**
     * 年费开始的时间
     */
    private String userMemberBegin;

    /**
     * 年费截止的时间
     */
    private String userMemberFinish;

    /**
     * 管理员表的id
     */
    private Integer adminId;

    /**
     * 修改的时间
     */
    private String adminMessageTime;

    /**
     * 管理员对于操作的备注
     */
    private String adminMessageRemark;

    /**
     * 管理员的权限id
     */
    private Integer adminRoleId;
}
