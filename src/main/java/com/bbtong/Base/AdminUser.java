package com.bbtong.Base;

import com.bbtong.Pojo.Intention;
import lombok.Data;

/**
 * 管理员查询所有用户，接受的实体类
 */
@Data
public class AdminUser {
    /**
     * 用户的id
     */
    private String userName;

    /**
     * 保险公司的id
     */
    private Integer insuranceCompanyId;

    /**
     * 用户的注册时间(开始日期)
     */
    private String startTime;

    /**
     * 用户的注册时间(结束日期)
     */
    private String endTime;

    /**
     * 用户的手机号码
     */
    private String userPhone;

    /**
     * 当前的页的页数
     */
    private Integer index;
}
