package com.bbtong.Base;

import lombok.Data;

@Data
public class PostUser {
    /**
     * 主键/ID 为自增的 (代理人表)
     */
    private Integer userId;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 用户的昵称
     */
    private String userNickname;

    /**
     * 对应保险公司的ID(用来查询用户是什么保险公司的)
     */
    private Integer insuranceCompanyId;

    /**
     * 电话号码(需要验证)
     */
    private String userPhone;

    /**
     * 用户的身份证号码
     */
    private String userIdentityCard;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     * A类表示：大保险代理(铁通员工)，B类表示大家保险代理(非铁通员工)，C类表示非大家保险代理。分别用1，2， 2表示
     */
    private Integer userTietong;

    /**
     *  委托人所在的城市(需自己选择，精确到县级即可)
     */
    private String userAddress;
}
