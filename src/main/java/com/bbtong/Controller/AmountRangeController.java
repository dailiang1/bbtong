package com.bbtong.Controller;

import com.bbtong.Service.AmountRangeService;
import com.bbtong.Util.Result;
import com.fasterxml.jackson.core.sym.NameN;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/***
 * 车保金额类
 */
@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/amount")
public class AmountRangeController {

    @Autowired
    private AmountRangeService amountRangeService;

    /**
     * 查询车保金额表中类型
     *
     * @return 戴辆
     */
    @ApiOperation(value = "查询车保金额表中类型的方法", notes = "查询车保类型的方法", tags = "Select", httpMethod = "GET")
    @GetMapping(value = "/select", produces = "application/json")
    public @ResponseBody
    Result Select() {
        //创建接收service层实体的数据
        Result result = new Result();
        result = amountRangeService.SelectAmount();
        return result;
    }
}
