package com.bbtong.Controller;

import com.bbtong.Pojo.Client;
import com.bbtong.Service.ClientService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.sun.deploy.util.SessionState;
import io.swagger.annotations.*;
import org.apache.commons.collections4.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.Session;
import javax.print.attribute.standard.MediaSize;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 客户表
 */

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * 用户添加自己的客户
     *
     * @param client 用户的信息，前端传来的
     * @return 戴辆
     */
    @ApiOperation(value = "添加客户的方法", notes = "用户添加自己客服的方法", tags = "Add", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "typeId", value = "客户类型表的ID,如果没有选择的话，就默认为本网客户", required = false, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "clientWay", value = "客户的手机，非必填项", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientName", value = "客户的姓名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "insuranceCompanyId", value = "保险公司的id", required = false, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "clientIdentityCard", value = "客户的身份证号码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientIdentityCardFront", value = "客户身份证的正面", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientIdentityCardVerso", value = "客户身份证的反面", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientAddress", value = "客户投保城市(前端传过来的值)", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientComeTime", value = "判断用户是否选择了投保日期", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientExpirationTime", value = "如果没有选择的日期的话就默认在当前日期上加一年", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientDrivingLicense", value = "客户的行驶证副本图片", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientType", value = "客户车型(自己备注客户车的类型)", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "clientRemark", value = "用户给客户的备注", required = false, dataType = "String", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @PostMapping(value = "/add", produces = "application/json")
    public @ResponseBody
    Result AddCilent(Client client) throws ParseException {
        //创建接收数据的实体
        Result result = new Result();
        if (null == client.getUserId()) {//先判断是否获取到了用户的ID，如果获取到了就证明当前没有问题，如果没有就表示当前异常
            result.setCode(300);
            result.setMessage("当前异常，请稍后再试");
        } else {
            if (null == client.getInsuranceCompanyId()) {//判断用户是否输入了，选择 什么保险，没有的话，就默认选择无
                client.setInsuranceCompanyId(1);
            }
            if (null != client.getClientExpirationTime() && null == client.getClientComeTime()) {//判断用户如果只选择了到期的时间

            } else {
                if (null == client.getClientComeTime() || client.getClientComeTime() == "") {//判断用户是否输入了投保日期，如果没有的话就自动获取当天的时间
                    //获取当前的时间，将当前时间存到数据库中
                    Date now = new Date();
                    //设置时间的编码格式
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    //将时间存到实体类中
                    client.setClientComeTime(dateFormat.format(now));
                } else {//如果开始时间不为空的话
                    if (null == client.getClientExpirationTime() || client.getClientExpirationTime() == "") {
                        //创建Calendar实例
                        Calendar cal = Calendar.getInstance();
                        //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        //将时间设置成用户录入的时间
                        cal.setTime(format.parse(client.getClientComeTime()));
                        //在当前的时间上加上一年
                        cal.add(Calendar.YEAR, 1);
                        //将一年后的时间写入到数据对应的字段中
                        client.setClientExpirationTime(format.format(cal.getTime()));
                    }
                }
                if (null == client.getClientExpirationTime() || client.getClientExpirationTime() == "") {
                    //获取当前日期
                    Date date = new Date();

                    //创建Calendar实例
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);   //设置当前时间
                    cal.add(Calendar.YEAR, 1);  //在当前时间基础上加一年

                    //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    //如果他没有设置时间的话，就默认为一年的时间
                    client.setClientExpirationTime(format.format(cal.getTime()));

                    //同理增加一个月和一天的方法：
                    cal.add(Calendar.MONTH, 1);
                    cal.add(Calendar.DAY_OF_WEEK, 1);
                }
            }
            if (null == client.getTypeId()) {//如果没有选择客户的话，就默认为本网客户
                client.setTypeId(2);
            }
            if (null != client.getClientIdentityCard()) {//判断是否输入了用户的身份证
                client.setClientBirthday(client.getClientIdentityCard().substring(10, 14));//如果输入了身份证，就截取字符串，来添加到客户的生日字段中去
            }
            result = clientService.AddClient(client);
        }
        return result;
    }

    /**
     * 用户查询自己对应的客户，有哪些然后查询显示对应的信息
     *
     * @param userId 用户的ID
     * @param typeId 查询什么类型的数据
     * @param index  当前是多少页
     * @return 戴辆
     */
    @ApiOperation(value = "查询自己的客户", notes = "用户查询自己的对应的客户，显示客户对应的信息", tags = "SelectQuery", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "typeId", value = "查询什么类型的数据(本网，他网)", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前是多少页", required = false, dataType = "Integer", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/selectquery", produces = "application/json")
    public @ResponseBody
    ResultPage SelectQuery(Integer userId, Integer typeId, Integer index) {
        //创建接收数据的实体类，来接收数据
        ResultPage resultPage = new ResultPage();
        if (null == userId) {//判断userId是否为空，如果userId为空的话，择表示没有获取到用户的信息，直接提示异常
            resultPage.setCode(300);
            resultPage.setMessage("当前异常请稍后再试");
            return resultPage;
        }
        if (null == index) {//如果没有输入页数的话，择默认显示第一页
            index = 1;
        }
        resultPage = clientService.SelectQuery(userId, typeId, index);
        return resultPage;
    }

    /**
     * 用户查询对应客户的个人信息
     *
     * @param userId   用户的ID(可能要用到后面进行操作)
     * @param clientId 查询那个客户的信息
     * @param session  将数据存到session中，用于跳转页面的显示
     * @return 戴辆
     */
    @ApiOperation(value = "查询客户信息", notes = "用户查询对应客户的个人信息", tags = "Particulars", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID(可能要用到后面进行操作)", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "clientId", value = "要查询的客户的id", required = true, dataType = "Integer", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Session.class),
            @ApiResponse(code = 300, message = "当前异常", response = Session.class)
    })
    @GetMapping(value = "/particulars", produces = "application/json")
    public String Particulars(Integer userId, Integer clientId, HttpSession session) {
        ResultPage resultPage = new ResultPage();
        if (null == userId || null == clientId) {
            session.setAttribute("code", 300);
            session.setAttribute("message", "当前异常");
        } else {
            //接受数据库传来的数据
            resultPage = clientService.Particulars(userId, clientId);
            //存到session中，带到其他页面中去
            session.setAttribute("resultPage", resultPage);
        }
        return "index";
    }

    /**
     * 客户的生日提醒
     *
     * @param userId 用户的userId
     * @return 戴辆
     */
    @ApiOperation(value = "客户生日提醒", notes = "用户生日提醒", tags = "Birthday", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前的页数可以为空", required = false, dataType = "Integer", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/birthday", produces = "application/json")
    public @ResponseBody
    ResultPage Birthday(Integer userId, Integer index) {
        //创建获取数据的实体
        ResultPage resultPage = new ResultPage();
        if (null == userId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前的异常,请稍后再试");
            return resultPage;
        }
        if (null == index) {//如果没有传入页数的话，则表示查询第一页的数据
            index = 1;
        }
        //获取当前的时间，将当前时间存到数据库中
        Date now = new Date();
        //设置时间的编码格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //获取当天的时间节点（日期的格式为：0101，表示一月一号）
        String data = dateFormat.format(now).substring(5, 10).replace("/", "");
        //将当前的时间转换成int类型
        int Time = Integer.parseInt(data);
        String NewTime = "";
        //判断当前是不是十二月，如果是十二月的话，则另其下一月为1月
        if (Integer.parseInt(data.substring(0, 2)) == 12) {
            //截取当前的月数是多少
            NewTime = 01 + data.substring(3, 4);
        } else {
            //当前的月数如果不是，十二月的话，只需要令月数+1就可以了
            NewTime = ((Integer.parseInt(data.substring(0, 2)) + 01) + data.substring(2, 4));
        }
        resultPage = clientService.Birthday(userId, Time, NewTime, index);
        return resultPage;
    }

    /**
     * 用户的快到车险的客户
     *
     * @param index  显示多少页的数据
     * @param userId 用户的userId
     * @return 戴辆
     */
    @ApiOperation(value = "用户快到车险的用户", notes = "在这一个月车险到期的客户", tags = "InsuranceWarn", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "当前页的页数", required = false, dataType = "Integer", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/insurance", produces = "application/json")
    public @ResponseBody
    ResultPage InsuranceWarn(Integer userId, Integer index) {
        //创建接受数据的实体来接受数据
        ResultPage resultPage = new ResultPage();
        //判断userId是不是为空，如userId 为空的话，则表示当前出现异常。程序终止
        if (null == userId) {
            //300表示异常
            resultPage.setCode(300);
            //表示异常返回的数据
            resultPage.setMessage("当前异常，请稍后再试");
            //终止程序将数据返回给前台
            return resultPage;
        }
        //判断传入的index是不是为空，如果为空的话，就让其显示第一页的数据
        if (null == index) {
            index = 1;
        }
        //获取电脑当前的时间
        Date now = new Date();
        //创建Calendar实例
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);   //设置当前时间
        //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将当前的时间存起来
        String Time = format.format(cal.getTime());
        //在当前的基础上，增加一个月
        cal.add(Calendar.MONTH, 1);
        //将加了一个月之后的时间存起来，用来比较搜索查询，在这个一个月时间之内的数据
        String NewTime = format.format(cal.getTime());
        //用resultPage来接受后端传来的数据
        resultPage = clientService.InsuranceWarn(userId, Time, NewTime, index);
        return resultPage;
    }
}
