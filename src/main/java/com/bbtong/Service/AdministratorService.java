package com.bbtong.Service;

import com.bbtong.Base.AdminUser;
import com.bbtong.Base.UserCheck;
import com.bbtong.Pojo.Admin;
import com.bbtong.Util.AdminResult;
import com.bbtong.Util.LoginResult;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 管理员方法的service层
 */
@Service
public interface AdministratorService {
    /**
     * 获取所有用户的方法
     *
     * @param adminUser 里面有四个参数， 用户的名称， 保险公司的id，注册的开始时间和注册的结束时间
     * @return 戴辆
     */
    ResultPage getAllUser(AdminUser adminUser);

    /**
     * 获取对应用户的详情
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    Result GetUser(Integer userId);

    /**
     * 查询什么时间段 注册的用户 (默认是查询所有的用户)
     *
     * @param adminId            管理员的id
     * @param startTime          起始时间
     * @param endTime            结束时间
     * @param index              当前的页数
     * @param insuranceCompanyId 保险公司的id
     * @param userName           用户姓名
     * @param userPhone          用户电话
     * @param userState          表示对应的状态，加载对应的数据
     * @return 戴辆
     */
    ResultPage GetNewUser(Integer adminId, String startTime, String endTime, Integer index, Integer userState, String userName, Integer insuranceCompanyId, String userPhone);

    /**
     * 审核用户的一些基本信息
     *
     * @param userCheck 接受用户的信息的实体类
     * @return 戴辆
     */
    Result postUserCheck(UserCheck userCheck);

    /**
     * 管理员审核 消费卡申请(超级管理员)
     *
     * @param consumeId 消费卡申请的id
     * @param adminId   管理员的Id
     * @param index     用来表示处理的是什么，index=1 表示成功，index=2表示信息有误
     * @return 戴辆
     */
    Result getCheckConsume(Integer consumeId, Integer adminId, Integer index);

    /**
     * 管理员审核 和豆申请(超级管理员)
     *
     * @param beansId 和豆申请的id
     * @param adminId 管理员的id
     * @param index   1表示成功， 2表示信息有误
     * @return 戴辆
     */
    Result getCheckBeans(Integer beansId, Integer adminId, Integer index);

    /**
     * 管理员 查询总的委托数,总的委托人数，当天注册的人数，当天发布的委托数
     *
     * @return 戴辆
     */
    AdminResult getAdminData();

    /**
     * 管理员处理注册用户的信息
     *
     * @param adminId   管理员id
     * @param userId    用户的id
     * @param testState 确认信息(0待审核，1已审核，2信息错误)
     * @param userState 用户的状态(0没有实名，1待审核，2审核没通过，3实名认证了)
     * @return 戴辆
     */
    Result getLoginCheck(Integer adminId, Integer userId, Integer testState, Integer userState);

    /**
     * 通过管理员的id查询。管理员的权限的id
     *
     * @param adminId 管理员id
     * @return 戴辆
     */
    Integer GetadminRoleId(Integer adminId);

    /**
     * 超级管理员 查询 用户的所有信息
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    Result getCheck(Integer userId);

    /**
     * 超级管理员修改用户的信息(在用户信息出现错误的情况下)
     *
     * @param userId          用户的id
     * @param testState       确认信息(做成一个捆绑)
     * @param userState       实名的状态 (0 表示没有实名，1表示待审核，2审核未通过，3实名认证)
     * @param userMenberState 年费的状态 ( 0表示没有开通，1表示已经开通了)
     * @param userTietong     身份的选择 (0大家保险铁通员工，1大家保险员工，2非大家保险员工)
     * @param intentionState  意向委托 (表示当前委托人是否可以 选择有意向(0表示可以，1表示不可以)
     * @param userOrderState  能否接单 (用来判断他当前是否还能接单 0表示可以接单 1表示不可以)
     * @param adminId         表示管理员的id(用来判断管理员是否有这个权限)
     * @return 戴辆
     */
    Result putUser(Integer userId, Integer testState, Integer userState, Integer userMenberState, Integer userTietong, Integer intentionState, Integer userOrderState, Integer adminId);

    /**
     * 管理员 查询所有委托
     *
     * @param adminId 管理员的id
     * @param index   当前的页数，默认数第一页
     * @return 戴辆
     */
    ResultPage getEntrust(Integer adminId, Integer index);

    /**
     * 管理员查询对应的委托详情
     *
     * @param entrustId 委托的id
     * @param adminId   管理员的id
     * @return 戴辆
     */
    Result getEntrustId(Integer entrustId, Integer adminId);

    /**
     * 管理员 查询自己的信息
     *
     * @param adminId 管理员的id
     * @return 戴辆
     */
    Result getAdminParticulars(Integer adminId);

    /**
     * 管理员 修改自己的信息
     *
     * @param adminId       管理员的id
     * @param adminName     管理员的姓名
     * @param adminAccount  管理员的账号
     * @param adminPhone    管理员的电话
     * @param adminPassword 管理员的密码
     * @param newPassword   管理员的新密码
     * @return 戴辆
     */
    Result putAdminParticulars(Integer adminId, String adminName, String adminAccount, String adminPhone, String adminPassword, String newPassword);

    /**
     * 超级管理员 管理管理员(默认查询所有管理)
     *
     * @param adminId      超级管理员的id
     * @param adminRoleId  超级管理员权限的id
     * @param index        当前加载的页数
     * @param adminName    管理员的姓名
     * @param adminPhone   管理员的电话
     * @param adminAccount 管理员的账号
     * @return 戴辆
     */
    ResultPage getAdministration(Integer adminId, Integer adminRoleId, Integer index, String adminName, String adminPhone, String adminAccount);

    /**
     * 超级管理员 管理查询对应的信息
     *
     * @param adminId    超级管理员的id
     * @param newAdminId 管理员的id
     * @return 戴辆
     */
    Result getAdministratorMessage(Integer adminId, Integer newAdminId);

    /**
     * 超级管理员 修改管理员的信息
     *
     * @param adminId          超级管理员id
     * @param newAdminId       管理员的id
     * @param adminName        管理员的姓名
     * @param adminPhone       管理员的电话
     * @param adminPassword    管理员的新密码
     * @param newAdminPassword 管理员确认密码
     * @param adminRoleId      管理员的权限
     * @param adminState       账号状态
     * @param adminAccount     管理员的账号
     * @return 戴辆
     */
    Result putAdministratorMessage(Integer adminId, Integer newAdminId, String adminName, String adminPhone, String adminPassword, String newAdminPassword, Integer adminRoleId, Integer adminState, String adminAccount);

    /**
     * 超级管理员 注册管理员
     *
     * @param admin 里面存储着注册管理员的信息
     * @return
     */
    Result postAdmin(Admin admin);

    /**
     * 管理员登录账号
     *
     * @param adminAccount  管理员的账号
     * @param adminPassword 管理员的密码
     * @return 戴辆
     */
    LoginResult getAdminLogin(String adminAccount, String adminPassword);

}
