package com.bbtong.Controller;

import com.bbtong.Service.AmountRangeService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 车保金额类
 */

@Controller
@RequestMapping("/amount")
public class AmountRangeController {

    @Autowired
    private AmountRangeService amountRangeService;

    /**
     * 查询车保金额表中类型
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/select")
    public Result Select(){
        //创建接收service层实体的数据
        Result result=new Result();
        result=amountRangeService.SelectAmount();
        return result;
    }
}
