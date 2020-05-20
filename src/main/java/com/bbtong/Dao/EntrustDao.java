package com.bbtong.Dao;

import com.bbtong.Base.*;
import com.bbtong.Pojo.DeliveryOrder;
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
     * 查询对应的
     * @param map
     * @return
     */
    Entrust  Entrust(Map map);

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

    /**
     * 第五步 将接单的这个人是否可以接单的状态，修改成不可以接单
     * @param map 接单人的ID
     * @return 戴辆
     */
    Integer UpdateOrder(Map map);

    /**
     * 委托人查询自己对应的发布过的委托
     * @param userId 用户的ID
     * @return 戴辆
     */
    List<Entrust> IssueRecord(@Param("userId") Integer userId);

    /**
     * 委托人查询自己 对应接过的委托
     * @param userId 戴辆
     * @return 戴辆
     */
    List<Entrust> OrderRecord(@Param("userId") Integer userId);

    /**
     * 第一步 先查询数据库 1.用户是否还能有意向 2.是否还能接单 3.是否开发通了年费 4.诚信是否合格
     * @param map 通过用户的 userId 来查询数据
     * @return 戴辆
     */
    HaveUser SelectUser(Map map);

    /**
     * 第二步 通过用户的ID和委托订单的ID查询对应有意向接单的人的ID
     * @param map userId 和 entrustId
     * @return 戴辆
     */
    String NewUserId(Map map);

    /**
     * 第三步 将用户添加到该订单的有意向人数中
     * @param map newUserId 有意向的用户数据
     * @return 戴辆
     */
    Integer Update(Map map);

    /**
     * 第四步 将用户的意向委托次数改成1(表示不可以)
     * @param map 用户的userId
     * @return 戴辆
     */
    Integer Intention(Map map);

    /**
     * 用户查看自己有意向委托的信息
     * @param userId 用户的ID
     * @return 戴辆
     */
    UserIntention UserIntention(@Param("userId") Integer userId);

    /**
     * 第二步 用户取消对应的委托意向 将用户从有意向的人中去除
     * @param map entrustId 委托的ID newUserId 更新后的有意向委托函数
     * @return 戴辆
     */
    Integer DateNewUserId(Map map);

    /**
     * 将用户的可意向状态，修改成可以有意向
     * @param map 用来存储用户的Id
     * @return 戴辆
     */
    Integer DateIntention(Map map);

    /**
     * 用户查询他的当前在处理的委托
     * @param map 用来存储userId
     * @return 戴辆
     */
    UserIntention QueryEntrust(Map map);

    /**
     * 第一步 将委托的状态修改成，已完成
     * @param map map中存储着条件的数据
     * @return 戴辆
     */
    Integer AlterState(Map map);

    /**
     * 第二步 将委托写入到待还单订单中
     * @param map map函数用来存储要存储的函数
     * @return 戴辆
     */
    Integer SaveAlso(Map map);

    /**
     * 将委托的状态修改
     * @param map map中用来存储参数
     * @return 戴辆
     */
    Integer DaAffirm(Map map);

    /**
     * 第一步 先查询用户对应的接单还未处理的委托
     * @param userId 用户的ID
     * @return 戴辆
     */
    Integer UserSelectEntrustId(@Param("userId") Integer userId);

    /**
     * 查询当前订单还单的委托有哪些，并且将数据返回
     * @param map map 中存着entrustId和userId 分别表示还单的ID和和还单的人
     * @return 戴辆
     */
    List<DeliveryOrder> selectDeliveryOrder(Map map);
}