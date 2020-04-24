package com.bbtong.Service.Impl;

import com.bbtong.Dao.UserDao;
import com.bbtong.Pojo.User;
import com.bbtong.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int login(User user) {
        return  1;
    }
}
