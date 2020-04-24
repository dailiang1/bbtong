package com.bbtong.Util;

import lombok.Data;

import java.util.List;

/***
 * 用来记录分页查询的实体类
 */

@Data
public class ResultPage {
    //当前页码
    private Integer index;

    //每页数量
    private Integer size;

    //总条数
    private Integer count;

    //总页数
    private Integer pageCount;

    //表示当前的状态(200表示成功，300表示异常，400表示失败，500表示错误)
    private Integer code;

    //用来存储返回的结果或者数据
    private String message;

    //返回结果集，单条
    private Object data;

    //返回结果集，集合
    private List<Object> datas;

}
