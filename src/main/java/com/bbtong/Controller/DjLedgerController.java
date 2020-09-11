package com.bbtong.Controller;

import com.bbtong.Base.dj.PostDaily;
import com.bbtong.Pojo.Admin;
import com.bbtong.Service.AdministratorService;
import com.bbtong.Service.DjLedgerService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.bbtong.custom.User;
import com.github.fge.uritemplate.vars.values.VariableValue;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.util.NativeLibLoader;

import java.lang.invoke.VolatileCallSite;

/**
 * 大家保险用户进行日结台账的方法
 */

@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping(value = "/djledger")
public class DjLedgerController {

    /**
     * 大家保险用户进行日结台账的方法
     */
    @Autowired
    private DjLedgerService djLedgerService;

    @Autowired
    private User user;

    /**
     * 创建adminService类的实体来判断管理员权限是否足够
     */
    @Autowired
    private AdministratorService administratorService;

    /**
     * 大家保险用户查询对应的台账记录
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @ApiOperation(value = "大家保险用户查询对应的台账记录", notes = "查询对应的台账记录", tags = "ledgerbook", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/ledgerbook", produces = "application/json")
    public @ResponseBody
    Result LedgerBook(Integer userId) {
        //创建对应的实体来接受和存储数据
        Result result = new Result();
        //判断userId是不是为null，如果为null话 表示访问异常 直接return程序
        if (userId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        result = djLedgerService.LedgerBook(userId);
        return result;
    }

    /**
     * 大家保险用户 查询自己的保单信息记录 默认是查询当天的
     *
     * @param userId    用户的id
     * @param startTime 起始的时间
     * @param endTime   结束的时间
     * @return 戴辆
     */
    @ApiOperation(value = "大家保险用户 查询对应时间段的保单记录", notes = "查询对应时间段的保单记录", tags = "getguaranteeMessage", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "起始的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束的时间", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "表示当前的页数", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/getguaranteemessage", produces = "application/json")
    public @ResponseBody
    ResultPage getguaranteeMessage(Integer userId, String startTime, String endTime, Integer index) {
        //创建对应接受数据的实体
        ResultPage resultPage = new ResultPage();
        //判断userId是否存在，如果不存在的话就说明数据有问题
        if (userId == null) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常");
            return resultPage;
        }
        //判断有没有获取到页数和页数是否为0
        if (index == null || index == 0) {
            index = 1;
        }
        //接受service层传来的数据
        resultPage = djLedgerService.getguaranteeMessage(userId, startTime, endTime, index);
        return resultPage;
    }

