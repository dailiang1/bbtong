package com.bbtong.Service.Impl;

import com.bbtong.Dao.FriendDao;
import com.bbtong.Service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendDao friendDao;
}
