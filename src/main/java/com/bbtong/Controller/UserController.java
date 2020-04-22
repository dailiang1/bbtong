package com.bbtong.Controller;

import com.bbtong.Pojo.User;
import com.bbtong.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resources;
import java.io.FileNotFoundException;

/***
 * 委托表的Controller
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping("/login")
    public String toString(String userOpendid){
        User user=new User();
        user.setUserOpenid(userOpendid);
        int x=userService.login(user);
        try {
            if(x>0){
                return "登陆成功";
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("运行成功");
        }
        return "登陆失败";
    }
}
