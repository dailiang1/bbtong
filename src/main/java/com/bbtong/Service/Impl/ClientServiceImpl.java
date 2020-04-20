package com.bbtong.Service.Impl;

import com.bbtong.Dao.ClientDao;
import com.bbtong.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 客户表
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;
}
