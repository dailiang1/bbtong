package com.bbtong.Base;

import lombok.Data;

/**
 * 接收用户的电话和姓名
 */

@Data
public class Information {
    /**
     * 电话号码(需要验证)
     */
    private String userPhone;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 保险公司名称(发布委托用户的保险公司的名称，用来显示是哪家保险的代理人)
     */
    private String insuranceCompanyName;
}
