package com.bbtong.Service.Impl;

import com.bbtong.Dao.TypeDao;
import com.bbtong.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * 客户类型表
 */

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;
}
