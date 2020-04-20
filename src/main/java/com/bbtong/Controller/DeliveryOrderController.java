package com.bbtong.Controller;

import com.bbtong.Service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 还单表
 */

@Controller
@RequestMapping("/Delivery")
public class DeliveryOrderController {

    @Autowired
    private DeliveryOrderService deliveryOrderService;
}
