package com.bbtong.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Override
    @ResponseBody
    @RequestMapping("/login")
    public String toString() {
        return "我就是我";
    }
}
