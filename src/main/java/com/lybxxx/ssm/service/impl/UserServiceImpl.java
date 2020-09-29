package com.lybxxx.ssm.service.impl;

import com.lybxxx.ssm.mapper.UserMapper;
import com.lybxxx.ssm.pojo.User;
import com.lybxxx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }
}
