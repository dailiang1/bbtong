package com.bbtong.Dao;

import com.bbtong.Pojo.Type;
import com.bbtong.Pojo.TypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/***
 * 客户类型表
 */
public interface TypeDao {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    /**
     *查询客户类型的数据
     * @return 戴辆
     */
    List<Type> SelectType();
}