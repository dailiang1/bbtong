package com.bbtong.Service.Impl;

import com.bbtong.Dao.InsuranceCompanyDao;
import com.bbtong.Service.InsuranceCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 保险公司表
 */

@Service
public class InsuranceCompanyServiceImpl implements InsuranceCompanyService {

    @Autowired
    private InsuranceCompanyDao insuranceCompanyDao;
}
