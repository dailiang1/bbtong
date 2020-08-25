package com.bbtong.Dao;

import com.bbtong.Pojo.dj.Daily;
import com.bbtong.Pojo.dj.DailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyDao {
    long countByExample(DailyExample example);

    int deleteByExample(DailyExample example);

    int deleteByPrimaryKey(Integer dailyId);

    int insert(Daily record);

    int insertSelective(Daily record);

    List<Daily> selectByExample(DailyExample example);

    Daily selectByPrimaryKey(Integer dailyId);

    int updateByExampleSelective(@Param("record") Daily record, @Param("example") DailyExample example);

    int updateByExample(@Param("record") Daily record, @Param("example") DailyExample example);

    int updateByPrimaryKeySelective(Daily record);

    int updateByPrimaryKey(Daily record);
}