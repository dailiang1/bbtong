package com.bbtong.Util;

import com.bbtong.Pojo.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserResult {
    @ApiModelProperty("表示成功的状态")

    private Integer code;
    //判断执行编码,0表示没有登陆,200表示成功,205表示新用户待注册,300表示异常，400表示失败，500表示数据问题

    @ApiModelProperty("对于返回的状态，文字说明")
    private String message;
    //用来存储返回的结果或者数据

    @ApiModelProperty("储存返回的数据，json格式")
    private Object data;
    //返回结果集，单条

    @ApiModelProperty("储存返回的数组List数据")
    private List<Object> datas;
    //返回结果集，集合

    @ApiModelProperty("用来记录用户的userId 用于session操作")
    //用来记录用户的userId
    private Integer userId;

    @ApiModelProperty("用来记录用户的手机号，用于操作")
    //用来记录用户的手机号
    private String userPhone;

    @ApiModelProperty("登陆人的保险公司名称 存到seesion中用于操作的")
    //登陆人的保险公司名称
    private Integer insuranceCompanyId;

    public static UserResult build(Integer code, String msg) {
        return new UserResult(code, msg,null);
    }

    public UserResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public UserResult(){}
}
