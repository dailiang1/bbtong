package com.bbtong.Util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class AdminResult {

    @ApiModelProperty("表示成功的状态")
    //判断执行编码,200表示成功，300表示异常，400表示失败，500表示数据问题
    private Integer code;

    @ApiModelProperty("对于返回的状态，文字说明")
    //对于返回的状态，文字说明
    private String message;

    @ApiModelProperty("表示总的委托条数")
    //表示总的委托条数
    private Integer entrustCount;

    @ApiModelProperty("表示总的委托人数")
    //表示总的委托人数
    private Integer userCount;

    @ApiModelProperty("表示当天注册的委托人数")
    //表示当天注册的委托人数
    private Integer newUserCount;

    @ApiModelProperty("表示当天发布的委托数")
    //表示当天发布的委托数
    private Integer newEntrustCount;
}
