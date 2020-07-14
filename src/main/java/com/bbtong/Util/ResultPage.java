package com.bbtong.Util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/***
 * 用来记录分页查询的实体类
 */

@Data
@ApiModel
public class ResultPage {
    //当前页码
    @ApiModelProperty("表示当前的页码是多少页")
    private Integer index;

    //每页数量
    @ApiModelProperty("表示每一页显示的数量是多少")
    private Integer size;

    //总条数
    @ApiModelProperty("表示总的条数是多少")
    private Integer count;

    //总页数
    @ApiModelProperty("表示总的页数")
    private Integer pageCount;

    //表示当前的状态(200表示成功，300表示异常，400表示失败，500表示错误)
    @ApiModelProperty(value = "表示返回的状态,通过返回的状态来判断结果",example = "200,300,500")
    private Integer code;

    //用来存储返回的结果或者数据
    @ApiModelProperty("对返回的code进行文字修饰,以及文字的说明")
    private String message;

    //返回结果集，单条
    @ApiModelProperty("用来存储返回的数据")
    private Object data;

    //返回结果集，集合
    @ApiModelProperty("用来存储返回的数据数组")
    private List<Object> datas;

}
