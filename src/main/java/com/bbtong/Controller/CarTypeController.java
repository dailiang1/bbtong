package com.bbtong.Controller;

import com.bbtong.Service.CarTypeService;
import com.bbtong.Util.Result;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 车类型表
 */

@Controller
@RequestMapping("/cartype")
public class CarTypeController {

    /**
     * 创建车类型表的Service层方法
     */
    @Autowired
    private CarTypeService carTypeService;


    /**
     * 查询所有车类型的方法
     *
     * @return
     */
    @ApiOperation(value = "查询所有车类型的方法", notes = "查询所以车类型的方法", tags = "Select", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/select", produces = "application/json")
    public @ResponseBody
    Result SelectCarType() {
        //创建存数据库返回的数据的实体
        Result rs = new Result();
        rs = carTypeService.selectCarType();
        return rs;
    }

}
