package com.bbtong.Controller;

import com.bbtong.Pojo.Beans;
import com.bbtong.Service.BeansService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.attribute.standard.MediaSize;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 和豆申请表
 */

@Controller
@RequestMapping("/beans")
public class BeansController {

    /**
     * 创建调用server层实体的方法
     */
    @Autowired
    private BeansService beansService;

    /**
     * 提交人车生活的卡号来申请和豆。
     *
     * @param userId     提交的用户ID
     * @param cardNumber 人车生活的卡号
     * @return 戴辆
     */
    @ApiOperation(value = "提交人车生活卡号来申请和豆", notes = "用户提交人车生活卡号来申请和豆", tags = "Submit", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "提交的用户ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "cardNumber", value = "人车生活的卡号", required = true, dataType = "String", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @PostMapping(value = "/submit", produces = "application/json")
    public @ResponseBody
    Result Submit(Integer userId, String cardNumber) {
        //创建接收返回参数的实体类
        Result result = new Result();
        if (userId == null) {
            result.setCode(300);
            result.setMessage("当前异常，请稍后尝试");
        } else if (cardNumber == "" || cardNumber == null) {//判断他有没有输入人车生活卡号，并且判断输入是否正确
            result.setCode(500);
            result.setMessage("请输入正确的值");
        } else {
            //去掉前后的双引号,以及去掉前后的空格
            cardNumber = cardNumber.replace("\"", "").trim();
            //创建和豆申请的实体
            Beans beans = new Beans();
            //获取当前的时间，将当前时间存到数据库中
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //将时间存到实体类中
            beans.setBeansTime(dateFormat.format(now));
            //将User_Id存到实体类中
            beans.setUserId(userId);
            //将card_Number存到实体类中
            beans.setCardNumber(cardNumber);
            result = beansService.Submit(beans);
        }
        return result;
    }

    /**
     * 用户查询人车生活卡是否审核，派发了和豆
     *
     * @param userId     用户的ID(是那个用户查询)
     * @param index      用来记录当前页的页数
     * @param beansState 用来查询对应状态的数据
     * @return 戴辆
     */
    @ApiOperation(value = "查询人车审核卡是否审核了，默认查询没有审核的", notes = "用户查询人车生活卡是否审核，派发了和豆", tags = "Query", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID(是那个用户查询)", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "用来记录当前页的页数(如果没有传入的话，就是默认为第一页)", required = false, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "beansState", value = "用来查询对应状态的数据(如果没有传入的话，就默查询待审核数据)", required = false, dataType = "Integer", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/query", produces = "application/json")
    public @ResponseBody
    ResultPage Query(Integer userId, Integer index, Integer beansState) {
        if (index == null || index == 0) {//如果没有传入页数，就默认访问第一页
            index = 1;
        }
        if (beansState == null || beansState == 0) {//如果没有传入访问什么数据，就默认访问待审核的数据
            beansState = 0;
        }
        //用来接受返回数据的实体
        ResultPage resultPage = new ResultPage();
        if (userId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常，请稍后尝试");
        } else {
            resultPage = beansService.Query(userId, index, beansState);
        }
        return resultPage;
    }

    /**
     * 管理人员审核或查看哪些审核了，
     *
     * @param index      当前的页数
     * @param beansState 当前的状态(已审核，未审核)
     *                   戴辆
     */
    @ApiOperation(value = "管理人员审核或查看哪些审核了(人车生活卡的方法)", notes = "管理员审核或查看审核过的数据", tags = "SelectQuery", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "index", value = "当前的页数(可以不传入值，默认是第一页)", required = false, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "beansState", value = "用来查询对应状态的数据(如果没有传入的话，就默查询待审核数据)", required = false, dataType = "Integer", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/selectquery", produces = "application/json")
    public @ResponseBody
    ResultPage SelectQuery(Integer index, Integer beansState) {
        //用来接受返回数据的实体
        ResultPage resultPage = new ResultPage();
        if (index == null || index == 0) {//如果没有传入页数，就默认访问第一页
            index = 1;
        }
        if (beansState == null || beansState == 0) {//如果没有传入访问什么数据，就默认访问待审核的数据
            beansState = 0;
        }
        resultPage = beansService.SelectQuery(index, beansState);
        return resultPage;
    }
}
