package com.bbtong.Util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserResult {
    @ApiModelProperty("表示成功的状态")
    /**
     *
     */
    private Integer code;
    //判断执行编码,200表示成功,205表示新用户待注册,300表示异常，400表示失败，500表示数据问题

    @ApiModelProperty("对于返回的状态，文字说明")
    private String message;
    //用来存储返回的结果或者数据

    @ApiModelProperty("储存返回的数据，json格式")
    private Object data;
    //返回结果集，单条

    @ApiModelProperty("储存返回的数组List数据")
    private List<Object> datas;
    //返回结果集，集合
}
