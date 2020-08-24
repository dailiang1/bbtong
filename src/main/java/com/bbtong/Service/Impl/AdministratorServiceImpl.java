package com.bbtong.Service.Impl;

import com.bbtong.Base.*;
import com.bbtong.Dao.AdministratorDao;
import com.bbtong.Pojo.Admin;
import com.bbtong.Pojo.AdminRole;
import com.bbtong.Pojo.Entrust;
import com.bbtong.Pojo.User;
import com.bbtong.Service.AdministratorService;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.AdminResult;
import com.bbtong.Util.LoginResult;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 管理员方法的serviceImpl方法
 */

@Service
public class AdministratorServiceImpl implements AdministratorService {

    /**
     * 创建dao层的实体
     */
    @Resource
    private AdministratorDao administratorDao;

    /**
     * 获取所有用户的方法 ，默认是获取所有用户 但是可以根据用户的一些信息来进行筛选
     *
     * @param adminUser 里面有四个参数， 用户的名称， 保险公司的id，注册的开始时间和注册的结束时间
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage getAllUser(AdminUser adminUser) {
        //创建实体类ResultPage来存储数据，返回给controller层
        ResultPage resultPage = new ResultPage();
        //第一步判断有没有获取到index
        if (adminUser.getIndex() == null) {
            adminUser.setIndex(1);
        }
        //创建map函数将数据存到map函数中
        Map<String, Object> map = new HashMap<String, Object>();
        //将用户名称存到map中
        map.put("userName", adminUser.getUserName());
        //将保险公司的id存到map中
        map.put("insuranceCompanyId", adminUser.getInsuranceCompanyId());
        //将注册开始的时间存到map中
        map.put("startTime", adminUser.getStartTime());
        //将注册结束的时间的时间存到map中
        map.put("endTime", adminUser.getEndTime());
        //将用户的手机号存到map中
        map.put("userPhone", adminUser.getUserPhone());
        //创建try catch 来监听异常问题
        try {
            //第一步 查询数据的条数
            int count = administratorDao.getAllUserNumber(map);
            if (count > 0) {
                int size = 15;//一页显示的条数
                //计算总的页数
                int pageCount = (int) Math.ceil((double) count / size);
                //判断index和count的关系
                if (adminUser.getIndex() >= pageCount) {
                    //如果是最后一页了，就只显示最后一页的数据
                    map.put("start", (pageCount - 1) * 15);
                } else {
                    //如果不是最后一页就显示，当前页面对应的数据
                    map.put("start", (adminUser.getIndex() - 1) * 15);
                }
                //显示多少条数据
                map.put("end", size);
                //创建一个List数组来接受数据
                List<User> userList = administratorDao.getAllUser(map);
                //将数据存到对应的实体类中，返回给前台
                resultPage.setCode(200);
                resultPage.setCount(count);//总的条数
                resultPage.setMessage("查询成功");//返回的结果
                resultPage.setPageCount(pageCount);//总的页数
                resultPage.setIndex(adminUser.getIndex());//当前页数
                resultPage.setData(userList);//返回的数据
            } else {
                resultPage.setCode(200);
                resultPage.setMessage("当前没有数据");
                resultPage.setCount(0);
                resultPage.setPageCount(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("出现异常");
        }
        return resultPage;
    }

    /**
     * 查询对应用户的详细信息
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @Override
    public Result GetUser(Integer userId) {
        //创建实体类来获取数据
        Result result = new Result();
        //创建map函数来操作数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId存到map函数中
        map.put("userId", userId);
        //创建user的实体类 来接受查询到的user的用户
        LoginUser loginUser = administratorDao.GetUser(map);
        if (loginUser != null) {
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(loginUser);
        } else {
            result.setCode(400);
            result.setMessage("查询失败");
        }
        return result;
    }

    /**
     * 查询什么时间段注册的用户(默认是查询全部的用户)
     *
     * @param adminId            管理员的id
     * @param startTime          起始时间
     * @param endTime            结束时间
     * @param index              当前的页数
     * @param userState          表示对应的状态，加载对应的数据
     * @param userName           用户姓名
     * @param insuranceCompanyId 保险公司的id
     * @param userPhone          用户电话
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage GetNewUser(Integer adminId, String startTime, String endTime, Integer index, Integer userState, String userName, Integer insuranceCompanyId, String userPhone) {
        //创建对应的实体类来操作数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据和操作数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startTime", startTime);//起始的时间
        map.put("endTime", endTime);//结束的时间
        map.put("userState", userState);//表示查询什么数据
        map.put("userName", userName);//表示用户的姓名
        map.put("userPhone", userPhone);//表示用户的电话
        map.put("insuranceCompanyId", insuranceCompanyId);//表示保险公司的id
        //第一步先查询 有多少条数据
        int count = administratorDao.GetNewUserNumber(map);
        int size = 10;//一页显示15条数据
        //第二步 计算有多少页
        int pageCount = (int) Math.ceil((double) count / size);
        //判断当前的页数是不是大于总页数
        if (index >= pageCount) {
            map.put("start", (pageCount - 1) * size);//显示多少条到多少条的数据
        } else {
            map.put("start", (index - 1) * size);//当前页的页数是多少
        }
        map.put("end", size);//一页显示的条数
        if (count > 0) {
            try {
                //获取对应筛选的数据
                List<AdminCheckUser> adminCheckUsers = administratorDao.GetNewUser(map);
                resultPage.setCount(count);//返回总共多少条数据
                resultPage.setSize(size);//每页显示多少条数据
                resultPage.setPageCount(pageCount);//表示一共有多少页
                resultPage.setData(adminCheckUsers);//表示当前页的数据
                resultPage.setCode(200);
                resultPage.setMessage("查询成功");
            } catch (Exception e) {
                e.printStackTrace();
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                resultPage.setCode(300);
                resultPage.setMessage("出现异常");
            }
        } else {
            resultPage.setCount(200);
            resultPage.setCount(0);
            resultPage.setMessage("没有查到数据");
        }
        return resultPage;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result postUserCheck(UserCheck userCheck) {
        //创建result的实体类来接收和返回数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userCheck.getUserId());//用户的id
        map.put("adminMessageTime", userCheck.getAdminMessageTime());//修改用户的时间
        if (userCheck.getAdminMessageRemark() == null) {
            userCheck.setAdminMessageRemark("无");
        }
        map.put("adminMessageRemark", userCheck.getAdminMessageRemark());//管理员对于操作的描述
        map.put("adminId", userCheck.getAdminId());//修改信息的管理员id
        result.setCode(200);
        result.setMessage("修改成功");
        try {
            //第一步 将用户的个人信息修改
            int updateUser = administratorDao.updateUser(userCheck);
            //第二步 将管理员修改用户信息的记录存起来
            int insertAdminMessage = administratorDao.insertAdminMessage(map);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 管理员审核消费卡申请的订单 (超级管理员)
     *
     * @param consumeId 消费卡申请的id
     * @param adminId   管理员
     * @param index     用来表示处理的是什么，index=1 表示成功，index=2表示信息有误
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result getCheckConsume(Integer consumeId, Integer adminId, Integer index) {
        //创建一个实体类来接受和返回数据
        Result result = new Result();
        //创建一个map数组来存储和接受数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将数据存到map中
        map.put("consumeId", consumeId);//消费卡申请表的id
        map.put("adminId", adminId);//管理员的id，
        map.put("consumeState", index);//处理的结果，1表示成功，2表示信息有误
        try {
            //第一步 先根据管理员的id查询管理员的权限id和管理员的姓名
            Admin admin = administratorDao.Admin(map);
            //先判断用户存不存在
            if (admin.getAdminRoleId() == null) {
                result.setCode(400);
                result.setMessage("当前用户不存在");
                return result;
            }
            //判断管理员的权限是否合格。如果不合格的话。就是异常访问
            if (admin.getAdminRoleId() != 1) {
                result.setCode(300);
                result.setMessage("权限不够");
                return result;
            }
            //将用户的姓名存到map中
            map.put("adminName", admin.getAdminName());
            //第二步 将修改的结果存到数据中去
            int zhi = administratorDao.updateConsume(map);
            result.setCode(200);
            result.setMessage("处理成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("管理员不存在或出现异常");
        }
        return result;
    }

    /**
     * 管理员 审核和豆申请
     *
     * @param beansId 和豆申请的id
     * @param adminId 管理员的id
     * @param index   1表示成功， 2表示信息有误
     * @return 戴辆
     */
    @Override
    public Result getCheckBeans(Integer beansId, Integer adminId, Integer index) {
        //创建对应的实体类来接受数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("beansId", beansId);//将和豆申请的id存到map数据中
        map.put("adminId", adminId);//将管理员的id存到map数据中
        map.put("beansState", index);//处理的结果，1表示成功，2表示信息有误
        try {
            //第一步 先根据管理员的id查询管理员的权限和管理员的姓名
            Admin admin = administratorDao.Admin(map);
            //先判断用户存不存在
            if (admin.getAdminRoleId() == null) {
                result.setCode(400);
                result.setMessage("当前用户不存在");
                return result;
            }
            //判断管理员的权限是否合格。如果不合格的话。就是异常访问
            if (admin.getAdminRoleId() != 1) {
                result.setCode(300);
                result.setMessage("权限不够");
                return result;
            }
            //将用户的姓名存到map中
            map.put("adminName", admin.getAdminName());
            //第二步将 将修改的结果存到数据中去
            int zhi = administratorDao.updateBeans(map);
            result.setCode(200);
            result.setMessage("处理成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("管理员不存在或出现异常");
        }
        return result;
    }

    /**
     * 管理员查询总的委托数
     *
     * @return 戴辆
     */
    @Override
    public AdminResult getAdminData() {
        //创建Result来接受数据
        AdminResult adminResult = new AdminResult();
        //创建一个map函数来存储当天的时间
        Map<String, Object> map = new HashMap<String, Object>();
        Calendar cal = Calendar.getInstance();
        //将时间设置成当前日期 0:0::0
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        //获取当前的时间
        Date beginOfDate = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在当前日期下+1
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) + 1, 0, 0, 0);
        //获取当前的时间
        Date newData = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将设置的时间赋值给startTime
        String startTime = formatter.format(beginOfDate);
        //将设置的时间赋值给endTime
        String endTime = newformatter.format(newData);
        map.put("startTime", startTime);//开始的时间
        map.put("endTime", endTime);//结束的时间
        //通过try来捕获异常，进行抛出
        try {
            //第一步查询总的委托数
            int entrustCount = administratorDao.getEntrustCount();
            //第二步查询总的委托人数
            int userCount = administratorDao.getUserCount();
            //第三步查询当天注册的人数
            int newUserCount = administratorDao.getnewUserCount(map);
            //第四步查询当天发布的委托数
            int newEntrustCount = administratorDao.getnewEntrustCount(map);
            //将查询的总委托数存到对应的数据中
            adminResult.setEntrustCount(entrustCount);
            //将查询的总的委托人数存到对应的数据中
            adminResult.setUserCount(userCount);
            //将查询的当天注册的人数存到对应的数据中
            adminResult.setNewUserCount(newUserCount);
            //将查询的当天发布的委托存到对应的数据中
            adminResult.setNewEntrustCount(newEntrustCount);
            adminResult.setCode(200);
            adminResult.setMessage("查询成功");
        } catch (Exception e) {//如果有异常就会进catch中
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            adminResult.setCode(300);
            adminResult.setMessage("出现异常");
        }
        return adminResult;
    }

    /**
     * 管理员处理注册用户的信息
     *
     * @param adminId   管理员id
     * @param userId    用户的id
     * @param testState 确认信息(0待审核，1已审核，2信息错误)
     * @param userState 用户的状态(0没有实名，1待审核，2审核没通过，3实名认证了)
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result getLoginCheck(Integer adminId, Integer userId, Integer testState, Integer userState) {
        //创建对应的实体来接受和返回数据
        Result result = new Result();
        //创建map函数来存储数据，用于后面的数据操作
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("adminId", adminId);//管理员id
        map.put("userId", userId);//用户的id
        map.put("testState", testState);//是否确认信息
        map.put("userState", userState);//用户实名的状态
        map.put("adminMessageRemark", userState == 1 ? "实名成功" : "实名失败");//通过userState来判断实名是否成功
        //指定获取当前的时间
        Calendar cal = Calendar.getInstance();
        //将时间设置成当前日期 0:0::0
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        //获取当前的时间
        Date beginOfDate = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将时间存到map中
        map.put("adminMessageTime", formatter.format(beginOfDate));
        try {
            //第一步 将用户的数据进行修改
            int updateUser = administratorDao.getLoginCheck(map);
            //第二步 将信息存到管理员信息表中
            int insertAdminMessage = administratorDao.insertAdminMessage(map);
            result.setCode(200);
            result.setMessage("审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 通过管理员权限id
     *
     * @param adminId 管理员id
     * @return 戴辆
     */
    @Override
    public Integer GetadminRoleId(Integer adminId) {
        //创建对应的管理员的实体类来接受和存储数据
        Admin admin = new Admin();
        //查询对应的管理员的数据
        admin = administratorDao.GetadminRoleId(adminId);
        //创建一个adminRoleId的参数默认值为0
        Integer adminRoleId = 0;
        //判断返回的数据是不是为空，如果数据为空的话，则说明数据有问题
        if (admin == null) {
            //编码10001代表用户不存在
            adminRoleId = 10001;
        } else if (admin.getAdminRoleId() == 1) {//判断返回的管理员权限id，是不是1，如果不是1的话则说明数据权限不够
            adminRoleId = admin.getAdminRoleId();
        } else {
            //如果权限不为1的话 就将权限id赋值给参数， 然后返回给controller层
            adminRoleId = admin.getAdminRoleId();
        }
        return adminRoleId;
    }

    /**
     * 超级管理员查询 对应用户的信息
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @Override
    public Result getCheck(Integer userId) {
        //创建Result的实体来操作数据
        Result result = new Result();
        //查询对应用户的数据，并且返回
        User user = administratorDao.getCheck(userId);
        //第一步 判断有没有获取到数据
        if (user == null) {
            result.setCode(400);
            result.setMessage("获取失败,没有数据");
            return result;
        }
        result.setCode(200);
        result.setMessage("成功");
        result.setData(user);//将数据存到实体类中去
        return result;
    }

    /**
     * 超级管理员修改用户的信息(在用户信息出现错误的情况下)
     *
     * @param userId          用户的id
     * @param testState       确认信息(做成一个捆绑)
     * @param userState       实名的状态 (0 表示没有实名，1表示待审核，2审核未通过，3实名认证)
     * @param userMenberState 年费的状态 ( 0表示没有开通，1表示已经开通了)
     * @param userTietong     身份的选择 (0大家保险铁通员工，1大家保险员工，2非大家保险员工)
     * @param intentionState  意向委托 (表示当前委托人是否可以 选择有意向(0表示可以，1表示不可以)
     * @param userOrderState  能否接单 (用来判断他当前是否还能接单 0表示可以接单 1表示不可以)
     * @param adminId         表示管理员的id(用来判断管理员是否有这个权限)
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result putUser(Integer userId, Integer testState, Integer userState, Integer userMenberState, Integer userTietong, Integer intentionState, Integer userOrderState, Integer adminId) {
        //创建Result实体来操作对应的数据
        Result result = new Result();
        //创建map函数来存储数据，用于后面的操作
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将用户的userId存到map中
        map.put("testState", testState);//确认用户的信息
        map.put("userState", userState);//用户的实名状态
        map.put("userMenberState", userMenberState);//年费的状态
        map.put("userTietong", userTietong);//身份的选择
        map.put("intentionState", intentionState);//表示这个用户是否 还可以意向委托
        map.put("userOrderState", userOrderState);//表示这个用户是否 还可以接单
        map.put("adminId", adminId);//表示管理员的id
        //指定获取当前的时间
        Calendar cal = Calendar.getInstance();
        //获取当前的时间
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        //获取当前的时间
        Date beginOfDate = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将时间存到map中
        map.put("adminMessageTime", formatter.format(beginOfDate));
        map.put("adminMessageRemark", ("确认用户的信息" + testState + "用户实名的状态" + userState + "年费的状态" + userMenberState + "身份的选择" + userTietong + "意向委托" + intentionState + "是否可以接单" + userOrderState));//通过userState来判断实名是否成功
        //判断其有没有修改年费的状态，如果修改了年费的状态。就需要获取当前的时间
        if (userMenberState == 1) {
            //将时间设置成当前日期 0:0::0
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
            //获取当前的时间
            Date date = cal.getTime();
            //设置时间的格式为yyyy-MM-dd HH:mm:ss
            SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将设置的时间赋值给userMemberBegin
            String userMemberBegin = formatter1.format(date);
            //在当前的时间上，增加一年
            cal.set(cal.get(Calendar.YEAR) + 1, cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
            //获取当前的时间
            Date date1 = cal.getTime();
            //设置时间的格式为yyyy-MM-dd HH:mm:ss
            SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将设置的时间赋值给userMemberFinish
            String userMemberFinish = formatter2.format(date1);
            //将年费开始的时间存到map中
            map.put("userMemberBegin", userMemberBegin);
            //将年费结束的时间存到map中
            map.put("userMemberFinish", userMemberFinish);
        }
        try {
            //第一步 修改用户的信息
            Integer putUser = administratorDao.putUser(map);
            //第二步 将管理员修改用户的信息存到对应的表中
            Integer insertAdminMessage = administratorDao.insertAdminMessage(map);
            result.setCode(200);
            result.setMessage("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("当前异常");
        }
        return result;
    }

    /**
     * 管理员 查询所有委托
     *
     * @param adminId 管理员的id
     * @param index   当前的页数，默认数第一页
     * @return 戴辆
     */
    @Override
    public ResultPage getEntrust(Integer adminId, Integer index) {
        //创建ResultPage实体来接受和存储数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据，用于操作
        Map<String, Object> map = new HashMap<String, Object>();
        //第一步 查询所有委托数
        Integer count = administratorDao.getEntrustNumber();
        //一页显示10条数据
        int size = 10;
        //判断总共有多少页
        int pageCount = (int) Math.ceil((double) count / size);
        //判断页数，是否大于当前页数
        if (index > pageCount) {
            index = pageCount;
        }
        map.put("start", (index - 1) * count);//忽略前面多少条数据
        map.put("end", size);//查询的多少条数据
        try {
            //查询获取对应的数据信息
            List<AdminEntrust> adminEntrustList = administratorDao.getEntrust(map);
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setPageCount(pageCount);
            resultPage.setSize(size);
            resultPage.setCount(count);
            resultPage.setIndex(index);
            resultPage.setData(adminEntrustList);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(500);
            resultPage.setMessage("内部错误");
        }
        return resultPage;
    }

    /**
     * 查询对应的委托的方法
     *
     * @param adminId            管理员id
     * @param entrustState       委托的状态
     * @param insuranceCompanyId 保险公司的id
     * @param licensePlateNumber 车牌号
     * @param userPhone          委托人电话
     * @param startTime          委托开始的时间
     * @param endTime            委托结束的时间
     * @param index              当前的页的页数
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage getScreenEntrust(Integer adminId, Integer entrustState, Integer insuranceCompanyId, String licensePlateNumber, String userPhone, String startTime, String endTime, Integer index) {
        //创建对应的实体类来存储和接受数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("entrustState", entrustState);//委托对应的状态
        map.put("insuranceCompanyId", insuranceCompanyId);//委托的保险公司的id
        map.put("licensePlateNumber", licensePlateNumber);//委托的对应的车牌号
        map.put("userPhone", userPhone);//委托用户的手机号码
        map.put("startTime", startTime);//委托开始的时间的
        map.put("endTime", endTime);//委托结束的时间
        resultPage.setSize(10);//每页显示十条数据
        //用try catch 来捕获异常
        try {
            //第一步 查询对应的委托的条数
            Integer count = administratorDao.getScreenEntrustNumber(map);
            resultPage.setCount(count);//将总的条数存到实体中
            //第二步 计算总的页数 利用总条数/每页显示的页数向下取整
            resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
            //第三步 判断当前的页数是不是大于总页数
            if (index >= resultPage.getPageCount()) {
                map.put("start", (resultPage.getPageCount() - 1) * resultPage.getSize());//显示多少条到多少条的数据
            } else {
                map.put("start", (index - 1) * resultPage.getSize());//当前页的页数是多少
            }
            map.put("end", resultPage.getSize());//一页显示的条数
            //第四步 查询对应的数据
            List<AdminEntrust> adminEntrustList = administratorDao.getScreenEntrust(map);
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(500);
            resultPage.setMessage("出现错误");
            return resultPage;
        }
        return resultPage;
    }

    /**
     * 管理员查询对应的委托的详情
     *
     * @param entrustId 委托的id
     * @param adminId   管理员的id
     * @return 戴辆
     */
    @Override
    public Result getEntrustId(Integer entrustId, Integer adminId) {
        //创建对应的实体类Result类来接受对应的数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将委托的id存到map的数据中
        map.put("entrustId", entrustId);
        try {
            ParticularsEntrust particularsEntrust = administratorDao.getEntrustId(map);
            if (particularsEntrust == null) {
                result.setCode(200);
                result.setMessage("没有查到数据");
            } else {
                System.out.println("这是有意向的人数" + particularsEntrust.getNewUserId());
                //判断有意向的人数 是不是为空 如果为空的话就为0
                if (particularsEntrust.getNewUserId() != null) {
                    if (particularsEntrust.getNewUserId().length() > 0) {
                        if (particularsEntrust.getNewUserId().length() < 2) {
                            particularsEntrust.setNewUserIdCount(1);
                        }
                        //创建一个数组来接受有多少人数
                        String list[] = particularsEntrust.getNewUserId().split(",");
                        //将有多少人有意向存到对应人数字段中
                        particularsEntrust.setNewUserIdCount(list.length);
                    } else {
                        particularsEntrust.setNewUserIdCount(0);
                    }
                } else {
                    particularsEntrust.setNewUserIdCount(0);
                }
                result.setCode(200);
                result.setMessage("成功");
                result.setData(particularsEntrust);
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(500);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 管理员 查询自己的个人信息
     *
     * @param adminId 管理员的id
     * @return 戴辆
     */
    @Override
    public Result getAdminParticulars(Integer adminId) {
        //创建Result的实体来接受和存储数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将管理员的id存到map中
        map.put("adminId", adminId);
        try {
            //获取dao层 查询到的数据
            Admin admin = administratorDao.getAdminParticulars(map);
            //判断数据是不是为空 如果数据为空的话 则说明管理员的id有问题
            if (admin == null) {
                result.setCode(400);
                result.setMessage("查询失败");
            } else {
                result.setCode(200);
                result.setMessage("查询成功");
                result.setData(admin);
            }
        } catch (Exception e) {//用catch来捕获异常
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(500);
            result.setMessage("出现错误");
        }
        return result;
    }

    /**
     * 管理员 修改自己的个人信息
     *
     * @param adminId       管理员的id
     * @param adminName     管理员的姓名
     * @param adminAccount  管理员的账号
     * @param adminPhone    管理员的电话
     * @param adminPassword 管理员的密码
     * @param newPassword   管理员的新密码
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result putAdminParticulars(Integer adminId, String adminName, String adminAccount, String adminPhone, String adminPassword, String newPassword) {
        //创建Result的实体来接受数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("adminId", adminId);//将管理员的id存到map中
        map.put("adminName", adminName);//将管理员的姓名存到map中
        map.put("adminPhone", adminPhone);//将管理员的电话存到map中
        map.put("adminAccount", adminAccount);//将管理员的账号存到map中
        try {
            if (adminPassword != null && adminPassword != "") {
                //第一步 根据管理员的id 查询管理员密码 来判断管理员输入的密码是是否正确
                String password = administratorDao.getadminPassword(map);
                //将管理员输入的密码 进行md5加密之后和查询的密码比较
                if (password.equals(DigestUtils.md5DigestAsHex(adminPassword.getBytes()))) {//判断输入的密码和数据库的密码是否一致
                    map.put("adminPassword", newPassword);//将新的密码存到map中
                    //第二步 修改管理员的信息
                    Integer zhi = administratorDao.putAdminParticulars(map);
                    //判断有没有修改成功。如果没有修改成功的话就事务回滚
                    if (zhi != null) {
                        result.setCode(200);
                        result.setMessage("成功");
                    } else {
                        result.setCode(400);
                        result.setMessage("失败");
                    }
                } else {
                    result.setCode(300);
                    result.setMessage("密码错误");
                }
            } else {
                Integer zhi = administratorDao.putAdminParticulars(map);
                //判断有没有修改成功。如果没有修改成功的话就事务回滚
                if (zhi != null) {
                    result.setCode(200);
                    result.setMessage("成功");
                } else {
                    result.setCode(400);
                    result.setMessage("失败");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("当前异常");
        }
        return result;
    }

    /**
     * 超级管理员 管理管理员(默认查询所有管理员)
     *
     * @param adminId      超级管理员的id
     * @param adminRoleId  超级管理员权限的id
     * @param index        当前加载的页数
     * @param adminName    管理员的姓名
     * @param adminPhone   管理员的电话
     * @param adminAccount 管理员的账号
     * @return 戴辆
     */
    @Override
    public ResultPage getAdministration(Integer adminId, Integer adminRoleId, Integer index, String adminName, String adminPhone, String adminAccount) {
        //创建ResultPage的实体来接受参数
        ResultPage resultPage = new ResultPage();
        //创建map的数组来存储参数
        Map<String, Object> map = new HashMap<String, Object>();
        if (index == null) {
            index = 1;
        }
        map.put("adminName", adminName);//将管理员的姓名放到map数组中
        map.put("adminPhone", adminPhone);//将管理员的电话放到map数组中
        map.put("adminAccount", adminAccount);//将管理员的账号放到map数组中
        //默认一页显示10条数据
        resultPage.setSize(10);
        try {
            //第一步  先查询总的条数
            Integer count = administratorDao.getAdministrationCount(map);
            //计算总的页数
            resultPage.setPageCount((int) Math.ceil((double) count / resultPage.getSize()));
            //判断总的页数和index的关系，如果index大于总的页数 就将index赋值为pagecount
            if (index > resultPage.getPageCount()) {
                index = resultPage.getPageCount();//将总的页数赋值给index
            }
            map.put("start", (index - 1) * resultPage.getSize());//计算忽略前面多少条数据
            map.put("end", resultPage.getSize());//加载显示多少条数据
            //第二步 查询对应的数据
            List<Admin> adminList = administratorDao.getAdministration(map);
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(adminList);
            resultPage.setIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(500);
            resultPage.setMessage("出现错误");
        }
        return resultPage;
    }

    /**
     * 超级管理员查询 对应管理的信息
     *
     * @param adminId    超级管理员的id
     * @param newAdminId 管理员的id
     * @return 戴辆
     */
    @Override
    public Result getAdministratorMessage(Integer adminId, Integer newAdminId) {
        //创建Result的实体来操作数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("adminId", newAdminId);//将要查询的管理员的信息 存到数组中
        try {
            //用实体类 来接受对应的数据信息
            Admin admin = administratorDao.getAdministratorMessage(map);
            //判断返回的数据 是不是为空
            if (admin != null) {
                result.setCode(200);
                result.setMessage("查询成功");
                result.setData(admin);
            } else {
                result.setCode(400);
                result.setMessage("查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(500);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 超级管理员 修改管理员的信息
     *
     * @param adminId          超级管理员id
     * @param newAdminId       管理员的id
     * @param adminName        管理员的姓名
     * @param adminPhone       管理员的电话
     * @param adminPassword    管理员的新密码
     * @param newAdminPassword 管理员确认密码
     * @param adminRoleId      管理员的权限
     * @param adminState       账号状态
     * @param adminAccount     管理员的账号
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result putAdministratorMessage(Integer adminId, Integer newAdminId, String adminName, String adminPhone, String adminPassword, String newAdminPassword, Integer adminRoleId, Integer adminState, String adminAccount) {
        //创建Result的实体来操作数据
        Result result = new Result();
        //创建map的数组来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("adminId", adminId);//超级管理员的id
        map.put("newAdminId", newAdminId);//被修改管理员的id
        map.put("adminName", adminName);//管理员的姓名
        map.put("adminPhone", adminPhone);//管理员的电话
        map.put("adminPassword", adminPassword);//管理员的密码
        map.put("adminRoleId", adminRoleId);//管理员的权限id
        map.put("adminState", adminState);//管理员账号的状态
        map.put("adminAccount", adminAccount);//管理员的账号
        map.put("adminMessageRemark", "修改的是管理员信息" + "管理员的姓名" + (adminName == null ? "没有" : "修改了") + "管理员的电话" + (adminPhone == null ? "没有" : "修改了") + "管理员的密码" + (adminPassword == null ? "没有" : "修改了") + "管理员的权限" + (adminRoleId == null ? "没有" : "修改了") + "管理员的状态" + (adminState == null ? "没有" : "修改了"));//通过userState来判断实名是否成功
        //指定获取当前的时间
        Calendar cal = Calendar.getInstance();
        //将时间设置成当前日期 0:0::0
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        //获取当前的时间
        Date beginOfDate = cal.getTime();
        //设置时间的格式为yyyy-MM-dd HH:mm:ss
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将时间存到map中
        map.put("adminMessageTime", formatter.format(beginOfDate));
        try {
            //第一步 修改对应的管理员信息
            int updateAdmin = administratorDao.putAdministratorMessage(map);
            //第二步 将信息存到管理员信息修改表中
            int insertAdmin = administratorDao.newInsertAdminMessage(map);
            result.setCode(200);
            result.setMessage("成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 超级管理员 注册管理员
     *
     * @param admin 里面存储着注册管理员的信息
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result postAdmin(Admin admin) {
        //创建Result实体来操作数据
        Result result = new Result();
        //创建map数组来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("adminName", admin.getAdminName());//将管理员的姓名存到map数组中
        map.put("adminPhone", admin.getAdminPhone());//将管理员的电话存到map数组中
        map.put("adminPassword", DigestUtils.md5DigestAsHex(admin.getAdminPassword().getBytes()));//将管理员的密码存到map数组中
        map.put("adminAccount", admin.getAdminAccount());//将管理员的账号存到map中
        map.put("adminRoleId", admin.getAdminRoleId());//管理员的权限
        map.put("adminRoleName", admin.getAdminRoleId() == 1 ? "超级管理员" : admin.getAdminRoleId() == 2 ? "高级管理员" : admin.getAdminRoleId() == 3 ? "中级管理员" : admin.getAdminRoleId() == 4 ? "低级管理员" : "管理员");
        map.put("adminId", admin);//将超级管理员的id存到map中
        try {
            //第一步 将管理员的信息添加到数据库中去
            int addAdmin = administratorDao.postAdmin(map);
            //第二步 查询最新注册的管理员的id
            int newAdminId = administratorDao.selectAdminId();
            map.put("newAdminId", newAdminId);//将管理员新注册的管理员存到map中
            //指定获取当前的时间
            Calendar cal = Calendar.getInstance();
            //将时间设置成当前日期 0:0::0
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
            //获取当前的时间
            Date beginOfDate = cal.getTime();
            //设置时间的格式为yyyy-MM-dd HH:mm:ss
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将时间存到map中
            map.put("adminMessageTime", formatter.format(beginOfDate));
            map.put("adminMessageRemark", "超级管理员将:" + admin.getAdminName() + "设置成" + admin.getAdminRoleName());
            //第三步 将超级管理员注册管理员的信息存到数据库中
            int insertAdmin = administratorDao.newInsertAdminMessage(map);
            result.setCode(200);
            result.setMessage("成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 管理员 登录的方法
     *
     * @param adminAccount  管理员的账号
     * @param adminPassword 管理员的密码
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public LoginResult getAdminLogin(String adminAccount, String adminPassword) {
        //创建Result的实体来操作数据
        LoginResult loginResult = new LoginResult();
        //创建map的数组来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将将管理员账号存到map中
        map.put("adminAccount", adminAccount);
        //将管理员的密码进行md5加密,并且加密
        map.put("adminPassword", DigestUtils.md5DigestAsHex(adminPassword.getBytes()));
        try {
            //第一步 判断账号和密码是否正确 如果返回的数据 ！=1的话则说明账号或密码错误
            int count = administratorDao.getAdminLogin(map);
            if (count == 1) {
                //第二步 查询管理员对应的信息
                Admin admin = administratorDao.getAdmin(map);
                loginResult.setCode(200);
                loginResult.setMessage("登录成功");
                loginResult.setData(admin);//将数据存到实体类中返回
                loginResult.setAdminId(admin.getAdminId());//管理员的id
                loginResult.setAdminRoleId(admin.getAdminRoleId());//管理员的权限id
            } else {
                loginResult.setCode(400);
                loginResult.setMessage("账号或密码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            loginResult.setCode(300);
            loginResult.setMessage("出现异常");
        }
        return loginResult;

    }

    /**
     * 查询所有权限的 信息
     *
     * @return 戴辆
     */
    @Override
    public Result getAdminRole() {
        //创建Result的实体来存储数据
        Result result = new Result();
        try {
            //创建对应的实体来存储数据
            List<AdminRole> adminRoleList = administratorDao.getAdminRole();
            if (adminRoleList != null) {
                result.setCode(200);
                result.setMessage("成功");
                result.setData(adminRoleList);//将数据存到实体中
            } else {
                result.setCode(400);
                result.setMessage("失败");
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
     * 查询对应的消费卡的数据
     *
     * @param adminId      管理员的id
     * @param index        当前页的页数
     * @param consumeState 对应查询的数据 0 表示待审核，1表示审核成功，2表示审核失败
     * @return 戴辆
     */
    @Override
    public ResultPage getAllConsume(Integer adminId, Integer index, Integer consumeState) {
        //创建对应的实体来接受对应的数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来接受和存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("consumeState", consumeState);//消费卡申请的状态
        resultPage.setSize(10);//一页显示多少数据
        //用try catch 来捕获异常
        try {
            //第一步 通过条件 来查询对应的条数
            Integer count = administratorDao.getAllConsumeNumber(map);
            //将数据存到实体中
            resultPage.setCount(count);
            //计算对应总页数
            resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
            //第三步 判断当前的页数是不是大于总页数
            if (index >= resultPage.getPageCount()) {
                map.put("start", (resultPage.getPageCount() - 1) * resultPage.getSize());//显示多少条到多少条的数据
            } else {
                map.put("start", (index - 1) * resultPage.getSize());//当前页的页数是多少
            }
            map.put("end", resultPage.getSize());//一页显示的条数
            //查询对应的状态的消费卡数据
            List<AllConsume> allConsumeList = administratorDao.getAllConsume(map);
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(allConsumeList);//将数据存到对应的实体中
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(500);
            resultPage.setMessage("出现异常");
            return resultPage;
        }
        return resultPage;
    }

    /**
     * 查询对应的和豆申请的数据
     *
     * @param adminId    管理员id
     * @param index      表示当前的页数
     * @param beansState 表示和豆申请的状态 0表示待审核，1表示审核成功，2表示信息错误
     * @return 戴辆
     */
    @Override
    public ResultPage getAllBeans(Integer adminId, Integer index, Integer beansState) {
        //创建对应的实体类来存储数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("beanState", beansState);//将对应的状态存到map中
        resultPage.setSize(10);//一页显示多少数据
        try {
            //第一步 查询对应状态的和豆申请条数
            Integer count = administratorDao.getAllBeansNumber(map);
            //将数据存到实体中
            resultPage.setCount(count);
            //计算对应总页数
            resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
            //第三步 判断当前的页数是不是大于总页数
            if (index >= resultPage.getPageCount()) {
                map.put("start", (resultPage.getPageCount() - 1) * resultPage.getSize());//显示多少条到多少条的数据
            } else {
                map.put("start", (index - 1) * resultPage.getSize());//当前页的页数是多少
            }
            map.put("end", resultPage.getSize());//一页显示的条数
            //查询对应的状态的消费卡数据
            List<AllBeans> allBeansList = administratorDao.getALLBeans(map);
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(allBeansList);//将数据存到实体中
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("出现错误");
        }
        return resultPage;
    }
}
