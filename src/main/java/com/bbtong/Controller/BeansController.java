package com.bbtong.Controller;

import com.bbtong.Pojo.Beans;
import com.bbtong.Service.BeansService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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


    /**
     * 提交人车生活的卡号来申请和豆。
     * @param User_id 提交的用户ID
     * @param Card_Number 人车生活的卡号
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/submit")
    public Result Submit(Integer User_id, String Card_Number) {
        //创建接收返回参数的实体类
        Result result = new Result();
        if (User_id == null ) {
            result.setCode(300);
            result.setMessage("当前异常，请稍后尝试");
        } else if (Card_Number==""||Card_Number==null) {//判断他有没有输入人车生活卡号，并且判断输入是否正确
            result.setCode(500);
            result.setMessage("请输入正确的值");
        } else {
            //去掉前后的双引号,以及去掉前后的空格
            Card_Number=Card_Number.replace("\"", "").trim();
            //创建和豆申请的实体
            Beans beans = new Beans();
            //获取当前的时间，将当前时间存到数据库中
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //将时间存到实体类中
            beans.setBeansTime(dateFormat.format(now));
            //将User_Id存到实体类中
            beans.setUserId(User_id);
            //将card_Number存到实体类中
            beans.setCardNumber(Card_Number);
            result = beansService.Submit(beans);
        }
        return result;
    }

    /**
     * 用户查询人车生活卡是否审核，派发了和豆
     * @param User_id 用户的ID(是那个用户查询)
     * @param index 用来记录当前页的页数
     * @param Beans_State  用来查询对应状态的数据
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/query")
    public ResultPage Query(Integer User_id, Integer index,Integer Beans_State){
        if(index==null ||index==0){//如果没有传入页数，就默认访问第一页
            index=1;
        }if(Beans_State==null||Beans_State==0){//如果没有传入访问什么数据，就默认访问待审核的数据
            Beans_State=0;
        }
        //用来接受返回数据的实体
        ResultPage resultPage=new ResultPage();
        if(User_id==null){
            resultPage.setCode(300);
            resultPage.setMessage("当前异常，请稍后尝试");
        }else{
            resultPage=beansService.Query(User_id,index,Beans_State);
        }
        return resultPage;
    }

    /***
     * 管理人员审核或查看哪些审核了，
     * @param index 当前的页数
     * @param Beans_State 当前的状态(已审核，未审核)
     * 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/selectquery")
    public ResultPage SelectQuery(Integer index,Integer Beans_State){
        //用来接受返回数据的实体
        ResultPage resultPage=new ResultPage();
        if(index==null ||index==0){//如果没有传入页数，就默认访问第一页
            index=1;
        }if(Beans_State==null||Beans_State==0){//如果没有传入访问什么数据，就默认访问待审核的数据
            Beans_State=0;
        }
        resultPage=beansService.SelectQuery(index,Beans_State);
        return resultPage;
    }
}
