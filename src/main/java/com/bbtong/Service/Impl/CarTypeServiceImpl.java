package com.bbtong.Service.Impl;

import com.bbtong.Dao.CarTypeDao;
import com.bbtong.Service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * 车类型表
 */

@Service
public class CarTypeServiceImpl implements CarTypeService {

    @Autowired
    private CarTypeDao carTypeDao;
}
