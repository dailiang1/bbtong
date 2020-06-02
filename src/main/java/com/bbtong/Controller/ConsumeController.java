package com.bbtong.Controller;

import com.bbtong.Pojo.Consume;
import com.bbtong.Service.ConsumeService;
import com.bbtong.Util.ResultPage;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 消费卡申请表
 */
@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/consume")
public class ConsumeController {

    /**
     * 创建service层的实体，来进行数据操作
     */
    @Autowired
    private ConsumeService consumeService;

    /**
     * 用户提交消费卡的申请
     *
     * @param userId        用户的ID
     * @param consumeNumber 大家保险的保险单号
     * @return 戴辆
     */
    @ApiOperation(value = "提交消费卡申请", notes = "用户提交消费卡的申请", tags = "Submit", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "consumeNumber", value = "大家保险的保险单号", required = true, dataType = "String", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @PostMapping(value = "/submit", produces = "application/json")
    public @ResponseBody
    ResultPage Submit(Integer userId, String consumeNumber) {
        //创建Resultpage的实体来接受参数
        ResultPage resultPage = new ResultPage();
        if (userId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常,请稍后再试");
        } else if (consumeNumber == "" || consumeNumber == null) {
            resultPage.setCode(500);
            resultPage.setMessage("请输入正确的保险单号");
        } else {
            //创建消费卡申请表的实体类，来接受前端传来的参数进行操作
            Consume consume = new Consume();
            //接受是那个用户的用户ID
            consume.setUserId(userId);
            //接受提交的大家保险的保险单号
            consume.setConsumeNumber(consumeNumber);
            //获取当前的时间，将当前时间存到数据库中
            Date now = new Date();
            //设置时间的编码格式
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //将时间存到实体类中
            consume.setConsumeTime(dateFormat.format(now));
            //将数据传到service层中去
            resultPage = consumeService.Submit(consume);
        }
        return resultPage;
    }

    /**
     * 用户查询自己对应状态的消费卡审请
     *
     * @param userId       用户的ID
     * @param index        当前的页数
     * @param consumeState 当前是什么状态(0表示未审核，1表示已审核)
     * @return 戴辆
     */
    @ApiOperation(value = "查询消费卡申请状态", notes = "用户查询自己对应状态的消费卡申请", tags = "Query", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前是多少页(默认是多少)", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "consumeState", value = "当前是什么状态(0表示未审核，1表示已审核)", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/query", produces = "application/json")
    public @ResponseBody
    ResultPage Query(Integer userId, Integer index, Integer consumeState) {
        if (index == null) {//如果没有传入页数，就默认访问第一页
            index = 1;
        }
        if (consumeState == null) {//如果没有传入访问什么数据，就默认访问待审核的数据
            consumeState = 0;
        }
        //用来接受返回数据的实体
        ResultPage resultPage = new ResultPage();
        if (userId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常，请稍后尝试");
        } else {
            resultPage = consumeService.Query(userId, index, consumeState);
        }
        return resultPage;
    }

    /**
     * 管理员审核消费卡申请的订单
     *
     * @param index        当前的页数
     * @param consumeState 当前查询的状态(0表示为未审核，1表示已审核)
     * @return
     */
    @ApiOperation(value = "管理员审核消费卡申请的订单", notes = "管理员审核消费卡申请的订单的", tags = "SelectQuery", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "index", value = "当前是多少页(默认是多少)", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "consumeState", value = "当前是什么状态(0表示未审核，1表示已审核)", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/selectquery", produces = "application/json")
    public @ResponseBody
    ResultPage SelectQuery(Integer index, Integer consumeState) {
        //用来接受返回数据的实体
        ResultPage resultPage = new ResultPage();
        if (index == null || index == 0) {//如果没有传入页数，就默认访问第一页
            index = 1;
        }
        if (consumeState == null || consumeState == 0) {//如果没有传入访问什么数据，就默认访问待审核的数据
            consumeState = 0;
        }
        resultPage = consumeService.SelectQuery(index, consumeState);
        return resultPage;
    }
}
