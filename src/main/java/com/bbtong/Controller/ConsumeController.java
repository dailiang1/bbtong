package com.bbtong.Controller;

import com.bbtong.Service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consume")
public class ConsumeController {

    @Autowired
    private ConsumeService consumeService;
}
