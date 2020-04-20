package com.bbtong.Service.Impl;

import com.bbtong.Dao.EntrustDao;
import com.bbtong.Service.EntrustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 委托订单表
 */

@Service
public class EntrustServiceImpl implements EntrustService {

    @Autowired
    private EntrustDao entrustDao;
}
