package com.bbtong.Util;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    private Integer code;
    //判断执行编码,200表示成功，400表示失败，500表示异常

    private String message;
    //用来存储返回的结果或者数据

    private Object data;
    //返回结果集，单条

    private List<Object> datas;
    //返回结果集，集合
}
