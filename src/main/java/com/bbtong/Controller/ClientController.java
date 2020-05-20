package com.bbtong.Controller;

import com.bbtong.Pojo.Client;
import com.bbtong.Service.ClientService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.sun.deploy.util.SessionState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 客户表
 */

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    /**
     * 用户添加自己的客户
     *
     * @param client 用户的信息，前端传来的
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/add")
    public Result AddCilent(Client client) {
        //创建接收数据的实体
        Result result = new Result();
        if (null == client.getUserId()) {//先判断是否获取到了用户的ID，如果获取到了就证明当前没有问题，如果没有就表示当前异常
            result.setCode(200);
            result.setMessage("当前异常，请稍后再试");
        } else {
            if (null == client.getInsuranceCompanyId()) {//判断用户是否输入了，选择 什么保险，没有的话，就默认选择无
                client.setInsuranceCompanyId(1);
            }
            if (null == client.getClientComeTime() || client.getClientComeTime() == "") {//判断用户是否输入了投保日期，如果没有的话就自动获取当天的时间
                //获取当前的时间，将当前时间存到数据库中
                Date now = new Date();
                //设置时间的编码格式
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                //将时间存到实体类中
                client.setClientComeTime(dateFormat.format(now));
            }
            if (null == client.getClientExpirationTime() || client.getClientExpirationTime() == "") {
                //获取当前日期
                Date date = new Date();

                //创建Calendar实例
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);   //设置当前时间
                cal.add(Calendar.YEAR, 1);  //在当前时间基础上加一年

                //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //如果他没有设置时间的话，就默认为一年的时间
                client.setClientExpirationTime(format.format(cal.getTime()));

                //同理增加一个月和一天的方法：
                cal.add(Calendar.MONTH, 1);
                cal.add(Calendar.DAY_OF_WEEK, 1);
            }
            if (null == client.getTypeId()) {//如果没有选择客户的话，就默认为本网客户
                client.setTypeId(2);
            }
            if (null != client.getClientIdentityCard()) {//判断是否输入了用户的身份证
                client.setClientBirthday(client.getClientIdentityCard().substring(10, 14));//如果输入了身份证，就截取字符串，来添加到客户的生日字段中去
            }
            result = clientService.AddClient(client);
        }
        return result;
    }

    /**
     * 用户查询自己对应的客户，有哪些然后查询显示对应的信息
     *
     * @param userId 用户的ID
     * @param typeId 查询什么类型的数据
     * @param index  当前是多少页
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/selectquery")
    public ResultPage SelectQuery(Integer userId, Integer typeId, Integer index) {
        //创建接收数据的实体类，来接收数据
        ResultPage resultPage = new ResultPage();
        if (null == userId) {//判断userId是否为空，如果userId为空的话，择表示没有获取到用户的信息，直接提示异常
            resultPage.setCode(300);
            resultPage.setMessage("当前异常请稍后再试");
            return resultPage;
        }
        if (null == index) {//如果没有输入页数的话，择默认显示第一页
            index = 1;
        }
        resultPage = clientService.SelectQuery(userId, typeId, index);
        return resultPage;
    }

    /**
     * 用户查询对应客户的个人信息
     *
     * @param userId   用户的ID(可能要用到后面进行操作)
     * @param clientId 查询那个客户的信息
     * @param session  将数据存到session中，用于跳转页面的显示
     * @return 戴辆
     */
    @RequestMapping(value = "/particulars")
    public String Particulars(Integer userId, Integer clientId, HttpSession session) {
        ResultPage resultPage = new ResultPage();
        if (null == userId || null == clientId) {
            session.setAttribute("code", 300);
            session.setAttribute("message", "当前异常");
        } else {
            //接受数据库传来的数据
            resultPage = clientService.Particulars(userId, clientId);
            //存到session中，带到其他页面中去
            session.setAttribute("resultPage", resultPage);
        }
        return "index";
    }

    /**
     * 客户的生日提醒
     *
     * @param userId 用户的userId
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/birthday")
    public ResultPage Birthday(Integer userId, Integer index) {
        //创建获取数据的实体
        ResultPage resultPage = new ResultPage();
        if (null == userId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前的异常,请稍后再试");
            return resultPage;
        }
        if (null == index) {//如果没有传入页数的话，则表示查询第一页的数据
            index = 1;
        }
        //获取当前的时间，将当前时间存到数据库中
        Date now = new Date();
        //设置时间的编码格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //获取当天的时间节点（日期的格式为：0101，表示一月一号）
        String data = dateFormat.format(now).substring(5, 10).replace("/", "");
        //将当前的时间转换成int类型
        int Time = Integer.parseInt(data);
        String NewTime = "";
        //判断当前是不是十二月，如果是十二月的话，则另其下一月为1月
        if (Integer.parseInt(data.substring(0, 2)) == 12) {
            //截取当前的月数是多少
            NewTime = 01 + data.substring(3, 4);
        } else {
            //当前的月数如果不是，十二月的话，只需要令月数+1就可以了
            NewTime = ((Integer.parseInt(data.substring(0, 2)) + 01) + data.substring(2, 4));
        }
        resultPage = clientService.Birthday(userId, Time, NewTime, index);
        return resultPage;
    }

    /**
     * 用户的快到车险的客户
     *
     * @param index  显示多少页的数据
     * @param userId 用户的userId
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/insurance")
    public ResultPage InsuranceWarn(Integer userId, Integer index) {
        //创建接受数据的实体来接受数据
        ResultPage resultPage = new ResultPage();
        //判断userId是不是为空，如userId 为空的话，则表示当前出现异常。程序终止
        if (null == userId) {
            //300表示异常
            resultPage.setCode(300);
            //表示异常返回的数据
            resultPage.setMessage("当前异常，请稍后再试");
            //终止程序将数据返回给前台
            return resultPage;
        }
        //判断传入的index是不是为空，如果为空的话，就让其显示第一页的数据
        if (null == index) {
            index = 1;
        }
        //获取电脑当前的时间
        Date now = new Date();
        //创建Calendar实例
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);   //设置当前时间
        //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将当前的时间存起来
        String Time = format.format(cal.getTime());
        //在当前的基础上，增加一个月
        cal.add(Calendar.MONTH, 1);
        //将加了一个月之后的时间存起来，用来比较搜索查询，在这个一个月时间之内的数据
        String NewTime = format.format(cal.getTime());
        //用resultPage来接受后端传来的数据
        resultPage = clientService.InsuranceWarn(userId, Time, NewTime, index);
        return resultPage;
    }
}
