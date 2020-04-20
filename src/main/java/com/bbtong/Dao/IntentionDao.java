package com.bbtong.Dao;

import com.bbtong.Pojo.Intention;
import com.bbtong.Pojo.IntentionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/***
 * 有意向的委托表
 */

@Mapper
public interface IntentionDao {
    long countByExample(IntentionExample example);

    int deleteByExample(IntentionExample example);

    int deleteByPrimaryKey(Integer intentionId);

    int insert(Intention record);

    int insertSelective(Intention record);

    List<Intention> selectByExample(IntentionExample example);

    Intention selectByPrimaryKey(Integer intentionId);

    int updateByExampleSelective(@Param("record") Intention record, @Param("example") IntentionExample example);

    int updateByExample(@Param("record") Intention record, @Param("example") IntentionExample example);

    int updateByPrimaryKeySelective(Intention record);

    int updateByPrimaryKey(Intention record);
}