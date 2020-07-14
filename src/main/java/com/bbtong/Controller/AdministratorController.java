package com.bbtong.Controller;


import com.bbtong.Base.AdminUser;
import com.bbtong.Base.UserCheck;
import com.bbtong.Pojo.User;
import com.bbtong.Service.AdministratorService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 管理员的方法
 */

@CrossOrigin(allowCredentials = "true")
@RequestMapping(value = "/admin")
public class AdministratorController {

    /**
     * 创建service层的实体
     */
    @Autowired
    private AdministratorService administratorService;

    /**
     * 获取所有用户的方法，根据userId 来进行排序
     *
     * @param adminUser 里面存储着参数 来进行操作
     */
    @ApiOperation(value = "获取用户的方法", notes = "获取用户的方法", tags = "getAllUser", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户的姓名", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "userPhone", value = "用户的电话", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "insuranceCompanyId", value = "保险公司的id", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "注册开始的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "注册结束的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前的页数", required = false, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
    })
    @GetMapping(value = "/getalluser", produces = "application/json")
    public @ResponseBody
    ResultPage getAllUser(AdminUser adminUser) {
        //创建ResultPage的实体来接受数据
        ResultPage resultPage = new ResultPage();
        //查询所有用户的方法
        resultPage = administratorService.getAllUser(adminUser);
        return resultPage;
    }

    /**
     * 查询对应用户个人信息的方法
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @ApiOperation(value = "查询对应用户个人信息的方法", notes = "查询对应用户的个人信息", tags = "getUser", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 500, message = "颞部错误", response = Result.class),
    })
    @GetMapping(value = "/getUser", produces = "application/json")
    public @ResponseBody
    Result getUser(Integer userId, Integer adminRoleId) {
        //创建返回数据的实体类
        Result result = new Result();
        //判断userId是不是为空，如果userId为空的话，则说明请求问问题
        if (userId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //判断管理员的权限是否够，如果权限id大于3的话，则说明权限不够。
        if (adminRoleId > 3) {
            result.setCode(200);
            result.setMessage("你当前的权限不够");
            return result;
        }

        //接受service层传来的数据
        result = administratorService.GetUser(userId);
        return result;
    }

    /**
     * 查询什么时间段注册的用户(默认是查询当天的用户)
     *
     * @param startTime 起始时间
     * @param endTime   结束时间
     * @param index     当前的页数
     * @return 戴辆
     */
    @ApiOperation(value = "查询什么时间段注册的用户", notes = "查询注册的用户(默认查询的是当天注册的用户)", tags = "getNewUser", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startTime", value = "起始的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前的页数", required = false, dataType = "int", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
    })
    @GetMapping(value = "/getnewuser", produces = "application/json")
    public @ResponseBody
    ResultPage getNewUser(String startTime, String endTime, Integer index) {
        //创建实体类来接收和操作数据
        ResultPage resultPage = new ResultPage();
        //创建函数获取当前的时间
        Calendar cal = Calendar.getInstance();
        //判断开始的时间是不是为空
        if (startTime == null) {
            //将时间设置成当前日期 0:0::0
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
            //获取当前的时间
            Date beginOfDate = cal.getTime();
            //设置时间的格式为yyyy-MM-dd HH:mm:ss
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将设置的时间赋值给startTime
            startTime = formatter.format(beginOfDate);
        }
        //判断结束的时间是不是为空
        if (endTime == null) {
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) + 1, 0, 0, 0);
            //获取当前的时间
            Date beginOfDate = cal.getTime();
            //设置时间的格式为yyyy-MM-dd HH:mm:ss
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将设置的时间赋值给startTime
            endTime = formatter.format(beginOfDate);
        }
        //接受serviceImpl返回的实体
        resultPage = administratorService.GetNewUser(startTime, endTime, index);
        return resultPage;
    }


    /**
     * 审核用户的一些基本信息
     *
     * @param userCheck 审核信息的实体，详情请查看UserCheck表
     * @return 戴辆
     */
    @ApiOperation(value = "审核用户的一些基本信息", notes = "审核修改用户的一些信息", tags = "postUserCheck", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "intentionState", value = "表示当前委托人是否可以。选择有意向委托(0表示可以，1表示不可以)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "testState", value = "表示第一次测试的时候，注册的人是否审核了(0为待审核，1已审核)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userTietong", value = "表示保险代理人的身份，0大家保险铁通员工，1大家保险员工，2其他保险员工", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userOrderState", value = "用来判断他当前是否还能接单(0表示可以接单，1表示不可以)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userState", value = "用户的状态(0表示没有实名，1表示待审核，2表示审核没通过，3表示实名认证了)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userMemberState", value = "通年费的状态(1,表示已经开通。0表示没有开通)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminId", value = "管理员表的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminMessageRemark", value = "管理员对于操作的备注", required = true, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 500, message = "颞部错误", response = Result.class),
    })
    @GetMapping(value = "/postusercheck", produces = "application/json")
    public @ResponseBody
    Result postUserCheck(@RequestBody UserCheck userCheck) {
        //创建对应的实体类来接受数据
        Result result = new Result();
        //判断一些数据是否存在
        if (null == userCheck.getUserId() || null == userCheck.getAdminId()) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //判断管理的权限是不是合格
        if (userCheck.getAdminRoleId() > 3) {
            result.setCode(200);
            result.setMessage("权限不够");
            return result;
        }
        //获取当前的时间，将时间存到实体中
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        userCheck.setAdminMessageTime(dateFormat.format(new Date()));// new Date()为获取当前系统时间
        if (userCheck.getUserMemberState() != null && userCheck.getUserOrderState() == 1) {
            //获取当前的时间，将当前时间存到数据库中
            Date now = new Date();
            //设置时间的编码格式
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将会员开始的时间存到实体类中
            userCheck.setUserMemberBegin(format.format(now));

            //创建Calendar实例
            Calendar cal = Calendar.getInstance();
            //将时间设置成用户录入的时间
            cal.setTime(now);
            //在当前的时间上加上一年
            cal.add(Calendar.YEAR, 1);
            //将一年后的时间写入到数据对应的字段中
            userCheck.setUserMemberFinish(format.format(cal.getTime()));
        }
        //接受serviceIpml传来的数据
        result = administratorService.postUserCheck(userCheck);
        return result;
    }

    /**
     * 管理员 处理消费卡申请
     *
     * @param consumeId 消费卡申请表的id
     * @param adminId   管理员的id
     * @param index     用来表示处理的是什么，index=1 表示成功，index=2表示信息有误
     * @return 戴辆
     */
    @ApiOperation(value = "管理员处理 消费开申请", notes = "管理员处理 消费卡申请", tags = "getCheckConsume", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "consumeId", value = "申请消费卡的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "用来表示处理的是什么，index=1 表示成功，index=2表示信息有误", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 500, message = "颞部错误", response = Result.class),
    })
    @GetMapping(value = "/getcheckconsume", produces = "application/json")
    public @ResponseBody
    Result getCheckConsume(Integer consumeId, Integer adminId, Integer index) {
        //创建对应的实体类来存储和接受数据
        Result result = new Result();
        //判断数据是否正确 当消费卡申请id不存在 或者 adminRoleId的id！=1的时候，并且index为null的时候。则说明数据异常或者异常访问
        if (consumeId == null || index == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //接受service层传来的数据
        result = administratorService.getCheckConsume(consumeId, adminId, index);
        return result;
    }

    /**
     * 管理员 处理和豆申请
     *
     * @param beansId 和豆申请的id
     * @param adminId 管理员的id
     * @param index   1表示成功， 2表示信息有误
     * @return 戴辆
     */
    @ApiOperation(value = "管理员 处理和豆申请", notes = "管理员处理和豆申请", tags = "getCheckBeans", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "beansId", value = "申请和豆的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "用来表示处理的是什么，index=1 表示成功，index=2表示信息有误", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 500, message = "颞部错误", response = Result.class),
    })
    @GetMapping(value = "/getcheckbeans", produces = "application/json")
    public @ResponseBody
    Result getCheckBeans(Integer beansId, Integer adminId, Integer index) {
        //创建接收和查询对应的数据的实体
        Result result = new Result();
        //判断和豆申请的id和管理员的id还有操作的结果是否存在
        if (beansId == null || adminId == null || index == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //接受service层传来的数据
        result = administratorService.getCheckBeans(beansId, adminId, index);
        return result;
    }

    //委托的监控

    /**
     * 管理员 查询总的委托数
     *
     * @param adminId 管理员的id 用来判断访问正不正确
     * @return 戴辆
     */
    public @ResponseBody
    ResultPage getEntrustCount(Integer adminId) {
        //创建Result实体，来接受service层传来数据
        ResultPage resultPage = new ResultPage();
        //判断管理员id是否存在，如果不存在就说明异常访问
        if (adminId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("异常访问");
            return resultPage;
        }
        //接受service层传来的数据
        resultPage=administratorService.getEntrustCount();
        return resultPage;
    }
}
