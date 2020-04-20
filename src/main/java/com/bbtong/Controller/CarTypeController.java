package com.bbtong.Controller;

import com.bbtong.Service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cartype")
public class CarTypeController {

    @Autowired
    private CarTypeService carTypeService;
}
