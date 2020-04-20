package com.bbtong.Controller;

import com.bbtong.Service.BeansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beans")
public class BeansController {

    @Autowired
    private BeansService beansService;
}
