package com.bbtong.Service.Impl;

import com.bbtong.Dao.AwaitDeliveryOrderDao;
import com.bbtong.Service.AwaitDeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AwaitDeliveryOrderServiceImpl implements AwaitDeliveryOrderService {

    @Autowired
    private AwaitDeliveryOrderDao awaitDeliveryOrderDao;
}
