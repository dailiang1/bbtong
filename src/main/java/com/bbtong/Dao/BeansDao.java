package com.bbtong.Dao;

import com.bbtong.Pojo.Beans;
import com.bbtong.Pojo.BeansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BeansDao {
    long countByExample(BeansExample example);

    int deleteByExample(BeansExample example);

    int deleteByPrimaryKey(Integer beansId);

    int insert(Beans record);

    int insertSelective(Beans record);

    List<Beans> selectByExample(BeansExample example);

    Beans selectByPrimaryKey(Integer beansId);

    int updateByExampleSelective(@Param("record") Beans record, @Param("example") BeansExample example);

    int updateByExample(@Param("record") Beans record, @Param("example") BeansExample example);

    int updateByPrimaryKeySelective(Beans record);

    int updateByPrimaryKey(Beans record);
}