package com.bbtong.Service.Impl;

import com.bbtong.Dao.BeansDao;
import com.bbtong.Service.BeansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeansServiceImpl implements BeansService {

    @Autowired
    private BeansDao beansDao;
}
