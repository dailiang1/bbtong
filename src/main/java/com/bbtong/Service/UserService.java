package com.bbtong.Service;

import com.bbtong.Base.PostUser;
import com.bbtong.Pojo.User;
import com.bbtong.Util.Result;
import com.bbtong.Util.UserResult;

/**
 * 用户登录查询的方法
 */
public interface UserService {
    /**
     * 登录第一步，先通过手机号查询是否有这个用户
     * @param userPhone 手机号码
     * @return 戴辆
     */
    UserResult PutUser(String userPhone);

    /**
     * 注册用户
     * @param postUser 用户基本信息
     * @return 戴辆
     */
    Result PostUser(PostUser postUser);
}
