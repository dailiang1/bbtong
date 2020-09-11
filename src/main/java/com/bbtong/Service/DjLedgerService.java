package com.bbtong.Service;

import com.bbtong.Base.dj.PostDaily;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 大家保险用户进行日结台账的方法
 */
public interface DjLedgerService {

    /**
     * 大家保险用户查询台账记录
     *
     * @param userId 用户的id
     * @return 戴辆
     */
    Result LedgerBook(Integer userId);

    /**
     * 大家保险的用户查询保单信息
     *
     * @param userId    用户的id
     * @param startTime 起始的时间
     * @param endTime   结束时间
     * @return 戴辆
     */
    ResultPage getguaranteeMessage(Integer userId, String startTime, String endTime, Integer index);

    /**
     * 查询大家保险的所有部门
     *
     * @return 戴辆
     */
    Result getDepartment();

    /**
     * 查询大家保险所有的代理人
     *
     * @return 戴辆
     */
    Result getAgent();

    /**
     * 大家保险提交台账
     *
     * @param postDaily 里面存着对应的数据 详情请看对应的实体类
     * @return 戴辆
     */
    Result postDaily(PostDaily postDaily);

    /**
     * 大家保险的用户 通过车牌号查询对应的保单信息(支持模糊查询)
     *
     * @param userId             用户的id
     * @param licensePlateNumber 车牌号
     * @return 戴辆
     */
    Result getQueryMessage(Integer userId, String licensePlateNumber);

    /**
     * 管理查询 个人的保单信息 可以通过车牌号和用户的姓名查询
     *
     * @param adminId   管理员的id
     * @param condition 查询条件
     * @param index     当前页数
     * @return 戴辆
     */
    ResultPage getSearchMessage(Integer adminId, String condition, Integer index);

    /**
     * 管理员 查询大家保险用户的总台账
     *
     * @return 戴辆
     */
    Result getSumDaily();

    /**
     * 管理员查询对应月份的金额 和 占比
     *
     * @param adminId 管理员id
     * @param month   月份
     * @return 戴辆
     */
    Result getMonth(Integer adminId, Integer month);

    /**
     * 管理员 查询对应时间段 的代理人或部门的 交强险和商业险占比
     *
     * @param startTime    起始时间
     * @param endTime      结束时间
     * @param departmentId 部门id
     * @param agentId      代理人id
     * @return 戴辆
     */
    Result getSumSelect(String startTime, String endTime, Integer departmentId, Integer agentId);
}
