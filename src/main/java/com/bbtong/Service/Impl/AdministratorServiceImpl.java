package com.bbtong.Service.Impl;

import com.bbtong.Base.AdminUser;
import com.bbtong.Base.UserCheck;
import com.bbtong.Dao.AdministratorDao;
import com.bbtong.Pojo.Admin;
import com.bbtong.Pojo.User;
import com.bbtong.Service.AdministratorService;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = administratorDao.GetUser(map);
        if (user != null) {
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(user);
        } else {
            result.setCode(400);
            result.setMessage("查询失败");
        }
        return result;
    }

    /**
     * 查询什么时间段注册的用户 (默认是查询当天一天之内的用户)
     *
     * @param startTime 起始的时间
     * @param endTime   结束的时间
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage GetNewUser(String startTime, String endTime, Integer index) {
        //创建对应的实体类来操作数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据和操作数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("startTime", startTime);//起始的时间
        map.put("endTime", endTime);//结束的时间
        //第一步先查询 有多少条数据
        int count = administratorDao.GetNewUserNumber(map);
        int size = 15;//一页显示15条数据
        //第二步 计算有多少页
        int pageCount = (int) Math.ceil((double) count / size);
        if (index >= pageCount) {
            map.put("start", (pageCount - 1) * size);//显示多少条到多少条的数据
        } else {
            map.put("start", (index - 1) * size);//当前页的页数是多少
        }
        map.put("end", size);//一页显示的条数
        if (count > 0) {
            try {
                //获取对应筛选的数据
                List<User> userList = administratorDao.GetNewUser(map);
                resultPage.setCount(count);//返回总共多少条数据
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
     * @return 戴辆
     */
    @Override
    public ResultPage getEntrustCount() {
        //创建Result来接受数据
        ResultPage resultPage=new ResultPage();
        //查询总的委托数
        int count=administratorDao.getEntrustCount();
        resultPage.setCode(200);//查询成功
        resultPage.setMessage("查询成功");
        resultPage.setCount(count);
        return resultPage;
    }


}
