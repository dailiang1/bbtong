package com.bbtong.Controller;


import com.alibaba.fastjson.JSON;
import com.bbtong.Base.AdminUser;
import com.bbtong.Base.UserCheck;
import com.bbtong.Pojo.Admin;
import com.bbtong.Service.AdministratorService;
import com.bbtong.Util.LoginResult;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.bbtong.Util.AdminResult;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.*;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 管理员的方法
 */

@CrossOrigin(allowCredentials = "true")
@Controller
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
    @ApiOperation(value = "注册的时候 管理员 查询对应用户个人信息的方法", notes = "查询对应用户的个人信息", tags = "getUser", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminRoleId", value = "管理员权限的id", required = true, dataType = "int", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
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
     * 查询什么时间段注册的用户(默认是查询所有的用户)
     *
     * @param adminId            管理员的id
     * @param startTime          起始时间
     * @param endTime            结束时间
     * @param index              当前的页数
     * @param insuranceCompanyId 保险公司的id
     * @param userName           用户姓名
     * @param userPhone          用户电话
     * @param userState          表示对应的状态，加载对应的数据(1表示待审核，2表示审核未通过，3审核通过)
     * @return 戴辆
     */
    @ApiOperation(value = "查询什么时间段注册的用户", notes = "查询注册的用户(默认查询的是所有的用户)", tags = "getNewUser", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "起始的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前的页数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userState", value = "表示对应的状态，加载对应的数据(1表示待审核，2表示审核未通过，3审核通过)", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userName", value = "用户姓名", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "userPhone", value = "用户电话", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "insuranceCompanyId", value = "保险公司的id", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
    })
    @GetMapping(value = "/getnewuser", produces = "application/json")
    public @ResponseBody
    ResultPage getNewUser(Integer adminId, String startTime, String endTime, Integer index, Integer userState, String userName, Integer insuranceCompanyId, String userPhone) {
        //创建实体类来接收和操作数据
        ResultPage resultPage = new ResultPage();
        //判断管理员id，是不是为空，如果管理员id为空的话，则说明异常访问。
        if (adminId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常");
            return resultPage;
        }
        //判断要执行的选项在不在，如果为空的话，就将其赋值成1(代表待审核)
        if (userState == null) {
            userState = 1;
        }
        //判断页数是不是为空，如果页数为空的话，则将页数赋值为1
        if (index == null) {
            index = 1;
        }
        //接受serviceImpl返回的实体
        resultPage = administratorService.GetNewUser(adminId, startTime, endTime, index, userState, userName, insuranceCompanyId, userPhone);
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

    /**
     * 管理员 查询总的委托数,总的委托人数，当天注册的人数，当天发布的委托数
     *
     * @param adminId 管理员的id 用来判断访问正不正确
     * @return 戴辆
     */
    @ApiOperation(value = "管理员 查询总的委托数,总的委托人数，当天注册的人数，当天发布的委托数", notes = "管理员查询对应四个数据的方法", tags = "getAdminData", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = AdminResult.class),
            @ApiResponse(code = 300, message = "当前异常", response = AdminResult.class),
            @ApiResponse(code = 400, message = "失败", response = AdminResult.class),
            @ApiResponse(code = 500, message = "内部错误", response = AdminResult.class),
    })
    @GetMapping(value = "/getadmindata", produces = "application/json")
    public @ResponseBody
    AdminResult getAdminData(Integer adminId) {
        //创建adminResult的实体来接受service返回的数据
        AdminResult adminResult = new AdminResult();
        //判断管理员id是否存在，如果不存在就说明异常访问
        if (adminId == null) {
            adminResult.setCode(300);
            adminResult.setMessage("异常访问");
            return adminResult;
        }
        //接受service层传来的数据
        adminResult = administratorService.getAdminData();
        return adminResult;
    }

    /**
     * 管理员处理注册用户的信息
     *
     * @param adminId   管理员id
     * @param userId    用户id
     * @param testState 确认信息(0待审核，1已审核，2信息错误)
     * @param userState 用户的状态(0没有实名，1待审核，2审核没通过，3实名认证了)
     * @return 戴辆
     */
    @ApiOperation(value = "管理员处理注册用户的信息", notes = "管理员处理用户注册的方法(通过testState和userState来判断)", tags = "getLoginCheck", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "testState", value = "确认信息(0待审核，1已审核，2信息错误)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userState", value = "用户的状态(0没有实名，1待审核，2审核没通过，3实名认证了)", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getlogincheck", produces = "application/json")
    public @ResponseBody
    Result getLoginCheck(Integer adminId, Integer userId, Integer testState, Integer userState) {
        //创建对应的实体类来操作数据
        Result result = new Result();
        //判断testState是否为空，如果为空的话，就将其为1
        if (testState == null) {
            testState = 1;
        }
        //判断管理员id和用户id是否存在,如果不存在的话，则说明数据异常
        if (adminId == null || userId == null || userState == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //接受serviceImpl返回的数据
        result = administratorService.getLoginCheck(adminId, userId, testState, userState);
        return result;
    }

    /**
     * 超级管理员查看和修改用户信息
     *
     * @param userId  用户id
     * @param adminId 管理员的id
     * @return 戴辆
     */
    @ApiOperation(value = "超级管理员看用户的个人信息", notes = "超级管理员查看用户信息", tags = "getCheck", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminId", value = "管理员id", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getcheck", produces = "application/json")
    public @ResponseBody
    Result getCheck(Integer userId, Integer adminId) {
        //创建Result实体来返回数据
        Result result = new Result();
        //第一步 判断数据存不存在
        if (userId == null || adminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第二步 判断管理员的权限是不是够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        //判断用户权限的id是不是为1，如果为1的。则说明这个管理员信息没问题
        if (adminRoleId == 1) {
            //获取serviceImpl层传来的数据
            result = administratorService.getCheck(userId);
        } else {
            result.setCode(300);
            //判断返回的数据是不是10001，或者其他事其他的。用三目运算符来返回的对应的数据
            result.setMessage(adminRoleId == 10001 ? "管理员不存在" : "管理员权限不够");
            return result;
        }
        return result;
    }

    /**
     * 超级管理员修改用户的信息(在用户信息出现错误的情况下)
     *
     * @param userId          用户的id
     * @param testState       确认信息(做成一个捆绑)
     * @param userState       实名的状态 (0 表示没有实名，1表示待审核，2审核未通过，3实名认证)
     * @param userMenberState 年费的状态 ( 0表示没有开通，1表示已经开通了)
     * @param userTietong     身份的选择 (0大家保险铁通员工，1大家保险员工，2非大家保险员工)
     * @param intentionState  意向委托 (表示当前委托人是否可以 选择有意向(0表示可以，1表示不可以)
     * @param userOrderState  能否接单 (用来判断他当前是否还能接单 0表示可以接单 1表示不可以)
     * @param adminId         表示管理员的id(用来判断管理员是否有这个权限)
     * @return 戴辆
     */
    @ApiOperation(value = "超级管理员修改用户的信息 保存", notes = "超级管理员修改用户的信息 并且保存", tags = "putUser", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "testState", value = "确认信息(做成一个捆绑)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userState", value = "实名的状态 (0 表示没有实名，1表示待审核，2审核未通过，3实名认证)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userMenberState", value = "年费的状态 ( 0表示没有开通，1表示已经开通了)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userTietong", value = "身份的选择 (0大家保险铁通员工，1大家保险员工，2非大家保险员工)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "intentionState", value = "意向委托 (表示当前委托人是否可以 选择有意向(0表示可以，1表示不可以)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userOrderState", value = "能否接单 (用来判断他当前是否还能接单 0表示可以接单 1表示不可以)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminId", value = "表示管理员的id(用来判断管理员是否有这个权限)", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/putuser", produces = "application/json")
    public @ResponseBody
    Result putUser(Integer userId, Integer testState, Integer userState, Integer userMenberState, Integer userTietong, Integer intentionState, Integer userOrderState, Integer adminId) {
        //创建对应的Result实体来接受数据
        Result result = new Result();
        //第一步 先判断用户的id和管理员的id 是不是存在，如果不存在则说明数据异常
        if (userId == null || adminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第二步 判断管理员的权限是不是够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        //判断用户权限的id是不是为1，如果为1的。则说明这个管理员信息没问题
        if (adminRoleId == 1) {
            //确认用户的信息，判断他是不是为null,如果为空的话，就将他赋值为1，表示确认信息
            if (testState == null) {
                testState = 1;
            }
            //获取serviceImpl层传来的数据
            result = administratorService.putUser(userId, testState, userState, userMenberState, userTietong, intentionState, userOrderState, adminId);
        } else {
            result.setCode(300);
            //判断返回的数据是不是10001，或者其他事其他的。用三目运算符来返回的对应的数据
            result.setMessage(adminRoleId == 10001 ? "管理员不存在" : "管理员权限不够");
            return result;
        }
        return result;
    }

    /**
     * 管理员 查询所有的委托
     *
     * @param adminId 管理员的id
     * @param index   当前的页数
     * @return 戴辆
     */
    @GetMapping(value = "/getentrust")
    public @ResponseBody
    ResultPage getEntrust(Integer adminId, Integer index) {
        //创建Result的实体类来接受数据
        ResultPage resultPage = new ResultPage();
        //判断管理员的id，有没有获取的到数据。如果为空的话，则数据数据异常
        if (adminId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常");
            return resultPage;
        }
        //判断index有没有数据，如果index为null的话，就给其赋值为
        if (index == null || index < 1) {
            index = 1;
        }
        //接受serviceImpl的数据
        resultPage = administratorService.getEntrust(adminId, index);
        return resultPage;
    }

    /**
     * 管理员查看对应委托 详情的方法
     *
     * @param entrustId 委托的id
     * @param adminId   管理员的id
     * @return 戴辆
     */
    @ApiOperation(value = "管理员查看对应的委托 详情的方法", notes = "管理员查看对应委托详情的的方法", tags = "getEntrustId", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "entrustId", value = "委托的id", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getentrustId")
    public @ResponseBody
    Result getEntrustId(Integer entrustId, Integer adminId) {
        //创建对应的实体类 来接受数据
        Result result = new Result();
        //先判断委托的id和管理员的id是否存在
        if (entrustId == null || adminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第一步 先判断管理员权限是否足够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        //判断管理员的权限是否足够
        if (adminRoleId > 3) {
            result.setCode(300);
            result.setMessage(adminRoleId == 10001 ? "用户不存在" : "管理员权限不够");
            return result;
        }
        //第二步 查询委托对应的信息
        result = administratorService.getEntrustId(entrustId, adminId);
        return result;
    }

    /**
     * 管理员 查询自己的信息
     *
     * @param adminId 管理员的id
     * @return 戴辆
     */
    @ApiOperation(value = "管理员 查询自己的信息", notes = "管理员 查询自己信息的方法", tags = "getAdminParticulars", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getadminparticulars")
    public @ResponseBody
    Result getAdminParticulars(Integer adminId) {
        //创建Result的实体类 来接受对应的数据
        Result result = new Result();
        //第一步 判断管理员的id 有没有获取到
        if (adminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
        }
        //接受service层传来的数据
        result = administratorService.getAdminParticulars(adminId);
        return result;
    }

    /**
     * 管理员 修改自己的个人信息
     *
     * @param adminId       管理员的id
     * @param adminName     管理员的姓名
     * @param adminAccount  管理员的账号
     * @param adminPhone    管理员的电话
     * @param adminPassword 管理员的密码
     * @param newPassword   管理员的新密码
     * @return 戴辆
     */
    @ApiOperation(value = "管理员 修改自己的个人信息", notes = "管理员 修改自己个人信息的方法", tags = "putAdminParticulars", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminName", value = "管理员的姓名", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminAccount", value = "管理员的账号", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPhone", value = "管理员的电话", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPassword", value = "管理员的密码", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "newPassword", value = "管理员的新密码", required = false, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/putadminparticulars")
    public @ResponseBody
    Result putAdminParticulars(Integer adminId, String adminName, String adminAccount, String adminPhone, String adminPassword, String newPassword) {
        //创建Result的实体类 来接受和存储数据
        Result result = new Result();
        //第一步 判断管理员id是不是为空 如果为空的话 则说明数据有问题
        if (adminId == null) {
            result.setCode(300);
            result.setMessage("异常访问");
            return result;
        }
        //接收service层传来的数据
        result = administratorService.putAdminParticulars(adminId, adminName, adminAccount, adminPhone, adminPassword, newPassword);
        return result;
    }

    /**
     * 超级管理员 管理管理员(默认查看所有管理员)
     *
     * @param adminId      管理员id
     * @param adminRoleId  管理员的权限
     * @param index        当前的页数
     * @param adminName    管理员的姓名
     * @param adminPhone   管理员的电话
     * @param adminAccount 管理员的账号
     * @return 戴辆
     */
    @ApiOperation(value = "超级管理员 管理管理员(默认查看所有管理员)", notes = "超级管理员 管理管理员的的方法", tags = "getAdministration", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "超级管理管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminRoleId", value = "管理员的权限id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前的页数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminName", value = "管理员的姓名", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPhone", value = "管理员的电话", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminAccount", value = "管理员的账号", required = false, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getadministration")
    public @ResponseBody
    ResultPage getAdministration(Integer adminId, Integer adminRoleId, Integer index, String adminName, String adminPhone, String adminAccount) {
        //创建ResultPage的实体来接受参数
        ResultPage resultPage = new ResultPage();
        //判断数据是否合格 如果管理员id和管理员权限id为null 的话 就说明数据有问题
        if (adminId == null || adminRoleId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常");
            return resultPage;
        }
        //第一步 判断用户的权限和传进来的权限id是否一致
        int newAdminRoleId = administratorService.GetadminRoleId(adminId);
        //判断管理员的权限是不是为1 并且输入的权限id是不是为1
        if (newAdminRoleId == adminRoleId && adminRoleId == 1) {
            //接受serviceImpl传来的数据
            resultPage = administratorService.getAdministration(adminId, adminRoleId, index, adminName, adminPhone, adminAccount);
        } else {
            resultPage.setCode(300);
            resultPage.setMessage("异常访问");
            return resultPage;
        }
        return resultPage;
    }

    /**
     * 超级管理员 查询对应的 管理员的信息
     *
     * @param adminId    超级管理员的id
     * @param newAdminId 管理员的id
     * @return 戴辆
     */
    @ApiOperation(value = "超级管理员 查询对应的 管理员信息", notes = "超级管理员 查询对应的 管理员信息的方法", tags = "getAdministratorMessage", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "超级管理管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "newAdminId", value = "查询的管理员id", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getadministratormessage")
    public @ResponseBody
    Result getAdministratorMessage(Integer adminId, Integer newAdminId) {
        //创建Result的实体来接受数据
        Result result = new Result();
        //判断超级管理员id 和管理员id是不是为空
        if (adminId == null || newAdminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第一步 判断用户的权限和传进来的权限id是否一致
        int newAdminRoleId = administratorService.GetadminRoleId(adminId);
        //判断管理员的权限是不是为1 并且输入的权限id是不是为1
        if (newAdminRoleId == 1) {
            result = administratorService.getAdministratorMessage(adminId, newAdminId);
        } else {
            result.setCode(300);
            result.setMessage("异常访问");
            return result;
        }
        return result;
    }

    /**
     * 超级管理员 修改管理员的信息
     *
     * @param adminId          超级管理员的id
     * @param newAdminId       管理员的id
     * @param adminName        管理员的姓名
     * @param adminPhone       管理员的电话
     * @param adminPassword    管理员的新密码
     * @param newAdminPassword 管理员确认新密码
     * @param adminRoleId      管理员的权限
     * @param adminState       管理员的账号是否冻结
     * @param adminAccount     管理员的账号
     * @return 戴辆
     */
    @ApiOperation(value = "超级管理员 修改管理员的信息", notes = "超级管理员  修改管理员信息的方法", tags = "putAdministratorMessage", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "超级管理管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "newAdminId", value = "修改的管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminRoleId", value = "管理员的权限id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminPassword", value = "新密码", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "newAdminPassword", value = "确认密码", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminName", value = "管理员的姓名", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPhone", value = "管理员的电话", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminAccount", value = "管理员的账号", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminState", value = "账号的状态", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/putadministratormessage", produces = "application/json")
    public @ResponseBody
    Result putAdministratorMessage(Integer adminId, Integer newAdminId, String adminName, String adminPhone, String adminPassword, String newAdminPassword, Integer adminRoleId, Integer adminState, String adminAccount) {
        //创建Result的实体来操作数据
        Result result = new Result();
        //第一步 先判断超级管理员的id 和管理员的id是否存在 如果不存在的话 就说明数据有问题
        if (adminId == null || newAdminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第二步 判断密码是否一致 如果密码存在的话  就比较两个数据一致
        if (adminPassword != null) {
            //判断确认密码是否为null，如果为null的话 就说明数据有问题
            if (newAdminPassword == null) {
                result.setCode(300);
                result.setMessage("请输入确认密码");
                return result;
            } else {
                //判断两次输入的密码的是否一致
                if (adminPassword.equals(newAdminPassword)) {
                    //将密码进行md5加密
                    adminPassword = DigestUtils.md5DigestAsHex(adminPassword.getBytes());
                } else {
                    result.setCode(300);
                    result.setMessage("两次密码不一致");
                }
            }
        }
        //第三步 判断管理员的权限是否够
        int newAdminRoleId = administratorService.GetadminRoleId(adminId);
        //判断管理员的权限是不是为1 并且输入的权限id是不是为1
        if (newAdminRoleId == 1) {
            result = administratorService.putAdministratorMessage(adminId, newAdminId, adminName, adminPhone, adminPassword, newAdminPassword, adminRoleId, adminState, adminAccount);
        } else {
            result.setCode(300);
            result.setMessage("异常访问");
            return result;
        }
        return result;
    }

    /**
     * 注册管理员
     *
     * @param admin 里面存储着 注册管理员的数据
     * @return 戴辆
     */
    @ApiOperation(value = "注册管理员", notes = "超级管理员 注册管理员的方法", tags = "postAdmin", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "超级管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "adminName", value = "管理员的姓名", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminAccount", value = "管理员的账号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPhone", value = "管理员的电话", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPassword", value = "管理员的密码", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminRoleId", value = "权限的id", required = true, dataType = "int", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @PostMapping(value = "/postadmin", produces = "application/json")
    public @ResponseBody
    Result postAdmin(@RequestParam("admin") Admin admin) {
        //创建Result的实体来操作数据
        Result result = new Result();
        //判断admin中的数据 是不是为空
        if (admin.getAdminId() == null || admin.getAdminName() == null || admin.getAdminPhone() == null || admin.getAdminAccount() == null || admin.getAdminPassword() == null || admin.getAdminRoleId() == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第一步 判断管理员的权限是否够
        int newAdminRoleId = administratorService.GetadminRoleId(admin.getAdminId());
        //判断管理员的权限是不是为1 并且输入的权限id是不是为1
        if (newAdminRoleId == 1) {
            //接受service层的数据
            result = administratorService.postAdmin(admin);
        } else {
            result.setCode(300);
            result.setMessage("异常访问");
            return result;
        }
        return result;
    }

    /**
     * 管理员登录的方法
     *
     * @param adminAccount  管理员的账号
     * @param adminPassword 管理员的密码
     * @param session
     * @param response
     * @param request
     * @return 戴辆
     */
    @ApiOperation(value = "管理员登录的方法", notes = "管理员登录的方法", tags = "getAdminLogin", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminAccount", value = "管理员的账号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "adminPassword", value = "管理员的密码", required = true, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = LoginResult.class),
            @ApiResponse(code = 300, message = "当前异常", response = LoginResult.class),
            @ApiResponse(code = 400, message = "失败", response = LoginResult.class),
            @ApiResponse(code = 500, message = "内部错误", response = LoginResult.class),
    })
    @GetMapping(value = "/getadminlogin", produces = "application/json")
    public @ResponseBody
    LoginResult getAdminLogin(String adminAccount, String adminPassword, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        //创建Result的实体类来操作数据
        LoginResult loginResult = new LoginResult();
        //第一步 先判断管理员账号和密码是否存在
        if (adminAccount == null || adminPassword == null) {
            loginResult.setCode(300);
            loginResult.setMessage("当前异常");
            return loginResult;
        }
        //接受service层返回的数据
        loginResult = administratorService.getAdminLogin(adminAccount, adminPassword);
        //判断返回的结果 如果状态为200的话 则说明登录成功 将数据存到cookie中
        if (loginResult.getCode() == 200) {
            //创建一个数据来接受后端的数据
            String userName = loginResult.getAdminId() + "#" + loginResult.getAdminRoleId();
            //创建一个cookie对象,将数据存到里面
            Cookie cookie = new Cookie("adminName", JSON.toJSONString(userName));
            //设置cookie的过期时间为七天之后过期
            cookie.setMaxAge(7 * 24 * 60 * 60); // 7天过期
            cookie.setPath("/");
            //将cookie对象加入response响应
            response.addCookie(cookie);
            //将管理员的adminId存到session中
            session.setAttribute("adminId", loginResult.getAdminId());
            //将管理员的权限Id adminRoleId存到seesion中
            session.setAttribute("adminRoleId", loginResult.getAdminRoleId());
            //设置session过期的时间 这为12个小时过期
            session.setMaxInactiveInterval(60 * 60 * 12);
        }
        return loginResult;
    }

    /**
     * 管理员退出登录
     *
     * @param response
     * @param request
     * @return 戴辆
     */
    @ApiOperation(value = "管理员退出登录", notes = "管理员退出登录的方法", tags = "Exit", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "当前异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/exit", produces = "application/json")
    public @ResponseBody
    Result Exit(HttpServletResponse response, HttpServletRequest request) {
        //创建Result的实体来操作数据
        Result result = new Result();
        try {
            Cookie cookie = new Cookie("adminName", null);//cookie名字要相同
            cookie.setMaxAge(0); //将cookie的时间设置成0
            cookie.setPath("/");  // 相同路径
            response.addCookie(cookie);//将新的cookie写到response中
            result.setCode(200);
            result.setMessage("成功");
        } catch (Exception e) {
            result.setCode(400);
            result.setMessage("失败");
        }
        return result;
    }
}
