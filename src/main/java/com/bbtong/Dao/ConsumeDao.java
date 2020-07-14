package com.bbtong.Dao;

import com.bbtong.Pojo.Consume;
import com.bbtong.Pojo.ConsumeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 消费卡申请
 */
public interface ConsumeDao {
    long countByExample(ConsumeExample example);

    int deleteByExample(ConsumeExample example);

    int deleteByPrimaryKey(Integer consumeId);

    int insert(Consume record);

    int insertSelective(Consume record);

    List<Consume> selectByExample(ConsumeExample example);

    Consume selectByPrimaryKey(Integer consumeId);

    int updateByExampleSelective(@Param("record") Consume record, @Param("example") ConsumeExample example);

    int updateByExample(@Param("record") Consume record, @Param("example") ConsumeExample example);

    int updateByPrimaryKeySelective(Consume record);

    int updateByPrimaryKey(Consume record);

    /**
     * 先根据userId查询出用户的代理编号
     * @param userId 用户的userId
     * @return
     */
    String User_Number(@Param("userId") Integer userId);

    /**
     * 用户消费卡申请的方法
     * @param consume 用来存储参数， user_Id 和 consumeNumber(大家保险单号)的编号
     * 戴辆
     */
    Integer Submit(Consume consume);

    /**
     * 查询用户 查询的数据有多少条
     * @param map 用户的userid 和 用户需要查询的类型
     * @return
     */
    Integer  QueryNumber(Map map);

    /**
     * 用户查询 当前对应状态申请的信息
     * @param map 存储用户的user_id,还有index，当前的页数，以及end每页显示的条数
     * @return 戴辆
     */
    List<Consume> Query(Map map);

    /**
     * 管理员查看待审核的条数
     * @param map
     * @return
     */
    int SelectQueryNumber(Map map);

    /**
     * 管理员查询 显示对应的信息
     * @param map
     * @return
     */
    List<Consume> SelectQuery(Map map);

}