package com.bbtong.Dao;

import com.bbtong.Base.dj.AdminCost;
import com.bbtong.Base.dj.AdminDaily;
import com.bbtong.Base.dj.Cost;
import com.bbtong.Base.dj.NewDaily;

import java.util.List;

import com.bbtong.Pojo.dj.Agent;
import com.bbtong.Pojo.dj.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 大家保险用户进行日结台账的方法
 */

@Mapper
public interface DjLedgerDao {

    /**
     * 大家保险用户查询台账的记录，根据传入的时间段 查询对应时间段的数据
     *
     * @param map 里面存储着对应的数据 用户的id和起始和结束的时间
     * @retur戴辆
     */
    Cost ledgerBook(Map map);

    /**
     * 第一步 大家保险用户 查询对应的保单信息 对应时间段的
     *
     * @param map 里面存着对应的数据 用户的id 起始的时间 结束的时间
     * @return 戴辆
     */
    Integer getguaranteeMessageNumber(Map map);

    /**
     * 第二步 大家保险用户 查询对应的保单信息
     *
     * @param map 里面存着对应的数据 用户的id 起始的时间 结束的时间
     * @return 戴辆
     */
    List<NewDaily> getguaranteeMessage(Map map);

    /**
     * 查询大家保险所有部门的信息
     *
     * @return 戴辆
     */
    List<Department> getDepartment();

    /**
     * 查询大家保险所有的代理人
     *
     * @return 戴辆
     */
    List<Agent> getAgent();

    /**
     * 大家保险用户提交台账
     *
     * @param map 里面存着提交的数据
     * @return 戴辆
     */
    Integer postDaily(Map map);

    /**
     * 判断有没有数据
     *
     * @param map 里面存在用户id 和 车牌号
     * @return 戴辆
     */
    Integer getQueryMessageNumber(Map map);

    /**
     * 大家保险用户 通过车牌号查询自己对应的保单信息
     *
     * @param map 里面存储着用户id和车牌号
     * @return 戴辆
     */
    List<NewDaily> getQueryMessage(Map map);

    /**
     * 第一步 先查询总条数
     * 管理员 查询对应的保单信息
     *
     * @param map 里面存着 对应的数据 车牌号 或 用户名称
     * @return 戴辆
     */
    Integer getSearchMessageNumber(Map map);

    /**
     * 第二步 查询对应的数据
     * 管理员查询对应的数据
     *
     * @param map 里面存着 对应的数据 车牌号 或 用户名称
     * @return 戴辆
     */
    List<AdminDaily> getSearchMessage(Map map);

    /**
     * 管理员查询总台账 查询对应时间段内的险种金额
     *
     * @param map 里面存着起始时间和结束时间
     * @return 戴辆
     */
    AdminCost querySumDaily(Map map);

    /**
     * 管理员查询 对应时间段的商业险保费 和 交强险保费
     *
     * @param map 里面存着起始时间和结束时间
     * @return 戴辆
     */
    Cost AdminCost(Map map);

    /**
     * 管理员查询 对应时间段钟 对应部门或代理人的 交强险和商业险金额
     *
     * @param map 里面存着 起始时间 结束时间 部门id或代理人id
     * @return 戴辆
     */
    AdminCost getSumSelect(Map map);
}
