package com.bbtong.Dao;

import com.bbtong.Base.*;
import com.bbtong.Pojo.Admin;
import com.bbtong.Pojo.Entrust;
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
    LoginUser GetUser(Map map);

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
    List<AdminCheckUser> GetNewUser(Map map);

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
     * 第一步 查询总的委托数
     *
     * @return 戴辆
     */
    Integer getEntrustCount();

    /**
     * 第二步 查询总的委托人数
     *
     * @return戴辆
     */
    Integer getUserCount();

    /**
     * 第三步 查询当天注册的用户条数
     *
     * @param map 里面存着两个时间，今天0点到明天0点
     * @return 戴辆
     */
    Integer getnewUserCount(Map map);

    /**
     * 第四步 查询当天发布的委托数
     *
     * @param map 里面存着两个时间，今天0点到明天0点
     * @return 戴辆
     */
    Integer getnewEntrustCount(Map map);

    /**
     * 第一步 将用户的信息进行修改
     *
     * @param map 里面存这数据
     * @return 戴辆
     */
    Integer getLoginCheck(Map map);

    /**
     * 查询对应的管理员的权限id
     *
     * @param adminId 管理员id
     * @return 戴辆
     */
    Admin GetadminRoleId(Integer adminId);

    /**
     * 超级管理员查询 对应用户的信息
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    User getCheck(Integer userId);

    /**
     * 第一步 超级管理员修改用户的一些信息
     *
     * @param map 里面存这修改的数据
     * @return 戴辆
     */
    Integer putUser(Map map);

    /**
     * 第一步 管理员 查询所有委托的条数
     *
     * @return 戴辆
     */
    Integer getEntrustNumber();

    /**
     * 第二步 管理员 查询对应的委托数
     *
     * @param map 里面存储着对应的数据
     * @return 戴辆
     */
    List<AdminEntrust> getEntrust(Map map);

    /**
     * 管理员 查询委托对应的信息
     *
     * @param map 里面存着委托的id
     * @return 戴辆
     */
    ParticularsEntrust getEntrustId(Map map);

    /**
     * 管理员 查询自己的信息
     *
     * @param map 里面储存着管理员的id
     * @return 戴辆
     */
    Admin getAdminParticulars(Map map);

    /**
     * 管理修改个人信息的 第一步 查询管理员的密码
     *
     * @param map 里面存着管理员id
     * @return 戴辆
     */
    String getadminPassword(Map map);

    /**
     * 管理员 修改自己的信息
     *
     * @param map 里面存储着对应的数据
     * @return 戴辆
     */
    Integer putAdminParticulars(Map map);

    /**
     * 超级管理员 管理管理员 第一步 先查询总的的人数
     *
     * @param map 里面存储着对应的数据
     * @return 戴辆
     */
    Integer getAdministrationCount(Map map);

    /**
     * 超级管理员 管理管理员 第二步 查询对应的数据
     *
     * @param map 里面存储着查询条件
     * @return 戴辆
     */
    List<Admin> getAdministration(Map map);

    /**
     * 超级管理员 查询对应管理的信息
     *
     * @param map 里面存储着要查询的管理员的id
     * @return 戴辆
     */
    Admin getAdministratorMessage(Map map);

    /**
     * 第一步 超级管理员 修改对应管理员的信息
     *
     * @param map 里面存储着要修改的信息
     * @return 戴辆
     */
    Integer putAdministratorMessage(Map map);

    /**
     * 第二步 将管理员修改信息的记录存到对应的表中
     *
     * @param map 里面存储着数据
     * @return 戴辆
     */
    Integer newInsertAdminMessage(Map map);

    /**
     * 第一步 将注册的管理员存到数据库中
     *
     * @param map 里面存储着注册的管理员的信息
     * @return 戴辆
     */
    Integer postAdmin(Map map);

    /**
     * 第二步 查询最新注册的管理员
     *
     * @return
     */
    Integer selectAdminId();

    /**
     * 第一步 判断管理员的账号和密码是否正确
     *
     * @param map 里面储存着账号和密码
     * @return 戴辆
     */
    Integer getAdminLogin(Map map);

    /**
     * 第二步 查询管理员对应的信息
     *
     * @param map 里面储存着账号和密码
     * @return 戴辆
     */
    Admin getAdmin(Map map);
}
