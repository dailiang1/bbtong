package com.bbtong.Dao;

import com.bbtong.Pojo.AdminMessage;
import com.bbtong.Pojo.AdminMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMessageDao {
    long countByExample(AdminMessageExample example);

    int deleteByExample(AdminMessageExample example);

    int deleteByPrimaryKey(Integer adminMessageId);

    int insert(AdminMessage record);

    int insertSelective(AdminMessage record);

    List<AdminMessage> selectByExample(AdminMessageExample example);

    AdminMessage selectByPrimaryKey(Integer adminMessageId);

    int updateByExampleSelective(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByExample(@Param("record") AdminMessage record, @Param("example") AdminMessageExample example);

    int updateByPrimaryKeySelective(AdminMessage record);

    int updateByPrimaryKey(AdminMessage record);
}