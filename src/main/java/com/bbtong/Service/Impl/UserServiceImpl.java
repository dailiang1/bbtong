package com.bbtong.Service.Impl;

import com.bbtong.Base.PostUser;
import com.bbtong.Dao.UserDao;
import com.bbtong.Pojo.Friend;
import com.bbtong.Pojo.User;
import com.bbtong.Service.UserService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.bbtong.Util.UserResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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


}
