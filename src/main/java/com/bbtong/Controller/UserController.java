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
     *
     * @param userPhone          用户的手机号码
     * @param session            session用来存储数据
     * @param httpServletRequest 用来接受session中的数据
     * @return 戴辆
     */
    @GetMapping(value = "/note", produces = "application/json")
    public @ResponseBody
    UserResult UserNote(@RequestParam(value = "userPhone") String userPhone, HttpSession session, HttpServletRequest httpServletRequest) {
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
                System.out.println(num);
                if (newPhone.equals(userPhone)) {
                    session.removeAttribute(newPhone);
                }
            }

        }
        //创建Result的实体来接受数据
        UserResult userResult = new UserResult();
        //随机生成六位随机数
        int num = (int) ((Math.random() * 9 + 1) * 1000);
        //将数据存到newUser的实体中，然后将数据存到session中

        //将newUser存到session中，用于登陆的判断
        session.setAttribute(userPhone, num);
        //设置session的过期时间，这是设置成5分钟
        session.setMaxInactiveInterval(30 * 60);

        //userResult = sms.getRequest2(userPhone, num);
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
    @GetMapping(value = "/login", produces = "application/json")
    public @ResponseBody
    UserResult UserLogin(String userPhone, int num, HttpSession session) {
        //创建实体类Result来接受数据
        UserResult userResult = new UserResult();
        //创建request实体来接受和操作session数据
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //创建session接受数据
        session = request.getSession();
        //创建NewUser实体来判断数据是否一致
        Enumeration<String> attrs = session.getAttributeNames();
        String newPhone = attrs.nextElement().toString();
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
        return userResult;
    }
}
