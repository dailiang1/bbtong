package com.bbtong.Dao;

import com.bbtong.Pojo.AmountRange;
import com.bbtong.Pojo.AmountRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/***
 * 车保金额类
 */

public interface AmountRangeDao {
    long countByExample(AmountRangeExample example);

    int deleteByExample(AmountRangeExample example);

    int deleteByPrimaryKey(Integer amountRangeId);

    int insert(AmountRange record);

    int insertSelective(AmountRange record);

    List<AmountRange> selectByExample(AmountRangeExample example);

    AmountRange selectByPrimaryKey(Integer amountRangeId);

    int updateByExampleSelective(@Param("record") AmountRange record, @Param("example") AmountRangeExample example);

    int updateByExample(@Param("record") AmountRange record, @Param("example") AmountRangeExample example);

    int updateByPrimaryKeySelective(AmountRange record);

    int updateByPrimaryKey(AmountRange record);
}