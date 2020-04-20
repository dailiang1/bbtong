package com.bbtong.Service.Impl;

import com.bbtong.Dao.IntentionDao;
import com.bbtong.Service.IntentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/***
 * 有意向的委托表
 */

@Service
public class IntentionServiceImpl implements IntentionService {

    @Autowired
    private IntentionDao intentionDao;
}
