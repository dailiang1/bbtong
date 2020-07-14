package com.bbtong.Service;

import com.bbtong.Base.AdminUser;
import com.bbtong.Base.UserCheck;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
     * 查询什么时间段 注册的用户 (默认是查询当天的用户)
     *
     * @param startTime 起始的时间
     * @param endTime   结束的时间
     * @param index     当前的页数
     * @return 戴辆
     */
    ResultPage GetNewUser(String startTime, String endTime, Integer index);

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
     * 管理员查询总的委托数
     *
     * @return 戴辆
     */
    ResultPage getEntrustCount();
}
