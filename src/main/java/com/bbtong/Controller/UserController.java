package com.bbtong.Controller;


import com.alibaba.fastjson.JSON;
import com.bbtong.Base.NewUser;
import com.bbtong.Base.PostUser;
import com.bbtong.Service.UserService;
import com.bbtong.Util.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.attribute.standard.MediaSize;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;


/***
 * 委托表的Controller
 */

@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 创建短信调用的实例
     */
    @Resource
    private SMS sms;

    /**
     * 用户用手机号登录的方法
     *
     * @param userPhone          用户的手机号码
     * @param session            session用来存储数据
     * @param httpServletRequest 用来接受session中的数据
     * @return 戴辆
     */
    @ApiOperation(value = "用户登陆获取手机验证码", notes = "获取手机验证码", tags = "Note", httpMethod = "GET")
    @ApiImplicitParam(name = "userPhone", value = "用户的手机号", required = true, dataType = "int", paramType = "query")
    @GetMapping(value = "/note", produces = "application/json")
    public @ResponseBody
    UserResult UserNote(String userPhone, HttpSession session, HttpServletRequest httpServletRequest) {
        //获取session
        session = httpServletRequest.getSession();
        //先判断有没有session
        if (session != null) {
            // 获取session中所有的键值
            Enumeration<String> attrs = session.getAttributeNames();
            // 遍历attrs中的
            while (attrs.hasMoreElements()) {
                // 获取session键值
                String newPhone = attrs.nextElement().toString();
                System.out.println(newPhone);
                // 根据键值取session中的值
                Object num = session.getAttribute(newPhone);
                if (newPhone.equals(userPhone)) {
                    session.removeAttribute(newPhone);
                }
            }
        }
        //创建Result的实体来接受数据
        UserResult userResult = new UserResult();
        //随机生成六位随机数
//        int num = (int) ((Math.random() * 9 + 1) * 1000);
        int num = 1111;
        //将数据存到newUser的实体中，然后将数据存到session中

        //将newUser存到session中，用于登陆的判断
        session.setAttribute(userPhone, num);
        //设置session的过期时间，这是设置成5分钟
        session.setMaxInactiveInterval(1 * 60);

//        userResult = sms.getRequest2(userPhone, num);
        return userResult;
    }

    /**
     * 验证用户短信和手机号，是否一致的方法，如果一致的话就登陆成功将数据存到cookie中
     *
     * @param userPhone 手机号码
     * @param num       验证码
     * @param session   用来接受存储数据
     * @return 戴辆
     */
    @ApiOperation(value = "用户根据手机号和验证码登陆", notes = "验证用户的手机号和验证码是否正确，如果正确的话就登陆成功", tags = "Login", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userPhone", value = "用户的手机号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "num", value = "用户提交的验证码", required = true, dataType = "int", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = UserResult.class),
            @ApiResponse(code = 300, message = "异常", response = UserResult.class),
            @ApiResponse(code = 400, message = "失败", response = UserResult.class),
            @ApiResponse(code = 500, message = "内部错误", response = UserResult.class),
            @ApiResponse(code = 205, message = "当前用户没有注册", response = UserResult.class)
    })
    @GetMapping(value = "/login", produces = "application/json")
    public @ResponseBody
    UserResult UserLogin(String userPhone, Integer num, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        //创建实体类Result来接受数据
        UserResult userResult = new UserResult();
        //创建session接受数据
        session = request.getSession();
        //创建NewUser实体来判断数据是否一致
        Enumeration<String> attrs = session.getAttributeNames();
        String newPhone = null;
        while (attrs.hasMoreElements()) {
            //取出数据中的电话号码,将数据赋值给对应的值
            newPhone = attrs.nextElement().toString();
            //判断数据有没有和手机号码相同的，如果相同的话则结束循环
            if (userPhone.equals(newPhone)) {
                break;
            }
        }
        if (null == newPhone) {
            userResult.setCode(500);
            userResult.setMessage("请发送验证码");
            return userResult;
        }
        if (!userPhone.equals(newPhone)) {
            userResult.setCode(300);
            userResult.setMessage("手机号码错误");
            return userResult;
        }
        if (num != (int) session.getAttribute(userPhone)) {
            userResult.setCode(300);
            userResult.setMessage("验证码错误");
            return userResult;
        }
        //登陆成功之后将seesion给清除掉
        session.removeAttribute(newPhone);
        //第一步先根据手机号，去查询有没有注册账号
        userResult = userService.PutUser(userPhone);
        if (userResult.getCode() == 200) {
            //创建一个数据来接受后端的数据
            String userName = userResult.getUserId() + "#" + userResult.getInsuranceCompanyId() + "#" + userResult.getUserPhone();
            //创建一个cookie对象,将数据存到里面
            Cookie cookie = new Cookie("userName", JSON.toJSONString(userName));
            //设置cookie的过期时间为七天之后过期
            cookie.setMaxAge(7 * 24 * 60 * 60); // 7天过期
            cookie.setPath("/");
            //将cookie对象加入response响应
            response.addCookie(cookie);
            //将用户的userId存到session中
            session.setAttribute("userId", userResult.getUserId());
            //将用户的手机号码存到seesion中
            session.setAttribute("userPhone", userResult.getUserPhone());
            //将用户的保险公司id存到session中
            session.setAttribute("typeId", userResult.getInsuranceCompanyId());
            //设置session过期的时间 这为12个小时过期
            session.setMaxInactiveInterval(60 * 60 * 12);
        }
        //创建cookie来接受和存储数据
        return userResult;
    }

    /**
     * 用户注册的方法 提交注册申请
     *
     * @param postUser 里面用来存储数据
     * @return戴辆
     */
    @ApiOperation(value = "注册用户", notes = "用户注册的方法 提交注册申请", tags = "PostUser", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userPhone", value = "用户的手机号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "userName", value = "用户的姓名", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "insuranceCompanyId", value = "用户的保险公司id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userIdentityCard", value = "用户的身份证编号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "userNumber", value = "保险公司的代理编号", required = true, dataType = "strinng", paramType = "query"),
            @ApiImplicitParam(name = "userTietong", value = "保险代理人的类别(1:大家保险(铁通员工),2:大家保险员工,3其他保险的员工)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userAddress", value = "保险人的地址", required = true, dataType = "string", paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @PostMapping(value = "/postuser", produces = "application/json")
    public @ResponseBody
    Result PostUser(@RequestBody PostUser postUser) {
        //创建接受数据返回的实体类
        Result result = new Result();
        //判断获取的用户信息是不是为null，如果为null的话就返回异常
        if (null == postUser.getInsuranceCompanyId() || null == postUser.getUserNumber() || null == postUser.getUserAddress() || null == postUser.getUserName() || null == postUser.getUserTietong() || null == postUser.getUserPhone() || null == postUser.getUserIdentityCard()) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //接受service层传来的数据
        result = userService.PostUser(postUser);
        return result;
    }

    /**
     * 用户查询我的好友的方法
     *
     * @param userId 用户id
     * @return 戴辆
     */
    @ApiOperation(value = "用户查询好友的方法", notes = "用户查询我的好友的方法", tags = "GetFriend", httpMethod = "GET")
    @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @GetMapping(value = "/getfriend", produces = "application/json")
    public @ResponseBody
    ResultPage GetFriend(Integer userId) {
        //创建ResultPage实体来接受和返回数据
        ResultPage resultPage = new ResultPage();
        //判断userId是不是为null，如果userId为null的话，则说明访问异常或没有获取到数据
        if (null == userId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常");
            return resultPage;
        }
        //接受service层传来的数据
        resultPage = userService.GetFriend(userId);
        return resultPage;
    }


    /**
     * 查看自己的个人资料
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @ApiOperation(value = "查看自己的个人资料", notes = "查看个人资料的方法", tags = "GetUser", httpMethod = "GET")
    @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/getuser", produces = "application/json")
    public @ResponseBody
    Result GetUser(Integer userId) {
        //创建Result存储数据和返回数据
        Result result = new Result();
        //判断userId是不是为null，如果userId为null的话，则说明访问异常或没有获取到数据
        if (null == userId) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //接受service层传来的数据
        result = userService.GetUser(userId);
        return result;
    }

    /**
     * 修改自己的个人信息
     *
     * @param postUser 里面存储着数据
     * @return 戴辆
     */
    @ApiOperation(value = "修改自己的个人信息", notes = "修改自己的个人信息", tags = "UserRedact", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userPhone", value = "用户的手机号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "userName", value = "用户的姓名", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "insuranceCompanyId", value = "用户的保险公司id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userIdentityCard", value = "用户的身份证编号", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "userNumber", value = "保险公司的代理编号", required = true, dataType = "strinng", paramType = "query"),
            @ApiImplicitParam(name = "userTietong", value = "保险代理人的类别(1:大家保险(铁通员工),2:大家保险员工,3其他保险的员工)", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userAddress", value = "保险人的地址", required = true, dataType = "string", paramType = "query"),
    })
    @PostMapping(value = "/userredact", produces = "application/json")
    public @ResponseBody
    Result UserRedact(@RequestBody PostUser postUser) {
        //创建result的实体来接收和返回数据
        Result result = new Result();
        if (null == postUser.getUserId()) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        result = userService.UserRedact(postUser);
        return result;
    }

    /**
     * 用户退出删除cookie的方法
     *
     * @param response
     * @param request
     * @return
     */
    @ApiOperation(value = "用户退出删除cookie的方法", notes = "删除cookie", tags = "Exit", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
    })
    @GetMapping(value = "/exit", produces = "application/json")
    public @ResponseBody
    Result Exit(HttpServletResponse response, HttpServletRequest request) {
        Result result = new Result();
        try {
            Cookie cookie = new Cookie("userName", null);//cookie名字要相同
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

    /**
     * 用户查询自己消息的方法
     *
     * @param userId 用户id
     * @return 戴辆
     */
    @ApiOperation(value = "用户查询自己消息的方法", notes = "查询消息", tags = "SelectNews", httpMethod = "GET")
    @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/selectnews", produces = "application/json")
    public @ResponseBody
    ResultPage SelectNews(Integer userId) {
        //创建接收数据的实体类
        ResultPage resultPage = new ResultPage();
        if (null == userId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常");
            return resultPage;
        }
        //接收service层返回的数据
        resultPage = userService.SelectNews(userId);
        return resultPage;
    }

    /**
     * 用户删除对应消息的方法
     *
     * @param userId 用户的id
     * @param newsId 消息的id
     * @param index  1表示执行未读的方法，2表示执行删除的方法
     * @return 戴辆
     */
    @ApiOperation(value = "用户删除消息的方法", notes = "用户删除消息", tags = "delectNews", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "newsId", value = "消息的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户的id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "index", value = "处理消息的类型，1表示已读，2表示删除", required = true, dataType = "int", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/delectnews", produces = "application/json")
    public @ResponseBody
    Result delectNews(Integer userId, Integer newsId, Integer index) {
        //创建接收数据的实体类
        Result result = new Result();
        if (null == userId || null == newsId) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //接受service层传来的数据
        result = userService.delectNews(userId, newsId, index);
        return result;
    }
}
