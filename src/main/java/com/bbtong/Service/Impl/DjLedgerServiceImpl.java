package com.bbtong.Service.Impl;

import com.bbtong.Base.dj.*;
import com.bbtong.Dao.DjLedgerDao;
import com.bbtong.Pojo.dj.Agent;
import com.bbtong.Pojo.dj.Department;
import com.bbtong.Service.DjLedgerService;
import com.bbtong.Thread.DjLedgerAdminThread;
import com.bbtong.Thread.DjLedgerThread;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.bbtong.custom.Time;
import com.sun.org.apache.xalan.internal.lib.ExsltBase;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 大家保险用户进行日结台账的方法
 */
@Service
public class DjLedgerServiceImpl implements DjLedgerService {

    /**
     * 创建对应的 大家保险用户日结台账的dao层
     */
    @Resource
    private DjLedgerDao djLedgerDao;

    /**
     * 创建线程的实体类
     */
    @Resource
    private DjLedgerThread djLedgerThread;

    /**
     * 创建线程的实体类
     */
    @Resource
    private DjLedgerAdminThread djLedgerAdminThread;


    /**
     * 大家保险的用户查询台账的记录
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result LedgerBook(Integer userId) {
        //创建Result的实体来接受数据
        Result result = new Result();
        Time time = new Time();
        //获取当天保单的交强险和商业险
        DjLedgerThread.LedgerBookThread today = djLedgerThread.new LedgerBookThread(userId, time.todayTime().get("startTime"), time.todayTime().get("endTime"));
        //获取昨天保单的交强险和商业险
        DjLedgerThread.LedgerBookThread yesterday = djLedgerThread.new LedgerBookThread(userId, time.yesterdayTime().get("startTime"), time.yesterdayTime().get("endTime"));
        //获取本周的商业险和交强险
        DjLedgerThread.LedgerBookThread weekly = djLedgerThread.new LedgerBookThread(userId, time.weeklyTime().get("startTime"), time.weeklyTime().get("endTime"));
        //获取本月的商业险和交强险
        DjLedgerThread.LedgerBookThread monthly = djLedgerThread.new LedgerBookThread(userId, time.Monthly().get("startTime"), time.Monthly().get("endTime"));
        //获取本年的商业险和交强险
        DjLedgerThread.LedgerBookThread Year = djLedgerThread.new LedgerBookThread(userId, time.Year().get("startTime"), time.Year().get("endTime"));

        //创建一个线程池大小为5
        ExecutorService service = Executors.newFixedThreadPool(5);
        //启动线程
        Future<Cost> c1 = service.submit(today);
        Future<Cost> c2 = service.submit(yesterday);
        Future<Cost> c3 = service.submit(weekly);
        Future<Cost> c4 = service.submit(weekly);
        Future<Cost> c5 = service.submit(Year);
        LedgerBook ledgerBook = new LedgerBook();
        try {
            //今天商业险的费用
            ledgerBook.setTodayCommercial(c1.get().getCommercial());
            //今天交强险费用
            ledgerBook.setTodayCompulsory(c1.get().getCompulsory());
            //昨天商业险的费用
            ledgerBook.setYesterdayCommercial(c2.get().getCommercial());
            //昨天交强险费用
            ledgerBook.setYesterdayCompulsory(c2.get().getCompulsory());
            //本周商业险费用
            ledgerBook.setWeeklyCommercial(c3.get().getCommercial());
            //本周交强险费用
            ledgerBook.setWeeklyCompulsory(c3.get().getCompulsory());
            //本月商业险费用
            ledgerBook.setInstantCommercial(c4.get().getCommercial());
            //本月交强险费用
            ledgerBook.setInstantCompulsory(c4.get().getCompulsory());
            //本年商业险费用
            ledgerBook.setYearCommercial(c5.get().getCommercial());
            //本年交强险费用
            ledgerBook.setYearCompulsory(c5.get().getCompulsory());
            service.shutdown();//关闭服务
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(ledgerBook);//将数据存到实体中
        } catch (InterruptedException e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        } catch (ExecutionException e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 大家保险的用户查询保单信息  默认查询的是当天的信息
     *
     * @param userId    用户的id
     * @param startTime 起始的时间
     * @param endTime   结束时间
     * @return 戴辆
     */
    //用来判断出现异常的时候进行事务回滚
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage getguaranteeMessage(Integer userId, String startTime, String endTime, Integer index) {
        //创建对应的实体来存储数据
        ResultPage resultPage = new ResultPage();
        //查询当天的数据
        Time time = new Time();
        //判断，如果起始的时间为空的话，就默认查询当天的数据
        if (startTime == null || startTime.equals("")) {
            startTime = time.todayTime().get("startTime");//起始时间
            endTime = time.todayTime().get("endTime");//结束时间
        } else if ((startTime != null || !startTime.equals("")) && (endTime == null || endTime.equals(""))) { //判断如果起始时间不为空，且结束时间为空的话就获取起始时间段到，今天的所有数据
            endTime = time.todayTime().get("endTime");
        }
        //创建对应的map数组来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//用户的id
        map.put("startTime", startTime);//查询数据的起始时间
        map.put("endTime", endTime);//查询数据的结束时间
        Integer start = 0;//忽略前面多少条
        resultPage.setSize(10);//每页显示10条数据
        try {
            //第一步 查询对应的总的条数
            resultPage.setCount(djLedgerDao.getguaranteeMessageNumber(map));
            //计算总的页数
            resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
            //第二步判断页数 是不是为0，如果为0的话 则说明没有数据
            if (resultPage.getPageCount() == 0) {
                resultPage.setCode(200);
                resultPage.setMessage("没有数据");
                return resultPage;
            }
            //判断页数也查询数据
            //第三步 判断当前的页数是不是大于总页数
            if (index >= resultPage.getPageCount()) {
                map.put("end", resultPage.getPageCount() * resultPage.getSize());//显示多少条到多少条的数据
            } else {
                map.put("end", index * resultPage.getSize());//显示多少条到多少条的数据
            }
            map.put("start", start);//忽略前面多少条
            //接收dao层返回的数据
            List<NewDaily> newDailyList = djLedgerDao.getguaranteeMessage(map);
            //将数据存到实体中
            resultPage.setData(newDailyList);
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("出现异常");
        }
        return resultPage;
    }

