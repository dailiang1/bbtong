package com.bbtong.Service.Impl;

import com.bbtong.Dao.AmountRangeDao;
import com.bbtong.Service.AmountRangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 车保金额类
 */

@Service
public class AmountRangeServiceImpl implements AmountRangeService {

    @Autowired
    private AmountRangeDao amountRangeDao;
}
