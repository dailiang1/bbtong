package com.bbtong.Controller;

import com.bbtong.Service.TypeService;
import com.bbtong.Util.Result;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/***
 * 客户类型表
 */
@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * 查询客户类型的表的数据
     *
     * @return 戴辆
     */

    @ApiOperation(value = "查询客户类型的表", notes = "查询客户类型表的数据", tags = "Select", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @GetMapping(value = "/select", produces = "application/json")
    public @ResponseBody
    Result SelectType() {
        //创建接收service层数据的实体
        Result result = new Result();
        //接受service层传来的数据
        result = typeService.SelectType();
        return result;
    }
}
