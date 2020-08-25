package com.bbtong.Dao;

import com.bbtong.Pojo.dj.Dealer;
import com.bbtong.Pojo.dj.DealerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerDao {
    long countByExample(DealerExample example);

    int deleteByExample(DealerExample example);

    int deleteByPrimaryKey(Integer dealerId);

    int insert(Dealer record);

    int insertSelective(Dealer record);

    List<Dealer> selectByExample(DealerExample example);

    Dealer selectByPrimaryKey(Integer dealerId);

    int updateByExampleSelective(@Param("record") Dealer record, @Param("example") DealerExample example);

    int updateByExample(@Param("record") Dealer record, @Param("example") DealerExample example);

    int updateByPrimaryKeySelective(Dealer record);

    int updateByPrimaryKey(Dealer record);
}