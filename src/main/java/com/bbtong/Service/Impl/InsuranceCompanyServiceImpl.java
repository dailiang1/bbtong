package com.bbtong.Service.Impl;

import com.bbtong.Dao.InsuranceCompanyDao;
import com.bbtong.Pojo.InsuranceCompany;
import com.bbtong.Service.InsuranceCompanyService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 保险公司表
 */

@Service
public class InsuranceCompanyServiceImpl implements InsuranceCompanyService {

    @Resource
    private InsuranceCompanyDao insuranceCompanyDao;

    /***
     * 查询保险公司表中保险公司和ID的方法
     * 戴辆
     */
    @Override
    public Result selectInsurance() {
        Result result=new Result();
        List<InsuranceCompany> insuranceCompanyList=insuranceCompanyDao.selectInsurance();
        if(insuranceCompanyList.size()>0){
            result.setCode(200);
            result.setData(insuranceCompanyList);
            result.setMessage("查询数据成功");
        }else{
            result.setData(400);
            result.setData(insuranceCompanyList);
            result.setMessage("查询数据失败");
        }
        return result;
    }
}
