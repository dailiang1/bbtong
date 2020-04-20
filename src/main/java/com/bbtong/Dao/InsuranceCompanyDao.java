package com.bbtong.Dao;

import com.bbtong.Pojo.InsuranceCompany;
import com.bbtong.Pojo.InsuranceCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsuranceCompanyDao {
    long countByExample(InsuranceCompanyExample example);

    int deleteByExample(InsuranceCompanyExample example);

    int deleteByPrimaryKey(Integer insuranceCompanyId);

    int insert(InsuranceCompany record);

    int insertSelective(InsuranceCompany record);

    List<InsuranceCompany> selectByExample(InsuranceCompanyExample example);

    InsuranceCompany selectByPrimaryKey(Integer insuranceCompanyId);

    int updateByExampleSelective(@Param("record") InsuranceCompany record, @Param("example") InsuranceCompanyExample example);

    int updateByExample(@Param("record") InsuranceCompany record, @Param("example") InsuranceCompanyExample example);

    int updateByPrimaryKeySelective(InsuranceCompany record);

    int updateByPrimaryKey(InsuranceCompany record);
}