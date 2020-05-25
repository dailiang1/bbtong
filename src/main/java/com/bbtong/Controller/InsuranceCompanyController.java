package com.bbtong.Controller;

import com.bbtong.Service.InsuranceCompanyService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/***
 * 保险公司表
 */

@Controller
@RequestMapping("/insurance")
public class InsuranceCompanyController {

    @Autowired
    private InsuranceCompanyService insuranceCompanyService;


    /**
     * 查询保险公司表中的数据，来进行操作
     *
     * @return 戴辆
     */
    @ApiOperation(value = "查询保险公司表", notes = "查询保险公司表的数据，来进行操作", tags = "Select", httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public @ResponseBody
    Result selectInsurance() {
        Result result = new Result();
        result = insuranceCompanyService.selectInsurance();

        return result;
    }
}
