package com.bbtong.Controller;

import com.bbtong.Service.AwaitDeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 待还单表
 */
@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/await")
public class AwaitDeliveryOrderController {

    @Autowired
    private AwaitDeliveryOrderService awaitDeliveryOrderService;
}
