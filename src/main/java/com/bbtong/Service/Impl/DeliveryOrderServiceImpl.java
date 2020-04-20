package com.bbtong.Service.Impl;

import com.bbtong.Dao.DeliveryOrderDao;
import com.bbtong.Service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 还单表
 */

@Service
public class DeliveryOrderServiceImpl implements DeliveryOrderService {

    @Autowired
    private DeliveryOrderDao deliveryOrderDao;
}
