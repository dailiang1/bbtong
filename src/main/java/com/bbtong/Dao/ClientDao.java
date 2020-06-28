package com.bbtong.Dao;

import com.bbtong.Pojo.Client;
import com.bbtong.Pojo.ClientExample;

import java.util.List;
import java.util.Map;

import com.bbtong.Pojo.SelectClient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 客户表
 */

@Mapper
public interface ClientDao {
    long countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int deleteByPrimaryKey(Integer clientId);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExample(ClientExample example);

    Client selectByPrimaryKey(Integer clientId);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);


    /**
     * 用户添加自己的客户
     *
     * @param client 用来存储客户添加的数据
     * @return 戴辆
     */
    Integer AddClient(Client client);

    /**
     * 查询用户对应的客户有多少条
     *
     * @param map 用户的ID(userId) 客户的类型(typeId)
     * @return
     */
    Integer SelectQueryNumber(Map map);

    /**
     * 用户查询自己对应的客户，来显示到签到数据
     *
     * @param map map 中存储数据用户sql中查询数据
     * @return 戴辆
     */
    List<SelectClient> SelectQuery(Map map);

    /**
     * 查询对应的客户详细的信息
     *
     * @param map map函数用来存储数据用于查询
     * @return 戴辆
     */
    SelectClient Particulars(Map map);

    /**
     * 查询用户在这一个月内生日的客户 12月到一月
     *
     * @param map 里面用来存储参数
     * @return 戴辆
     */
    List<SelectClient> Birthday(Map map);

    /**
     * 查询用户在这个一个月内生日的客户数量 12月到一月
     *
     * @param map 传数据到后端进行sql 查询
     * @return 戴辆
     */
    Integer BirthdayNumber(Map map);

    /**
     * 查询用户在这个一个月生日的客户
     *
     * @param map 里面用来存储参数
     * @return 戴辆
     */
    List<SelectClient> NewBirthday(Map map);

    /**
     * 查询对应的客户的数据
     *
     * @param map 用来存储页数
     * @return 戴辆
     */
    Integer NewBirthdayNumber(Map map);

    /**
     * 用户快到车险的客户条数(一个月之内的)
     *
     * @param map 存储用于数据查询的数据 (userId 用户的ID，Time 当前的时间，NewTime 一个月之后的时间)
     * @return 戴辆
     */
    Integer InsuranceWarnNumber(Map map);

    /**
     * 用户快到车险的客户的个人信息
     *
     * @param map 用来存储查询的数据 (userId 用户的Id,Time 当前的时间， NewTime 一个月之后的时间，state 忽略多少条数据，end 查询多少条数据)
     * @return
     */
    List<SelectClient> InsuranceWarn(Map map);

    /**
     * 用户修改客户的个人信息
     *
     * @param selectClient 里面存储着用户修改的信息
     * @return 戴辆
     */
    int ClientRedact(SelectClient selectClient);

    /**
     * 用户删除客户的方法
     *
     * @param map 里面存储着数据
     * @return 戴辆
     */
    int DelectClient(Map map);
}