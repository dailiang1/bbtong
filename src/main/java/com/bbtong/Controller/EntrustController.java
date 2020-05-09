package com.bbtong.Controller;

import com.bbtong.Pojo.Entrust;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 委托订单表
 */

@Controller
@RequestMapping("/entrust")
public class EntrustController {

    @Autowired
    private EntrustService entrustService;

    /**
     * 客户发布订单委托的方法
     *
     * @param entrust 这里面用来接受前端传来的数据
     *                userId 用户的ID
     *                insuranceCompanyName 保险公司名称(发布委托用户的保险公司的名称，用来显示是哪家保险的代理人)
     *                insuranceCompanyId 指定对应要出的保单公司的ID
     *                licensePlateNumber 必填选项，车牌号码
     *                entrustCarBrand  车的品牌(如：大众，奔驰等)
     *                entrustAddress 前端选择对应的城市，直接存储城市的字符串
     *                entrustRemark 委托的备注
     *                entrustGrade 订单的评定(0满意，1一般，2不满意)
     *                entrustStartTime 委托单开始的时间(获取下单时候的时间)
     *                entrustEndTime 委托单结束的时间
     *                carTypeId 车类型表的ID(表示新车或旧车)
     *                amountRangeId 车保类型的价格范围表ID
     *                entrustInsure 需要投保些什么类型的保险，自己语言描述
     *                entrustServiceCharge 期望委托的服务费(可以为空，私下交易联系)
     *                entrustMoney 委托的金额
     *                entrustReturnMoney 需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置
     *                entrustReturnTime 还单的时间，多久之内把单给还了(用天来做单位) 在评分结束之后在评分的时间上，再加上这个日期
     *                entrustBusiness 是否投保商业车损险(0表示不投，1表示投。默认选择是1)
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add")
    public Result AddEntrust(Entrust entrust) {
        //创建实体类数据来接受serviceImpl层的数据
        Result result = new Result();
        //用null和userId去比较，如果为true的话则表示，没有获取到用户的userId
        if (null == entrust.getUserId()) {
            result.setCode(300);
            result.setMessage("当前异常，请稍后再试");
            return result;
        }
        //判断有没有获取到，用户的保险公司名称
        if (null == entrust.getInsuranceCompanyName()) {
            result.setCode(300);
            result.setMessage("没有保险公司的名称");
            return result;
        }
        //判断有没有保险公司名称(发布委托用户的保险公司的名称，用来显示是哪家保险的代理人)
        if (null == entrust.getInsuranceCompanyName()) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //判断有没有对应要出的保险公司的ID
        if (null == entrust.getInsuranceCompanyId()) {
            //如果没有输入对应的保险公司的ID的话，则让其为所有保险都可以
            entrust.setInsuranceCompanyId(1);
        }
        //判断必填选项，车牌号码是不是为空，如果为空就提示异常
        if (null == entrust.getLicensePlateNumber()) {
            result.setCode(300);
            result.setMessage("车牌号为空");
            return result;
        }
        //判断投保车辆的品牌(如：大众，奥迪)
        if (null == entrust.getEntrustCarBrand()) {
            result.setCode(300);
            result.setMessage("没有输入车的品牌");
            return result;
        }
        //判断有没有输入投保的城市
        if (null == entrust.getEntrustAddress()) {
            result.setCode(300);
            result.setMessage("没有获取到下单的城市");
            return result;
        }
        //如果没有选择车类型的表的ID，则默认表示旧车续保
        if (null == entrust.getCarTypeId()) {
            entrust.setCarTypeId(2);
        }
        //车保类型的价格范围ID，默认表30以下的车保
        if (null == entrust.getAmountRangeId()) {
            entrust.setAmountRangeId(1);
        }
        //判断需要投保些什么保险，自己语言描述
        if (null == entrust.getEntrustInsure()) {
            result.setCode(300);
            result.setMessage("请输入要投保些什么保险");
            return result;
        }
        //判断是否输入了保费金额
        if (null == entrust.getEntrustMoney()) {
            result.setCode(300);
            result.setMessage("请输入保费金额");
            return result;
        }
        //判断有没有输入还单的金额,如果没有输入的话就为百分之50
        if (null == entrust.getEntrustReturnMoney()) {
            entrust.setEntrustReturnMoney(entrust.getEntrustMoney() * 0.5);
        }
        //判断有没有还单的时间期限,如果没有设置时间期限的话，就在这单完成之后的七天之内
        if (null == entrust.getEntrustReturnTime()) {
            entrust.setEntrustReturnTime(7);
        }
        //判断是否购买商业车损险,1表示投保商业车损险
        if (null == entrust.getEntrustBusiness()) {
            entrust.setEntrustBusiness(1);
        }

        //获取当前的时间，将当前时间存到数据库中
        Date now = new Date();
        //设置时间的编码格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //将当前的时间存到数据中
        entrust.setEntrustStartTime(dateFormat.format(now));

        //如果没有设置委托单结束的时间，就默认为1天之后自动结束
        if (null == entrust.getEntrustEndTime()) {
            //获取当前日期
            Date date = new Date();

            //创建Calendar实例
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);   //设置当前时间

            //在当前的日期上增加一天
            cal.add(Calendar.DAY_OF_WEEK, 1);
            //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将一天之后的时间存到对应的数据中
            entrust.setEntrustEndTime(format.format(cal.getTime()));
        }
        //将数据传到后端，用result来接收
        result = entrustService.AddEntrust(entrust);
        return result;
    }

    /**
     * 大家保险的用户查询自己委托
     *
     * @param userId 当前用户的ID
     * @param index  当前是多少页
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/daselect")
    public ResultPage DaSelectEntrust(Integer userId, Integer index) {
        //创建实体来接受后面的数据
        ResultPage resultPage = new ResultPage();
        //用来判断是否获取到userId，如果没有则表示异常
        if (null == userId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常请稍后再试");
            return resultPage;
        }
        //p判断有没有输入页数，没有的话就让其显示第一页
        if (null == index) {
            index = 1;
        }
        //接收service层传来的数据
        resultPage = entrustService.DaSelectEntrust(userId, index);
        return resultPage;
    }

    /**
     * 大家保险的用户查询自己待处理的委托，对委托进行操作
     *
     * @param userId    用户的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/daparticulars")
    public Result DaParticulars(Integer userId, Integer entrustId) {
        //用来接收对应的数据
        Result result = new Result();
        //用来判断数据是否为空,如果用户的userId或entrustId为空的话则表示当前的异常
        if (null == userId || null == entrustId) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        //将数据传到service层去进行查询，并接受service返回的数据
        result = entrustService.DaParticulars(userId, entrustId);
        return result;
    }

    /**
     * 将委托单派给指定的人
     * @param entrustId  委托的ID
     * @param userId    发布委托的人
     * @param finallyUserId 接单的人
     * @param friendName  接单人的姓名
     * @param friendPhone  接单人的电话
     * @param InsuranceCompanyName  接单人的保险公司名称
     * @return 戴辆
     */
    @ResponseBody
    @RequestMapping(value = "/sendorders")
    public ResultPage SendOrders(Integer userId, Integer finallyUserId, Integer entrustId,String friendName,String friendPhone,String InsuranceCompanyName) {
        //创建resultPage的实体来接收数据
        ResultPage resultPage = new ResultPage();
        //判断userId和newUserId是否为空，如为空的话，则说明当前异常
        if (null == userId || null == finallyUserId||null==entrustId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常，请稍后再试");
            return resultPage;
        }
        try {
            resultPage=entrustService.SendOrders(userId, finallyUserId, entrustId,friendName,friendPhone,InsuranceCompanyName);
        }catch (Exception e){
            resultPage.setCode(500);
            resultPage.setMessage("执行过程中出现异常");
            return  resultPage;
        }
        return resultPage;
    }
}