    /**
     * 查询大家保险的所有部门
     *
     * @return 戴辆
     */
    @ApiOperation(value = "查询大家保险所有的部门", notes = "查询大家保险的所有部门", tags = "getDepartment", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getdepartment", produces = "application/json")
    public @ResponseBody
    Result getDepartment() {
        //创建对应的接受数据的实体类
        Result result = new Result();
        //接收service层返回的数据
        result = djLedgerService.getDepartment();
        //将数据返回
        return result;
    }

    /**
     * 查询大家保险所有的代理人
     *
     * @return 戴辆
     */
    @ApiOperation(value = "查询大家保险所有的代理人", notes = "查询大家保险所有的代理人", tags = "getAgent", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getagent", produces = "application/json")
    public @ResponseBody
    Result getAgent() {
        //创建对应的实体类来操作数据
        Result result = new Result();
        //接收service层返回的数据
        result = djLedgerService.getAgent();
        return result;
    }

    /**
     * 大家保险用户提交台账
     *
     * @param postDaily 里面是提交的数据
     * @return 戴辆
     */
    @ApiOperation(value = "大家保险用户提交台账", notes = "大家保保险用户提交台账", tags = "postDaily", httpMethod = "POST")
    @ApiImplicitParams({

    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @PostMapping(value = "/postdaily", produces = "application/json")
    public @ResponseBody
    Result postDaily(@RequestBody PostDaily postDaily) {
        //创建对应的实体来接受和返回数据
        Result result = new Result();
        //第一步 判断userId有没有获取到，如果没有获取到userId 则说明数据错误。
        if (postDaily.getUserId() == null || postDaily.getUserId() == 0) {
            result.setCode(300);
            result.setMessage("出现异常");
            return result;
        }
        //第二步 判断其他必须的数据 是否获取到了，如果没有获取到的话 则说明异常
        if (postDaily.getAgentId() == null || postDaily.getAgentName() == null || postDaily.getDealerName() == null || postDaily.getDepartmentId() == null || postDaily.getDepartmentName() == null || postDaily.getLicensePlateNumber() == null || postDaily.getCommercial() == null || postDaily.getCompulsory() == null) {
            result.setCode(300);
            result.setMessage("出现异常");
            return result;
        }
        //第三步 判断userId是不是存在 如果返回的结果不等于10001则说明用户不是大家保险用户
        if (user.djUser(postDaily.getUserId()) != 10001) {
            result.setCode(300);
            result.setMessage("出现异常");
        }
        //通过对应的userId查询对应的用户名称
        postDaily.setUserName(user.UserName(postDaily.getUserId()));
        //接收service层返回的数据
        result = djLedgerService.postDaily(postDaily);
        return result;
    }

    /**
     * 大家保险用户 通过用户id 车牌号查询自己对应的保单的信息
     *
     * @param userId             用户的id
     * @param licensePlateNumber 车牌号
     * @return 戴辆
     */
    @ApiOperation(value = "大家保险用户 查询保单信息 (可以模糊搜索)", notes = "查询保单信息", tags = "getQueryMessage", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "licensePlateNumber", value = "查询车牌号(支持模糊查询)", required = false, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getquerymessage", produces = "application/json")
    public @ResponseBody
    Result getQueryMessage(Integer userId, String licensePlateNumber) {
        //创建对应的实体类来存储和返回数据
        Result result = new Result();
        //第一步 先判断有没有获取到userId 用户id 和 licensePlateNumber 车牌号
        if (userId == null || licensePlateNumber == null || licensePlateNumber.equals("")) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第二步 判断用户是不是大家保险用户
        if (user.djUser(userId) != 10001) {//如果不等于10001的话则说明 用户不存在 或者不是大家保险用户
            result.setCode(300);
            result.setMessage("用户不存在，或者非大家用户");
            return result;
        }
        //接收service层返回的数据
        result = djLedgerService.getQueryMessage(userId, licensePlateNumber);
        //将数据返回给前端
        return result;
    }

    /**
     * 管理查询 个人的保单信息 可以通过车牌号和用户的姓名查询
     *
     * @param condition 条件
     * @param adminId   管理员的id
     * @param index     当前页数
     * @return 戴辆
     */
    @ApiOperation(value = "", notes = "", tags = "", httpMethod = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "condition", value = "输入的字段(姓名或车牌号，支持模糊搜索)", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前页的页数", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/getsearchmessage", produces = "application/json")
    public @ResponseBody
    ResultPage getSearchMessage(Integer adminId, String condition, Integer index) {
        //创建对应的实体来接受和操作数据
        ResultPage resultPage = new ResultPage();
        //判断有没有获取到管理员id和查询条件
        if (adminId == null || condition == null || condition.equals("")) {
            resultPage.setCode(300);
            resultPage.setMessage("异常访问");
            return resultPage;
        }
        //判断页数index是否存在，如果为0获取为null的时候 就将其设置成1
        if (index == 0 || index == null) {
            index = 1;
        }
        //第二步 判断管理员的权限是不是够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        if (adminRoleId == 1) {
            //获取serviceImpl层传来的数据
            resultPage = djLedgerService.getSearchMessage(adminId, condition, index);
        } else {
            resultPage.setCode(300);
            //判断返回的数据是不是10001，或者其他事其他的。用三目运算符来返回的对应的数据
            resultPage.setMessage(adminRoleId == 10001 ? "管理员不存在" : "管理员权限不够");
            return resultPage;
        }
        return resultPage;
    }

    /**
     * 管理员查询大家保险 所有用户的总台账
     *
     * @param adminId 管理员的id
     * @return 戴辆
     */
    @ApiOperation(value = "查询总台账", notes = "查询总台账", tags = "getSumDaily", httpMethod = "GET")
    @GetMapping(value = "/getsumdaily", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    public @ResponseBody
    Result getSumDaily(Integer adminId) {
        //创建对应的实体来操作数据
        Result result = new Result();
        //第一步 先判断有没有获取到管理员id
        if (adminId == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第二步 判断管理员的资格是否够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        if (adminRoleId == 1) {
            //获取serviceImpl层传来的数据
            result = djLedgerService.getSumDaily();
        } else {
            result.setCode(300);
            //判断返回的数据是不是10001，或者其他事其他的。用三目运算符来返回的对应的数据
            result.setMessage(adminRoleId == 10001 ? "管理员不存在" : "管理员权限不够");
            return result;
        }
        //将数据返回给前端
        return result;
    }

    /**
     * 管理员 查询对应月份的交强险费用和商业险费用
     *
     * @param adminId 管理员的id
     * @param month   月份(用1-12表示)
     * @return 戴辆
     */
    @ApiOperation(value = "管理员 查询对应月份的交强险和商业险费用及占比", notes = "查询对应月份的费用和占比", tags = "getMonth", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "month", value = "查询的月数(1-12)", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getmonth", produces = "application/json")
    public @ResponseBody
    Result getMonth(Integer adminId, Integer month) {
        //创建对应的函数来操作数据
        Result result = new Result();
        //第一步 判断管理员id和月份是否为null
        if (adminId == null || month == null) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //第二步 判断管理员的资格是否够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        if (adminRoleId == 1) {
            //获取serviceImpl层传来的数据
            result = djLedgerService.getMonth(adminId, month);
        } else {
            result.setCode(300);
            //判断返回的数据是不是10001，或者其他事其他的。用三目运算符来返回的对应的数据
            result.setMessage(adminRoleId == 10001 ? "管理员不存在" : "管理员权限不够");
            return result;
        }
        //将数据返回给前端
        return result;
    }

    /**
     * 管理员 查询对应时间段 的代理人或部门的 交强险和商业险占比
     *
     * @param adminId      管理员id
     * @param startTime    起始时间
     * @param endTime      结束时间
     * @param departmentId 部门的id
     * @param agentId      代理人的id
     * @return 戴辆
     */
    @ApiOperation(value = "管理员 查询对应时间段钟部门或代理人的 交强险和商业险占比", notes = "查询交强险和商业险占比", tags = "getSumSelect", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "起始时间", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "departmentId", value = "部门id", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "agentId", value = "代理人id", required = false, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getsumselect", produces = "application/json")
    public @ResponseBody
    Result getSumSelect(Integer adminId, String startTime, String endTime, Integer departmentId, Integer agentId) {
        //创建对应的实体来接收和返回数据
        Result result = new Result();
        //判断管理员id是不是为null
        if (adminId == null) {
            result.setCode(300);
            result.setMessage("异常访问");
            return result;
        }
        //判断部门id和代理人id，如果两个同时为空的话，就说明异常访问
        if (departmentId == null && agentId == null) {
            result.setCode(300);
            result.setMessage("异常访问");
            return result;
        }
        //第二步 判断管理员的资格是否够
        int adminRoleId = administratorService.GetadminRoleId(adminId);
        if (adminRoleId == 1) {
            //获取serviceImpl层传来的数据
            result = djLedgerService.getSumSelect(startTime, endTime, departmentId, agentId);
        } else {
            result.setCode(300);
            //判断返回的数据是不是10001，或者其他事其他的。用三目运算符来返回的对应的数据
            result.setMessage(adminRoleId == 10001 ? "管理员不存在" : "管理员权限不够");
            return result;
        }
        //将数据返回给前端
        return result;
    }
}

