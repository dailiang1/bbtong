package com.bbtong.Util;

import lombok.Data;

import java.util.List;

/**
 * 用来操作对应的实体类的信息
 */

@Data
public class ResultHave {
    /**
     * 判断执行编码
     * 200 表示成功
     * 300 表示异常
     * 400 表示失败
     * 500 表示错误
     * 100001表示没有开通年费
     * 100002表示诚信不够
     * 100003表示已经接单
     * 100004表示没有意向的机会
     * 100005表示没有实名
     * 100006表示实名待审核
     * 100007表示实名审核没有通过
     * 100008表示没有同意同意委托公约
     * 100009当前已经意向了
     * 100010出现未知错误
     * 100011非法访问
     */
    private Integer code;

    private String message;
    //用来存储返回的结果或者数据

    private Object data;
    //返回结果集，单条

    private List<Object> datas;
    //返回结果集，集合
}
