package com.bbtong.Controller;

import com.bbtong.Service.InsuranceCompanyService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /***
     * 查询保险公司表中的数据，来进行操作
     * 戴辆
     */
    @ResponseBody
    @RequestMapping("/select")
    public Result selectInsurance(){
        Result result=new Result();
        result=insuranceCompanyService.selectInsurance();

        return result;
    }
}
