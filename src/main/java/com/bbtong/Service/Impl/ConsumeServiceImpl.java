package com.bbtong.Service.Impl;

import com.bbtong.Dao.ConsumeDao;
import com.bbtong.Service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消费卡申请表
 */

@Service
public class ConsumeServiceImpl implements ConsumeService {

    @Autowired
    private ConsumeDao consumeDao;
}
