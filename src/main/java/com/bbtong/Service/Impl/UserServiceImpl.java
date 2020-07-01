package com.bbtong.Service.Impl;

import com.bbtong.Base.PostUser;
import com.bbtong.Dao.UserDao;
import com.bbtong.Pojo.Friend;
import com.bbtong.Pojo.News;
import com.bbtong.Pojo.User;
import com.bbtong.Service.UserService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.bbtong.Util.UserResult;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 执行用户操作的方法
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 创建UserDao来调用dao的数据
     */
    @Resource
    private UserDao userDao;

    /**
     * 登录第一步，先通过手机号查询是否有这个用户
     *
     * @param userPhone 手机号码
     * @return 戴辆
     */
    @Override
    public UserResult PutUser(String userPhone) {
        //创建接收返回值的数据
        UserResult userResult = new UserResult();
        try {
            //创建User的实体来接受数据
            User user = userDao.PutUser(userPhone);
            if (user != null) {
                userResult.setCode(200);
                userResult.setMessage("登录成功");
                userResult.setUserId(user.getUserId());//将用户的userId单独存起来
                userResult.setInsuranceCompanyId(user.getInsuranceCompanyId());//将用户的保险公司名称单独存起来
                userResult.setUserPhone(user.getUserPhone());//将用户的手机号单独的存起来
                userResult.setData(user);
            } else {
                userResult.setCode(205);
                userResult.setMessage("尚未注册的用户");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userResult;
    }

    /**
     * 注册用户
     *
     * @param postUser 用户基本信息
     * @return 戴辆
     */
    @Override
    public Result PostUser(PostUser postUser) {
        //创建Result来接受和返回数据
        Result result = new Result();
        //先通过保险公司的id，查询保险公司名称
        postUser.setInsuranceCompanyName(userDao.insuranceCompanyName(postUser.getInsuranceCompanyId()));
        //创建接受返回数据
        int zhi = userDao.PostUser(postUser);
        if (zhi > 0) {
            result.setCode(200);
            result.setMessage("注册成功");
        } else {
            result.setCode(400);
            result.setMessage("注册失败");
        }
        return result;
    }

    /**
     * 用户查询好友的方法
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @Override
    public ResultPage GetFriend(Integer userId) {
        //创建ResultPage的实体来存储和返回数据
        ResultPage resultPage = new ResultPage();
        //第一步 先查询好友的数量
        int number = userDao.GetFriendNumber(userId);
        //判断好友的条数是不是大于0，如果不大于0 的话就直接返回0条并且没有数据
        if (number > 0) {
            //第二步 查询好友对应的信息
            List<Friend> friendList = userDao.GetFriend(userId);
            //将数据存到resultPage中
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(friendList);
            resultPage.setCount(number);
        } else {
            resultPage.setCode(200);
            resultPage.setMessage("当前没有好友");
            resultPage.setCount(number);
        }
        return resultPage;
    }

    /**
     * 查看个人资料
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @Override
    public Result GetUser(Integer userId) {
        //创建对应Result来接收和存储数据
        Result result = new Result();
        //创建user来接受参数
        User user = userDao.GetUser(userId);
        //判断user是不是null，如果user是null的话则说明内部错误
        if (null != user) {
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(user);
        } else {
            result.setCode(500);
            result.setMessage("内部错误");
        }
        return result;
    }

    /**
     * 用户修改自己的个人资料
     *
     * @param postUser 里面存储这对应的数据
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result UserRedact(PostUser postUser) {
        //创建对应实体类来操作对应的数据
        Result result = new Result();
        try {
            int zhi = userDao.UserRedact(postUser);
            result.setCode(200);
            result.setMessage("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 用户查询自己消息的方法
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage SelectNews(Integer userId) {
        //创建对应的实体类来接收数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将用户的id存到map中
        try {
            //创建list数组来存储数据
            List<News> newsList = userDao.SelectNews(map);
            //记录数组的长度为消息的数量
            resultPage.setCount(newsList.size());
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(newsList);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("出现异常");
        }
        return resultPage;
    }

    /**
     * 用户执行删除或未读的方法
     *
     * @param userId 用户的id
     * @param newsId 消息的id
     * @param index  1表示执行未读的方法，2表示执行删除的方法
     * @return 戴辆
     */
    @Override
    public Result delectNews(Integer userId, Integer newsId, Integer index) {
        //创建接收和返回数据的实体类
        Result result = new Result();
        //创建map的函数来存储操作数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//用户的id
        map.put("newsId", newsId);//消息的id
        //判断执行什么方法
        if (index == 1) {
            int zhi = userDao.delectNewsOne(map);
        } else if (index ==2) {
            int zhi =userDao.delectNewsTwo(map);
        } else {
            result.setCode(500);
            result.setMessage("当前异常");
            return result;
        }
        result.setCode(200);
        result.setMessage("执行成功");
        return result;
    }


}
