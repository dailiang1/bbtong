package com.bbtong.Controller;

import com.bbtong.Service.TypeService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 客户类型表
 */

@Controller
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * 查询客户类型的表的数据
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping("/select")
    public Result SelectType(){
        //创建接收service层数据的实体
        Result result=new Result();
        //接受service层传来的数据
        result=typeService.SelectType();
        return result;
    }
}
