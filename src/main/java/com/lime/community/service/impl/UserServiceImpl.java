package com.lime.community.service.impl;

import com.lime.community.model.entity.User;
import com.lime.community.repository.UserMapper;
import com.lime.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author mohe
 * @date 2022-02-21 13:15:29
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }
}
