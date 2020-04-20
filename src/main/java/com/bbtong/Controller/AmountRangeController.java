package com.bbtong.Controller;

import com.bbtong.Service.AmountRangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 车保金额类
 */

@Controller
@RequestMapping("/amount")
public class AmountRangeController {

    @Autowired
    private AmountRangeService amountRangeService;
}