    /**
     * 查询大家保险 所有的部门消息
     *
     * @return 戴辆
     */
    @Override
    public Result getDepartment() {
        //创建对应的实体类来操作数据
        Result result = new Result();
        try {
            //接收dao层返回的所有部门的信息
            List<Department> newDepartmentList = djLedgerDao.getDepartment();
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(newDepartmentList);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 查询大家保险 所有的代理人
     *
     * @return 戴辆
     */
    @Override
    public Result getAgent() {
        //创建接收返回数据的实体
        Result result = new Result();
        try {
            //接收dao层返回的所有代理人信息
            List<Agent> agentList = djLedgerDao.getAgent();
            result.setCode(200);
            result.setData(agentList);
            result.setMessage("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 大家保险用户用来提交台账
     *
     * @param postDaily 里面存着对应的数据 详情请看对应的实体类
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result postDaily(PostDaily postDaily) {
        //创建对应的实体类来接受数据和返回数据
        Result result = new Result();
        //创建时间类的实体，用来调用当前时间
        Time time = new Time();
        //创建map函数用来存储数据和操作数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将数据存到map函数中
        map.put("userId", postDaily.getUserId());//用户的id
        map.put("userName", postDaily.getUserName());//用户的姓名
        map.put("agentId", postDaily.getAgentId());//代理人的id
        map.put("agentName", postDaily.getAgentName());//代理人的姓名
        map.put("dealerName", postDaily.getDealerName());//车商名称
        map.put("departmentId", postDaily.getDepartmentId());//部门的id
        map.put("departmentName", postDaily.getDepartmentName());//部门的名称
        map.put("licensePlateNumber", postDaily.getLicensePlateNumber());//车牌号
        map.put("compulsory", postDaily.getCompulsory());//交强险金额
        map.put("commercial", postDaily.getCommercial());//商业险金额
        map.put("dailyTime", time.Time().get("Time"));//获取当前的时间
        try {
            //接受返回的值
            int data = djLedgerDao.postDaily(map);
            //判断有没有上传成功
            if (data == 1) {
                result.setCode(200);
                result.setMessage("上传成功");
            } else {
                result.setCode(500);
                result.setMessage("上传失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 大家保险的用户 通过车牌号查询对应的保单信息(支持模糊查询)
     *
     * @param userId             用户的id
     * @param licensePlateNumber 车牌号
     * @return 戴辆
     */
    @Override
    public Result getQueryMessage(Integer userId, String licensePlateNumber) {
        //创建接收和返回数据的实体
        Result result = new Result();
        //创建map函数来接收和存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将数据存到map中
        map.put("userId", userId);//用户的id
        map.put("licensePlateNumber", licensePlateNumber);//车牌号
        try {
            //第一步 先判断通过查询 有没有数据 如果没有就直接return程序
            int price = djLedgerDao.getQueryMessageNumber(map);
            if (price == 0) {//如果他不等于0的话 则说明有数据
                result.setCode(200);
                result.setMessage("没有数据");
                return result;
            }
            //接收service层返回的数据
            List<NewDaily> newDailies = djLedgerDao.getQueryMessage(map);
            if (newDailies != null) {
                result.setCode(200);
                result.setMessage("查询成功");
                result.setData(newDailies);
            } else {
                result.setMessage("内部错误");
                result.setCode(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 管理查询 个人的保单信息 可以通过车牌号和用户的姓名查询
     *
     * @param adminId   管理员的id
     * @param condition 查询条件
     * @param index     当前页数
     * @return 戴辆
     */
    @Override
    public ResultPage getSearchMessage(Integer adminId, String condition, Integer index) {
        //创建对应的实体来存储数据返回
        ResultPage resultPage = new ResultPage();
        //创建map数组来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //第一步 判断条件是车牌号 还是姓名
        //创建一个检测字母的正则表达式
        String regex = ".*[a-zA-Z]+.*";
        //创建Matcher用来接受pattern编译的正则表达式
        Matcher m = Pattern.compile(regex).matcher(condition);
        //判断是否含有字母，如果含有字母的话 就说明是车牌号
        if (m.matches()) {
            //创建一个变量用来接受车牌号
            String licensePlateNumber = condition;
            //将数据存到map中
            map.put("licensePlateNumber", licensePlateNumber);
        } else {//否则就是人名
            //创建一个变量来接受用户名
            String userName = condition;
            map.put("userName", userName);
        }
        try {
            //第一步 查询总条数
            int number = djLedgerDao.getSearchMessageNumber(map);
            //判断条数是不是大于0，如果大于0的话则说明数据没有问题
            if (number > 0) {
                //将总条数存到实体中
                resultPage.setCount(number);
                resultPage.setSize(10);//一页显示十条数据
                //计算总页数,用总条数/每页显示的条数向下取整
                resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
                //第三步 判断当前的页数是不是大于总页数
                if (index >= resultPage.getPageCount()) {
                    map.put("start", (resultPage.getPageCount() - 1) * resultPage.getSize());//显示多少条到多少条的数据
                } else {
                    map.put("start", (index - 1) * resultPage.getSize());//当前页的页数是多少
                }
                map.put("end", resultPage.getSize());//一页显示多少条数据
                List<AdminDaily> adminDailyList = djLedgerDao.getSearchMessage(map);
                resultPage.setIndex(index);//当前是多少页
                resultPage.setCode(200);
                resultPage.setMessage("查询成功");
                resultPage.setData(adminDailyList);//将数据存起来
            } else {
                resultPage.setCode(200);
                resultPage.setMessage("没有数据");
                resultPage.setIndex(index);
                resultPage.setCount(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("内部错误");
        }
        return resultPage;
    }

    /**
     * 管理员查询总台账
     *
     * @return 戴辆
     */
    //出现错误进行事务回滚
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result getSumDaily() {
        //创建Result的实体来接受数据
        Result result = new Result();
        //创建调用时间方法的实体
        Time time = new Time();
        //获取当天保单的交强险和商业险
        DjLedgerAdminThread.SumDaily today = djLedgerAdminThread.new SumDaily(time.todayTime().get("startTime"), time.todayTime().get("endTime"), 1);
        //获取当月保单的交强险和商业险
        DjLedgerAdminThread.SumDaily Monthly = djLedgerAdminThread.new SumDaily(time.Monthly().get("startTime"), time.Monthly().get("endTime"), 2);
        //创建一个线程池大小为2
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<AdminCost> ac1 = executorService.submit(today);
        Future<AdminCost> ac2 = executorService.submit(Monthly);
        //创建对应的实体类来接受数据
        SumCost sumCost = new SumCost();
        try {
            //今天的交强险费用
            sumCost.setTodaySumCompulsory(ac1.get().getCompulsory());
            //今天商业险费用
            sumCost.setTodaySumCommercial(ac1.get().getCommercial());
            //今天交强险的占比
            sumCost.setTodaySumCompulsoryPercentage(ac1.get().getPercentageCompulsory());
            //今天商业险的占比
            sumCost.setTodaySumCommercialPercentage(ac1.get().getPercentageCommercial());
            //本月交强险费用
            sumCost.setMonthSumCompulsory(ac2.get().getCompulsory());
            //本月商业险费用
            sumCost.setMonthSumCommercial(ac2.get().getCommercial());
            //本月交强险占比
            sumCost.setMonthSumCompulsoryPercentage(ac2.get().getPercentageCompulsory());
            //本月商业险占比
            sumCost.setMonthSumCommercialPercentage(ac2.get().getPercentageCompulsory());
            executorService.shutdown();//关闭服务
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(sumCost);//将数据存到实体中
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        } catch (InternalError i) {
            i.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 管理员查询对应月份的金额 和 占比
     *
     * @param adminId 管理员id
     * @param month   月份
     * @return 戴辆
     */
    @Override
    public Result getMonth(Integer adminId, Integer month) {
        //创建对应的实体类来存储和返回数据
        Result result = new Result();
        //创建时间类的实体用来获取指定的时间
        Time time = new Time();
        //获取指定月数的交强险和商业险占比
        DjLedgerAdminThread.SumDaily Monthly = djLedgerAdminThread.new SumDaily(time.appointMonthly(month).get("startTime"), time.appointMonthly(month).get("endTime"), 2);
        //创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //启动线程
        Future<AdminCost> ac = executorService.submit(Monthly);
        try {
            //创建一个实体来接受返回的数据
            AdminCost adminCost = ac.get();
            result.setData(adminCost);//将数据存到实体中
            result.setCode(200);
            result.setMessage("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        } catch (InternalError i) {
            i.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 管理员 查询对应时间段 的代理人或部门的 交强险和商业险占比
     *
     * @param startTime    起始时间
     * @param endTime      结束时间
     * @param departmentId 部门id
     * @param agentId      代理人id
     * @return 戴辆
     */
    //出现错误进行事务回滚
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result getSumSelect(String startTime, String endTime, Integer departmentId, Integer agentId) {
        //创建对应的实体来接受和存储数据
        Result result = new Result();
        //查询当天的数据
        Time time = new Time();
        //判断，如果起始的时间为空的话，就默认查询当天的数据
        if (startTime == null || startTime.equals("")) {
            startTime = time.todayTime().get("startTime");//起始时间
            endTime = time.todayTime().get("endTime");//结束时间
        } else if ((startTime != null || !startTime.equals("")) && (endTime == null || endTime.equals(""))) { //判断如果起始时间不为空，且结束时间为空的话就获取起始时间段到，今天的所有数据
            endTime = time.todayTime().get("endTime");
        }
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startTime", startTime);//起始时间
        map.put("endTime", endTime);//结束时间
        map.put("departmentId", departmentId);//部门的id
        map.put("agentId", agentId);//代理人的id
        //创建接收返回数据的实体
        AdminCost adminCost = null;
        try {
            //接受dao层返回的数据
            adminCost=djLedgerDao.getSumSelect(map);
            if (adminCost == null) {
                adminCost = new AdminCost();
                //就将交强险和商业险赋值为0.0
                adminCost.setCommercial(0.0);
                adminCost.setCompulsory(0.0);
                adminCost.setPercentageCommercial("0%");
                adminCost.setPercentageCompulsory("0%");
            } else {
                //接受这个月 或者 是这一年的交强险和商业金额
                Cost cost = djLedgerAdminThread.percentage(2);
                //后面的两0表示保留几位小数
                DecimalFormat df = new DecimalFormat("#.00");
                //计算这天或这月在本月或本年的占比
                adminCost.setPercentageCommercial(df.format((adminCost.getCommercial() / cost.getCommercial()) * 100) + "%");
                adminCost.setPercentageCompulsory(df.format((adminCost.getCompulsory() / cost.getCompulsory()) * 100) + "%");
            }
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(adminCost);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("内部错误");
        }
        return result;
    }

}
