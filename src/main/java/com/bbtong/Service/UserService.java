package com.bbtong.Service;

import com.bbtong.Base.PostUser;
import com.bbtong.Pojo.User;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.bbtong.Util.UserResult;

/**
 * 用户登录查询的方法
 */
public interface UserService {
    /**
     * 登录第一步，先通过手机号查询是否有这个用户
     *
     * @param userPhone 手机号码
     * @return 戴辆
     */
    UserResult PutUser(String userPhone);

    /**
     * 注册用户
     *
     * @param postUser 用户基本信息
     * @return 戴辆
     */
    Result PostUser(PostUser postUser);

    /**
     * 用户查询好友的方法
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    ResultPage GetFriend(Integer userId);

    /**
     * 查看个人资料
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    Result GetUser(Integer userId);

    /**
     * 修改个人资料
     *
     * @param postUser 里面存储这对应的数据
     * @return 戴辆
     */
    Result UserRedact(PostUser postUser);

    /**
     * 用户查询消息提醒
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    ResultPage SelectNews(Integer userId);

    /**
     * 用户删除自己对应的消息
     * @param userId 用户的id
     * @param newsId 消息的id
     * @param index 1表示执行未读的方法，2表示执行删除的方法
     * @return 戴辆
     */
    Result delectNews(Integer userId, Integer newsId,Integer index);
}
