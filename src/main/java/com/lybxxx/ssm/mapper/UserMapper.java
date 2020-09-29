package com.lybxxx.ssm.mapper;

import com.lybxxx.ssm.pojo.User;

/**
 * @author lybxxx
 */
public interface UserMapper {
    int addUser(User user);

    int deleteUser(int id);

    User getUser(User user);

    int updateUser(User user);
}
