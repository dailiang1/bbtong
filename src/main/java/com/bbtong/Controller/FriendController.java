package com.bbtong.Controller;

import com.bbtong.Service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/friend")
public class FriendController {

    @Autowired
    private FriendService friendService;
}
