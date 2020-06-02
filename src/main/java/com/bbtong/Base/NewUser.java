package com.bbtong.Base;

import lombok.Data;

/**
 * 用来登陆接受电话和验证码的实体类
 */
@Data
public class NewUser {
    private  String userPhone;

    private  Integer num;
}
