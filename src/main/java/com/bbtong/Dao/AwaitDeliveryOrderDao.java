package com.bbtong.Dao;

import com.bbtong.Pojo.AwaitDeliveryOrder;
import com.bbtong.Pojo.AwaitDeliveryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwaitDeliveryOrderDao {
    long countByExample(AwaitDeliveryOrderExample example);

    int deleteByExample(AwaitDeliveryOrderExample example);

    int deleteByPrimaryKey(Integer awaitDeliveryOrderId);

    int insert(AwaitDeliveryOrder record);

    int insertSelective(AwaitDeliveryOrder record);

    List<AwaitDeliveryOrder> selectByExample(AwaitDeliveryOrderExample example);

    AwaitDeliveryOrder selectByPrimaryKey(Integer awaitDeliveryOrderId);

    int updateByExampleSelective(@Param("record") AwaitDeliveryOrder record, @Param("example") AwaitDeliveryOrderExample example);

    int updateByExample(@Param("record") AwaitDeliveryOrder record, @Param("example") AwaitDeliveryOrderExample example);

    int updateByPrimaryKeySelective(AwaitDeliveryOrder record);

    int updateByPrimaryKey(AwaitDeliveryOrder record);
}