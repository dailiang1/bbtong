package com.bbtong.Dao;

import com.bbtong.Base.PostUser;
import com.bbtong.Pojo.User;
import com.bbtong.Pojo.UserExample;
import java.util.List;

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
     * @param userPhone 手机号码
     * @return 戴辆
     */
    User PutUser(@Param("userPhone") String userPhone);

    /**
     * 注册用户
     * @param postUser 用户提交的信息
     * @return 戴辆
     */
    Integer PostUser(PostUser postUser);
}