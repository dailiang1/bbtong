package com.bbtong.Base;

import lombok.Data;

/**
 * 注册的时候 管理员 查询对应用户个人信息的方法
 */

@Data
public class LoginUser {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户的姓名
     */
    private String userName;

    /**
     * 用户的电话
     */
    private String userPhone;

    /**
     * 用户的保险公司名称
     */
    private String insuranceCompanyName;

    /**
     * 用户的身份证号码
     */
    private String userIdentityCard;

    /**
     * 用户的状态(0表示没有实名，1表示待审核，2表示审核没通过，3表示实名认证了)
     */
    private Integer userState;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     *  委托人所在的城市(需自己选择，精确到县级即可)
     */
    private String userAddress;

    /**
     * 表示第一次测试的时候，注册的人是否审核了(0为待审核，1已审核)
     */
    private Integer testState;
}
