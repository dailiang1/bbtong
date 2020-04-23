package com.bbtong.Controller;

import com.bbtong.Service.CarTypeService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 车类型表
 */

@Controller
@RequestMapping("/cartype")
public class CarTypeController {

    /***
     * 创建车类型表的Service层方法
     */
    @Autowired
    private CarTypeService carTypeService;


    /***
     *查询所有车类型的方法
     * 戴辆
     */
    @ResponseBody
    @RequestMapping(value ="/select")
    public Result SelectCarType(){
        //创建存数据库返回的数据的实体
        Result rs=new Result();
        rs=carTypeService.selectCarType();
        return rs;
    }

    @ResponseBody
    @RequestMapping("/xx")
    public String xx(){
        return "我就是我";
    }
}
