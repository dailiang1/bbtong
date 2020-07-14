package com.bbtong.Dao;

import com.bbtong.Base.AdminUser;
import com.bbtong.Base.UserCheck;
import com.bbtong.Pojo.Admin;
import com.bbtong.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 管理员方法的Dao层
 */

@Mapper
public interface AdministratorDao {

    /**
     * 查询对应信息的条数
     *
     * @param map 存储的数据
     * @return 戴辆
     */
    Integer getAllUserNumber(Map map);

    /**
     * 管理员查询所以用户的方法 默认是查询所有用户 但是可以进行准备的查询
     *
     * @param map 里面存着个参数 用户的名称 保险公司的id 注册开始的时间  注册结束的时间
     * @return 戴辆
     */
    List<User> getAllUser(Map map);

    /**
     * 查询显示对应的数据信息
     *
     * @param map 里面存这userId 对应的用户信息
     * @return 戴辆
     */
    User GetUser(Map map);

    /**
     * 第一步 先查询总的条数
     *
     * @param map 里面存储着 一个起始时间和startTime  一个结束时间 endTime
     * @return 戴辆
     */
    Integer GetNewUserNumber(Map map);

    /**
     * 第二步 查询对应的用户信息
     *
     * @param map 里面存储着 用户的起始时间 startTime 和结束时间 endTime
     * @return 戴辆
     */
    List<User> GetNewUser(Map map);

    /**
     * 第一步 修改用户的信息
     *
     * @param userCheck 里面存储着数据
     * @return 戴辆
     */
    Integer updateUser(@Param("userCheck") UserCheck userCheck);

    /**
     * 第二步 将管理员修改用户信息的记录存起来
     *
     * @param map 里面存储着存储的数据
     * @return 戴辆
     */
    Integer insertAdminMessage(Map map);

    /**
     * 第一步 先根据管理员的id查询管理员的权限id和管理员的姓名
     *
     * @param map 里面存这管理员的id
     * @return 戴辆
     */
    Admin Admin(Map map);

    /**
     * 第二步 将处理的结果修改给后台数据库(消费卡)
     *
     * @param map 里面存着修改的数据
     * @return 戴辆
     */
    Integer updateConsume(Map map);

    /**
     * 第二步 将处理的结果修改给后台数据(和豆申请)
     *
     * @param map 里面存储修改的数据
     * @return 戴辆
     */
    Integer updateBeans(Map map);

    /**
     * 管理员查询总的委托数
     *
     * @return 戴辆
     */
    Integer getEntrustCount();
}
