package com.bbtong.Base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SessionUser {
    @ApiModelProperty("用来记录用户的userId 用于session操作")
    //用来记录用户的userId
    private Integer userId;

    @ApiModelProperty("用来记录用户的手机号，用于操作")
    //用来记录用户的手机号
    private String userPhone;

    @ApiModelProperty("登陆人的保险公司名称 存到seesion中用于操作的")
    //登陆人的保险公司名称
    private Integer typeId;
}
