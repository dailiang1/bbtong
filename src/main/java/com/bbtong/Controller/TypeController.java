package com.bbtong.Controller;

import com.bbtong.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 客户类型表
 */

@Controller
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

}
