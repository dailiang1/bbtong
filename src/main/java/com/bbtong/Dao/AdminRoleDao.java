package com.bbtong.Dao;

import com.bbtong.Pojo.AdminRole;
import com.bbtong.Pojo.AdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleDao {
    long countByExample(AdminRoleExample example);

    int deleteByExample(AdminRoleExample example);

    int deleteByPrimaryKey(Integer adminRoleId);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    List<AdminRole> selectByExample(AdminRoleExample example);

    AdminRole selectByPrimaryKey(Integer adminRoleId);

    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);
}