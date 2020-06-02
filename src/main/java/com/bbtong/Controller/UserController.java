package com.bbtong.Controller;


import com.bbtong.Base.NewUser;
import com.bbtong.Service.UserService;
import com.bbtong.Util.Result;
import com.bbtong.Util.SMS;
import com.bbtong.Util.UserResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
     * @param userPhone 用户的手机号码
     * @param session session用来存储数据
     * @param httpServletRequest 用来接受session中的数据
     * @return 戴辆
     */
    @GetMapping(value = "/note", produces = "application/json")
    public @ResponseBody
    UserResult UserNote(@RequestParam(value = "userPhone") String userPhone, HttpSession session,HttpServletRequest httpServletRequest) {
        //创建Result的实体来接受数据
        UserResult userResult = new UserResult();
        //创建实体类的数据来操作
        NewUser newUser=new NewUser();
        //随机生成六位随机数
        int num = (int) ((Math.random() * 9 + 1) * 100000);
        //将数据存到session中电话号码为key，验证码为value

        newUser.setUserPhone(userPhone);
        newUser.setNum(num);
        session.setAttribute("newUser", newUser);
        //设置session的过期时间，这是设置成5分钟
        session.setMaxInactiveInterval(5);
        session.setAttribute("newUser", newUser);
        return userResult;
    }

    @GetMapping(value = "/login", produces = "application/json")
    public @ResponseBody
    UserResult UserLogin(String userPhone, int num) {
        //创建实体类Result来接受数据
        UserResult userResult = new UserResult();
        //创建request实体来接受和操作session数据
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //创建session接受数据
        HttpSession session=request.getSession();
        //创建NewUser实体来判断数据是否一致
        NewUser newUser=(NewUser)session.getAttribute("newUser");
        if (userPhone!=newUser.getUserPhone()) {
            userResult.setCode(300);
            userResult.setMessage("手机号码错误");
            return userResult;
        }
        if (num!=newUser.getNum()) {
            userResult.setCode(300);
            userResult.setMessage("验证码错误");
            return userResult;
        }
        //第一步先根据手机号，去查询有没有注册账号
        userResult=userService.PutUser(userPhone);
        return userResult;
    }
}
