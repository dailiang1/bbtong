package com.bbtong.Dao;

import com.bbtong.Base.PostUser;
import com.bbtong.Pojo.Friend;
import com.bbtong.Pojo.News;
import com.bbtong.Pojo.User;
import com.bbtong.Pojo.UserExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 登录第一步，先通过手机号查询是否有这个用户
     *
     * @param userPhone 手机号码
     * @return 戴辆
     */
    User PutUser(@Param("userPhone") String userPhone);

    String insuranceCompanyName(@Param("insuranceCompanyId") Integer insuranceCompanyId);

    /**
     * 注册用户
     *
     * @param postUser 用户提交的信息
     * @return 戴辆
     */
    Integer PostUser(PostUser postUser);

    /**
     * 第一步 用户查询自己好友的条数
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    Integer GetFriendNumber(@Param("userId") Integer userId);

    /**
     * 第二步 用户查询自己好友信息
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    List<Friend> GetFriend(@Param("userId") Integer userId);

    /**
     * 查看用户个人资料
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    User GetUser(@Param("userId") Integer userId);

    /**
     * 修改用户自己的个人信息
     *
     * @param postUser 里面存储着修改之后的参数
     * @return 戴辆
     */
    int UserRedact(PostUser postUser);

    /**
     * 用户查看自己的消息
     *
     * @param map 里面存储着数据
     * @return 戴辆
     */
    List<News> SelectNews(Map map);

    /**
     * 用户将消息从未读变成已读的方法
     *
     * @param map 里面存储着数据
     * @return 戴辆
     */
    int delectNewsOne(Map map);

    /**
     * 用户删除自己消息的方法
     *
     * @param map 里面存储着数据
     * @return 戴辆
     */
    int delectNewsTwo(Map map);
}