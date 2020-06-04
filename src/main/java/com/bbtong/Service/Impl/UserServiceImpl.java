package com.bbtong.Service.Impl;

import com.bbtong.Base.PostUser;
import com.bbtong.Dao.UserDao;
import com.bbtong.Pojo.User;
import com.bbtong.Service.UserService;
import com.bbtong.Util.Result;
import com.bbtong.Util.UserResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
            User user=userDao.PutUser(userPhone);
            if (user!=null){
                userResult.setCode(200);
                userResult.setMessage("登录成功");
                userResult.setUserId(user.getUserId());//将用户的userId单独存起来
                userResult.setInsuranceCompanyId(user.getInsuranceCompanyId());//将用户的保险公司名称单独存起来
                userResult.setUserPhone(user.getUserPhone());//将用户的手机号单独的存起来
                userResult.setData(user);
            }else {
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
     * @param postUser 用户基本信息
     * @return 戴辆
     */
    @Override
    public Result PostUser(PostUser postUser) {
        //创建Result来接受和返回数据
        Result result=new Result();
        //创建接受返回数据
        int zhi=userDao.PostUser(postUser);
        if (zhi>0){
            result.setCode(200);
            result.setMessage("注册成功");
        }else {
            result.setCode(400);
            result.setMessage("注册失败");
        }
        return result;
    }
}
