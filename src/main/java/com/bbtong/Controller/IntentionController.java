package com.bbtong.Controller;

import com.bbtong.Service.IntentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 有意向的委托表
 */

@Controller
@RequestMapping("/intention")
public class IntentionController {

    @Autowired
    private IntentionService intentionService;
}
