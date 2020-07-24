package com.bbtong.Base;

import lombok.Data;

/**
 * 管理员查询返回用户的对应信息
 */
@Data
public class AdminCheckUser {
    /**
     * 用户的id
     */
    private String userName;

    /**
     * 保险公司的id
     */
    private Integer insuranceCompanyId;

    /**
     * 保险公司的名称
     */
    private String insuranceCompanyName;

    /**
     * 表示用户注册的时间
     */
    private String userTime;

    /**
     * 用户的手机号码
     */
    private String userPhone;

}
