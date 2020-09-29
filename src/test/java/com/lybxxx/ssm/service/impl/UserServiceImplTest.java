package com.lybxxx.ssm.service.impl;

import com.lybxxx.ssm.mapper.UserMapper;
import com.lybxxx.ssm.pojo.User;
import com.lybxxx.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceImplTest {

    @Autowired
     private UserMapper userMapper;

    @Test
    public void test () {
        User user = new User();
        user.setName("lyb");
        user.setPassword("12345");
        User newUser = userMapper.getUser(user);
        System.out.println(newUser);
    }

}