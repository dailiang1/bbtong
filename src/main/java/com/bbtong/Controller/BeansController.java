package com.bbtong.Controller;

import com.bbtong.Pojo.Beans;
import com.bbtong.Service.BeansService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 和豆申请表
 */

@Controller
@RequestMapping("/beans")
public class BeansController {

    @Autowired
    private BeansService beansService;


    @ResponseBody
    @RequestMapping(value = "submit",method = RequestMethod.POST)
    public Result Submit(int User_id,String Card_Number){
        //创建接收返回参数的实体类
        Result result=new Result();
        //创建和豆申请的实体
        Beans beans=new Beans();
        //获取当前的时间，将当前时间存到数据库中
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String hehe = dateFormat.format(now);

        return  result;
    }
}
