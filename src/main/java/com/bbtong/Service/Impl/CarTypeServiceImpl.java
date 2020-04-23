package com.bbtong.Service.Impl;

import com.bbtong.Dao.CarTypeDao;
import com.bbtong.Pojo.CarType;
import com.bbtong.Service.CarTypeService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/***
 * 车类型表
 */

@Service
public class CarTypeServiceImpl implements CarTypeService {

    @Resource
    private CarTypeDao carTypeDao;

    /**
     * 查询所有车类型的方法
     * 戴辆
     */
    @Override
    public Result selectCarType() {
        Result rs=new Result();

        //用数组来接受车类的数据
        List<CarType> carTypeList=carTypeDao.selectCarType();
        if(carTypeList.size()>0){
            rs.setCode(200);
            rs.setData(carTypeList);
        }else{
            rs.setCode(400);
            rs.setData(carTypeList);
        }
        return rs;
    }
}
