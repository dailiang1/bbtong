package com.bbtong.Dao;

import com.bbtong.Pojo.DeliveryOrder;
import com.bbtong.Pojo.DeliveryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryOrderDao {
    long countByExample(DeliveryOrderExample example);

    int deleteByExample(DeliveryOrderExample example);

    int deleteByPrimaryKey(Integer deliveryOrderId);

    int insert(DeliveryOrder record);

    int insertSelective(DeliveryOrder record);

    List<DeliveryOrder> selectByExample(DeliveryOrderExample example);

    DeliveryOrder selectByPrimaryKey(Integer deliveryOrderId);

    int updateByExampleSelective(@Param("record") DeliveryOrder record, @Param("example") DeliveryOrderExample example);

    int updateByExample(@Param("record") DeliveryOrder record, @Param("example") DeliveryOrderExample example);

    int updateByPrimaryKeySelective(DeliveryOrder record);

    int updateByPrimaryKey(DeliveryOrder record);
}