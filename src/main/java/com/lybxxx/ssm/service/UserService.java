package com.lybxxx.ssm.service;

import com.lybxxx.ssm.pojo.User;

/**
 * @author lybxxx
 */
public interface UserService {
    int addUser(User user);

    User getUser(User user);

}
