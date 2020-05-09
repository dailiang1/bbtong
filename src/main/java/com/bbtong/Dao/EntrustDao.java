package com.bbtong.Dao;

import com.bbtong.Base.DaEntrust;
import com.bbtong.Base.DaParticulars;
import com.bbtong.Base.Information;
import com.bbtong.Pojo.Entrust;
import com.bbtong.Pojo.EntrustExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EntrustDao {
    long countByExample(EntrustExample example);

    int deleteByExample(EntrustExample example);

    int deleteByPrimaryKey(Integer entrustId);

    int insert(Entrust record);

    int insertSelective(Entrust record);

    List<Entrust> selectByExample(EntrustExample example);

    Entrust selectByPrimaryKey(Integer entrustId);

    int updateByExampleSelective(@Param("record") Entrust record, @Param("example") EntrustExample example);

    int updateByExample(@Param("record") Entrust record, @Param("example") EntrustExample example);

    int updateByPrimaryKeySelective(Entrust record);

    int updateByPrimaryKey(Entrust record);

    /**
     * 用户发布委托单的方法
     * @param entrust 用来接收用于sql添加的的数据
     * @return 戴辆
     */
    int AddEntrust(Entrust entrust);

    /**
     * 查询对应用户的总条数
     * @param map map函数中存储着数据
     * @return 戴辆
     */
    int DaSelectEntrustNumber(Map map);

    /**
     * 大家保险用户查询对应页数的数据，并且显示
     * @param map 用户查询对应的数据，通过userId 显示一页的数据
     * @return 戴辆
     */
    List<DaEntrust> DaSelectEntrust(Map map);

    /**
     * 先通过用户的ID和委托订单的ID查询对应有意向接单的人的ID
     * @param map userId 和 entrustId
     * @return 戴辆
     */
    String NewUserId(Map map);

    /**
     * 大家保险用户查询对应的有意向接单的客户信息
     * @param map
     * @return
     */
    List<DaParticulars> DaParticulars(Map map);

    /**
     * 第一步：将委托中的配给指定的人，(将这条委托的最终接单人，写入这个newUserId)
     * @param map 传入对应的数据， userId 委托人的ID finallyUserId 接单人的ID entrustId 订单的ID
     * @return 戴辆
     */
    Integer UpdateEntrust(Map map);

    /**
     * 第二步：将除了接单的人之外的其他人，变的可以有意向委托
     * @param map 里面存储着 userId 以及finallyUserId 和 entrustId
     * @return 戴辆
     */
    Integer UpdateNewUserId(Map map);

    /**
     * 第三步 1.先查询委托人的姓名的和电话
     * @param map 委托人的ID
     * @return 戴辆
     */
    Information Information(Map map);

    /**
     * 第三步 2.将两个人添加好友关系
     * @param map map中存的是两个人的信息
     * @return 戴辆
     */
    Integer AddFriend(Map map);

    /**
     * 第四步 将订单的信息，写入到接单的表中。记录信息
     * @param map 发布委托人的ID 接单人的ID 委托的ID
     * @return 戴辆
     */
    Integer AddOrder(Map map);
}