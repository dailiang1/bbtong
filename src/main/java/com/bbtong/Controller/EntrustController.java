package com.bbtong.Controller;

import com.bbtong.Pojo.Entrust;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultHave;
import com.bbtong.Util.ResultPage;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.spring.web.json.Json;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 委托订单表
 */

@CrossOrigin(allowCredentials = "true")
@Controller
@RequestMapping("/entrust")
public class EntrustController {

    @Autowired
    private EntrustService entrustService;

    /**
     * 大家保险用户发布订单委托的方法
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
    @ApiOperation(value = "用户发布委托的方法", notes = "大家保险用户发布委托的方法", tags = "Add", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "insuranceCompanyName", value = "保险公司名称(发布委托用户的保险公司的名称，用来显示是哪家保险的代理人)", required = true, dataType = "String"),
            @ApiImplicitParam(name = "insuranceCompanyId", value = "指定对应要出的保单公司的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "licensePlateNumber", value = "必填选项，车牌号码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "entrustCarBrand", value = "车的品牌(如：大众，奔驰等)", required = true, dataType = "String"),
            @ApiImplicitParam(name = "entrustAddress", value = "前端选择对应的城市，直接存储城市的字符串", required = true, dataType = "String"),
            @ApiImplicitParam(name = "entrustRemark", value = "委托的备注", required = true, dataType = "String"),
            @ApiImplicitParam(name = "carTypeId", value = "车类型表的ID(表示新车或旧车,可以不传默认为旧车)", required = false, dataType = "Integer"),
            @ApiImplicitParam(name = "amountRangeId", value = "车保类型的价格范围表ID(可以不传默认为30以上)", required = false, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustInsure", value = "需要投保些什么类型的保险，自己语言描述", required = true, dataType = "String"),
            @ApiImplicitParam(name = "entrustServiceCharge", value = "期望委托的服务费(可以为空，私下交易联系)", required = false, dataType = "Double"),
            @ApiImplicitParam(name = "entrustMoney", value = "委托的金额", required = true, dataType = "Double"),
            @ApiImplicitParam(name = "entrustReturnMoney", value = "需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置，为空的话就为百分之50", required = false, dataType = "Double"),
            @ApiImplicitParam(name = "entrustReturnTime", value = "还单的时间，多久之内把单给还了(用天来做单位) 在评分结束之后在评分的时间上，再加上这个日期，可以为空默认为一个月（按三十天计算）", required = false, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustBusiness", value = "是否投保商业车损险(0表示不投，1表示投。默认选择是1)", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    Result AddEntrust(Entrust entrust) {
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
        //判断还单的金额是不是大于了百分之五十，如果大于了百分之五十就设置为百分之五十
        if (entrust.getEntrustReturnMoney() >= (entrust.getEntrustMoney() * 0.5)) {
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
     * 大家保险的用户查询自己待处理的委托
     *
     * @param userId 当前用户的ID
     * @param index  当前是多少页
     * @return
     */
    @ApiOperation(value = "待处理的委托的方法", notes = "大家保险用户查询自己待处理的委托", tags = "DaSelect", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "index", value = "当前页的页数，可以为空(为空的话默认为第一页)", required = false, dataType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/daselect", method = RequestMethod.GET)
    public @ResponseBody
    ResultPage DaSelectEntrust(Integer userId, Integer index) {
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

    @ApiOperation(value = "对指定委托进行操作的方法", notes = "大家保险用户通过，查询自己指定的委托，对委托进行操作(指定接单人)", tags = "DaParticulars", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的Id", required = false, dataType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/daparticulars", method = RequestMethod.POST)
    public @ResponseBody
    Result DaParticulars(Integer userId, Integer entrustId) {
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
     *
     * @param entrustId            委托的ID
     * @param userId               发布委托的人
     * @param finallyUserId        接单的人Id
     * @param friendName           接单人的姓名
     * @param friendPhone          接单人的电话
     * @param InsuranceCompanyName 接单人的保险公司名称
     * @return 戴辆
     */
    @ApiOperation(value = "委托指定对应的人的方法", notes = "大家保险将对应的订单指定给对应的人，1.在有委托有意向的人里面，指派对应的人，并且将这个人的状态修改成不可接单，2.并且将其他人修改成可以有意向其他委托,3.两个人确定好友关系，4.将信息写入到接单表中", tags = "Sendorders", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "发布委托人的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "finallyUserId", value = "接单人的Id", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的Id", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "friendName", value = "接单人的id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "friendPhone", value = "接单人的电话", required = true, dataType = "String"),
            @ApiImplicitParam(name = "InsuranceCompanyName", value = "接单人的保险公司名称", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultPage.class),
            @ApiResponse(code = 300, message = "异常", response = ResultPage.class),
            @ApiResponse(code = 400, message = "失败", response = ResultPage.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultPage.class),
    })
    @RequestMapping(value = "/sendorders", method = RequestMethod.POST)
    public @ResponseBody
    ResultPage SendOrders(Integer userId, Integer finallyUserId, Integer entrustId, String friendName, String friendPhone, String InsuranceCompanyName) {
        //创建resultPage的实体来接收数据
        ResultPage resultPage = new ResultPage();
        //判断userId和newUserId是否为空，如为空的话，则说明当前异常
        if (null == userId || null == finallyUserId || null == entrustId) {
            resultPage.setCode(300);
            resultPage.setMessage("当前异常，请稍后再试");
            return resultPage;
        }
        //接收后面传来的数据
        resultPage = entrustService.SendOrders(userId, finallyUserId, entrustId, friendName, friendPhone, InsuranceCompanyName);
        return resultPage;
    }

    /**
     * 委托人查看自己发布的委托
     *
     * @param userId 委托人的userId
     * @return 戴辆
     */
    @ApiOperation(value = "查看自己所有的委托的方法", notes = "大家保险用户查看自己发布过的所有委托，根据时间排序", tags = "Issue", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/issue", method = RequestMethod.GET)
    public @ResponseBody
    Result IssueRecord(Integer userId) {
        //创建result函数来接收数据
        Result result = new Result();
        //判断userId是不是为空，如果为空的话，则说名出现异常
        if (null == userId) {
            result.setCode(3000);
            result.setMessage("当前异常");
            return result;
        }
        //创建函数来接受service层返回的数据
        result = entrustService.IssueRecord(userId);
        return result;
    }

    /**
     * 查看用户的接单记录
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    @ApiOperation(value = "查看用户的接单记录的方法", notes = "其他保险公司的用户查看自己接单的记录", tags = "Order", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public @ResponseBody
    Result OrderRecord(Integer userId) {
        //创建函数俩接受数据，以及返回数据
        Result result = new Result();
        //判断userId是不是为空，如果为空的话，则说名出现异常
        if (null == userId) {
            result.setCode(3000);
            result.setMessage("当前异常");
            return result;
        }
        //创建函数来接受service层返回的数据
        result = entrustService.OrderRecord(userId);
        return result;
    }

    /**
     * 用户有意向委托
     *
     * @param userId    用户的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    @ApiOperation(value = "用户对委托提交有意向的方法", notes = "用户对当前委托，提交有意向申请", tags = "Have", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultHave.class),
            @ApiResponse(code = 300, message = "异常", response = ResultHave.class),
            @ApiResponse(code = 400, message = "失败", response = ResultHave.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultHave.class),
            @ApiResponse(code = 100001, message = "表示没有开通年费", response = ResultHave.class),
            @ApiResponse(code = 100002, message = "表示诚信不够", response = ResultHave.class),
            @ApiResponse(code = 100003, message = "表示已经接单", response = ResultHave.class),
            @ApiResponse(code = 100004, message = "表示没有意向的机会", response = ResultHave.class),
            @ApiResponse(code = 100005, message = "表示没有实名", response = ResultHave.class),
            @ApiResponse(code = 100006, message = "表示实名待审核", response = ResultHave.class),
            @ApiResponse(code = 100007, message = "表示实名审核没有通过", response = ResultHave.class),
            @ApiResponse(code = 100008, message = "表示没有同意同意委托公约", response = ResultHave.class),
            @ApiResponse(code = 100009, message = "当前已经意向了", response = ResultHave.class),
            @ApiResponse(code = 100010, message = "出现未知错误", response = ResultHave.class),
            @ApiResponse(code = 100011, message = "非法访问", response = ResultHave.class),
    })
    @RequestMapping(value = "/have", method = RequestMethod.POST)
    public @ResponseBody
    ResultHave HaveEntrust(Integer userId, Integer entrustId) {
        //创建函数来接受返回的值
        ResultHave resultHave = new ResultHave();
        if (null == userId || null == entrustId) {
            resultHave.setCode(300);
            resultHave.setMessage("当前异常，请稍后再试");
            return resultHave;
        }
        resultHave = entrustService.HaveEntrust(userId, entrustId);
        return resultHave;
    }

    /**
     * 查询显示用户有意向的订单的信息
     *
     * @param userId 用户的userId
     * @return 戴辆
     */
    @ApiOperation(value = "用户显示自己有意向的订单的信息方法", notes = "查询用户有意向的订单信息", tags = "UserIntention", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultHave.class),
            @ApiResponse(code = 300, message = "异常", response = ResultHave.class),
            @ApiResponse(code = 400, message = "失败", response = ResultHave.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultHave.class),
            @ApiResponse(code = 100001, message = "表示没有开通年费", response = ResultHave.class),
            @ApiResponse(code = 100002, message = "表示诚信不够", response = ResultHave.class),
            @ApiResponse(code = 100003, message = "表示已经接单", response = ResultHave.class),
            @ApiResponse(code = 100004, message = "表示没有意向的机会", response = ResultHave.class),
            @ApiResponse(code = 100005, message = "表示没有实名", response = ResultHave.class),
            @ApiResponse(code = 100006, message = "表示实名待审核", response = ResultHave.class),
            @ApiResponse(code = 100007, message = "表示实名审核没有通过", response = ResultHave.class),
            @ApiResponse(code = 100008, message = "表示没有同意同意委托公约", response = ResultHave.class),
            @ApiResponse(code = 100009, message = "当前已经意向了", response = ResultHave.class),
            @ApiResponse(code = 100010, message = "出现未知错误", response = ResultHave.class),
            @ApiResponse(code = 100011, message = "非法访问", response = ResultHave.class),
    })
    @RequestMapping(value = "/userintention", method = RequestMethod.GET)
    public @ResponseBody
    ResultHave UserIntention(Integer userId) {
        //创建实体来进行数据的操作
        ResultHave resultHave = new ResultHave();
        //判断userId是否为空，如果为空的话，则说明数据有问题
        if (null == userId) {
            resultHave.setCode(300);
            resultHave.setMessage("当前异常");
            return resultHave;
        }
        //将数据接收返回到前端首页
        resultHave = entrustService.UserIntention(userId);
        return resultHave;
    }

    /**
     * 用户取消自己当前有意向的订单信息
     *
     * @param entrustId 委托的ID
     * @param userId    用户ID
     * @return 戴辆
     */
    @ApiOperation(value = "用户取消委托意向方法", notes = "用户取消自己当前有意向的委托的方法", tags = "OffIntention", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/offintention", method = RequestMethod.GET)
    public @ResponseBody
    Result OffIntention(Integer userId, Integer entrustId) {
        //创建实体类来接受数据，和返回数据
        Result result = new Result();
        if (null == userId || null == entrustId) {
            result.setCode(300);
            result.setMessage("当前异常，请稍后再试");
            return result;
        }
        //利用实体类来接受service层返回的实体
        result = entrustService.OffIntention(userId, entrustId);
        return result;
    }

    /**
     * 用户查询他当前正在处理的委托
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    @ApiOperation(value = "查询用户当前正在处理的委托", notes = "用户查询他当前正在处理的委托", tags = "QueryEntrust", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultHave.class),
            @ApiResponse(code = 300, message = "异常", response = ResultHave.class),
            @ApiResponse(code = 400, message = "失败", response = ResultHave.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultHave.class),
            @ApiResponse(code = 100001, message = "表示没有开通年费", response = ResultHave.class),
            @ApiResponse(code = 100002, message = "表示诚信不够", response = ResultHave.class),
            @ApiResponse(code = 100003, message = "表示已经接单", response = ResultHave.class),
            @ApiResponse(code = 100004, message = "表示没有意向的机会", response = ResultHave.class),
            @ApiResponse(code = 100005, message = "表示没有实名", response = ResultHave.class),
            @ApiResponse(code = 100006, message = "表示实名待审核", response = ResultHave.class),
            @ApiResponse(code = 100007, message = "表示实名审核没有通过", response = ResultHave.class),
            @ApiResponse(code = 100008, message = "表示没有同意同意委托公约", response = ResultHave.class),
            @ApiResponse(code = 100009, message = "当前已经意向了", response = ResultHave.class),
            @ApiResponse(code = 100010, message = "出现未知错误", response = ResultHave.class),
            @ApiResponse(code = 100011, message = "非法访问", response = ResultHave.class),
    })
    @RequestMapping(value = "/queryentrust", method = RequestMethod.GET)
    public @ResponseBody
    ResultHave QueryEntrust(Integer userId) {
        //创建实体来接受数据
        ResultHave resultHave = new ResultHave();
        //判断有没有获取到userId,如果没有的话就说明出现了异常
        if (null == userId) {
            resultHave.setCode(300);
            resultHave.setMessage("出现异常请稍后再试");
            return resultHave;
        }
        //接受后端传来的数据
        resultHave = entrustService.QueryEntrust(userId);
        return resultHave;
    }

    /**
     * 用户确认完成了委托
     *
     * @param userId             委托人的ID
     * @param newUserId          接单人的ID
     * @param entrustId          委托的ID
     * @param entrustReturnMoney 委托需要还单的金额
     * @param entrustReturnTime  委托还单的期限(多少天，用天做单位然后转换)
     * @return 戴辆
     */
    @ApiOperation(value = "用户完成委托，提交完成申请", notes = "用户完成了大家保险的委托，向委托人提交完成委托的申请", tags = "Accomplish", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "委托人的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "newUserId", value = "接单人的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustReturnMoney", value = "委托需要还单的金额", required = true, dataType = "Double"),
            @ApiImplicitParam(name = "entrustReturnTime", value = "委托还单的期限(多少天，用天做单位然后转换)", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/accomplish", method = RequestMethod.POST)
    public @ResponseBody
    Result Accomplish(Integer userId, Integer newUserId, Integer entrustId, Double entrustReturnMoney, Integer entrustReturnTime) {
        //创建函数来进行操作
        Result result = new Result();
        //判断有没有获取到userId，newUserId,entrustId,entrustReturnMoney,entrustReturnTime这些数据的信息
        if (null == userId || null == newUserId || null == entrustId || null == entrustReturnMoney || null == entrustReturnTime) {
            result.setCode(300);
            result.setMessage("当前异常，请稍后再试");
            return result;
        }
        result = entrustService.Accomplish(userId, newUserId, entrustId, entrustReturnMoney, entrustReturnTime);
        return result;
    }

    /**
     * 委托人确认审核对应的委托是否完成了，如果完成了的话，就将委托的状态修改
     *
     * @param userId    用户ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    @ApiOperation(value = "委托人确认委托完成(接单人完成委托，还没有还单)", notes = "委托人确认审核对应的委托是否完成了，如果完成了的话，就将委托的状态修改", tags = "DaAffirm", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/daaffirm", method = RequestMethod.POST)
    public @ResponseBody
    Result DaAffirm(Integer userId, Integer entrustId) {
        //创建result函数来操作数据
        Result result = new Result();
        //判断参数的问题，如果参数为null的话则说明出现了异常
        if (null == userId || null == entrustId) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        result = entrustService.DaAffirm(userId, entrustId);
        return result;
    }

    /**
     * 用户查询正在处理委托，的还单记录
     *
     * @param userId    用户的ID
     * @param entrustId 当前正在处理的委托的ID
     * @return 戴辆
     */
    @ApiOperation(value = "用户查询正在处理的委托的还单记录", notes = "用户查询正在处理委托的还单记录", tags = "SelectDeliveryOrder", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户的Id", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "entrustId", value = "委托的Id", required = true, dataType = "Integer"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = Result.class),
            @ApiResponse(code = 300, message = "异常", response = Result.class),
            @ApiResponse(code = 400, message = "失败", response = Result.class),
            @ApiResponse(code = 500, message = "内部错误", response = Result.class),
    })
    @RequestMapping(value = "/selectdeliveryorder", method = RequestMethod.GET)
    public @ResponseBody
    Result UserSelectDeliveryOrder(Integer userId, Integer entrustId) {
        //创建实体类来接受数据
        Result result = new Result();
        //判断有没有获取到userId来判断有没有异常
        if (null == userId) {
            result.setCode(300);
            result.setMessage("当前异常");
            return result;
        }
        result = entrustService.UserSelectDeliveryOrder(userId, entrustId);
        return result;
    }

    /**
     * 接单的用户还单的方法 将数据存的还单表中
     *
     * @param newUserId           用户的ID (还单人的ID)
     * @param deliveryOrderNumber (还单的车牌号)
     * @param deliveryOrderMoney  (还单委托的金额)
     * @return 戴辆
     */
    @ApiOperation(value = "用户对委托进行还单的方法", notes = "用户完成接单的委托之后，对委托进行还单", tags = "UserAlso", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "newUserId", value = "  用户的ID (还单人的ID)", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "deliveryOrderNumber", value = "还单的车牌号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "deliveryOrderMoney", value = "还单委托的金额", required = true, dataType = "Double"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = ResultHave.class),
            @ApiResponse(code = 300, message = "异常", response = ResultHave.class),
            @ApiResponse(code = 400, message = "失败", response = ResultHave.class),
            @ApiResponse(code = 500, message = "内部错误", response = ResultHave.class),
            @ApiResponse(code = 100001, message = "表示没有开通年费", response = ResultHave.class),
            @ApiResponse(code = 100002, message = "表示诚信不够", response = ResultHave.class),
            @ApiResponse(code = 100003, message = "表示已经接单", response = ResultHave.class),
            @ApiResponse(code = 100004, message = "表示没有意向的机会", response = ResultHave.class),
            @ApiResponse(code = 100005, message = "表示没有实名", response = ResultHave.class),
            @ApiResponse(code = 100006, message = "表示实名待审核", response = ResultHave.class),
            @ApiResponse(code = 100007, message = "表示实名审核没有通过", response = ResultHave.class),
            @ApiResponse(code = 100008, message = "表示没有同意同意委托公约", response = ResultHave.class),
            @ApiResponse(code = 100009, message = "当前已经意向了", response = ResultHave.class),
            @ApiResponse(code = 100010, message = "出现未知错误", response = ResultHave.class),
            @ApiResponse(code = 100011, message = "非法访问", response = ResultHave.class),
    })
    @RequestMapping(value = "/useralso", method = RequestMethod.POST)
    public @ResponseBody
    ResultHave UserAlso(Integer newUserId, String deliveryOrderNumber, Double deliveryOrderMoney) {
        //创建实体类来接受数据，和返回数据
        ResultHave resultHave = new ResultHave();
        //判断数据有没有写入，如果数据为null 的话，则表示当前操作异常
        if (null == newUserId || null == deliveryOrderMoney || null == deliveryOrderNumber) {
            resultHave.setCode(300);
            resultHave.setMessage("当前异常");
            return resultHave;
        }
        //接受serverImpl中传来的数据,将用户的ID 还单委托的车牌号 还单委托的金额传到下一层中去
        resultHave = entrustService.UserAlso(newUserId, deliveryOrderNumber, deliveryOrderMoney);
        return resultHave;
    }
}
