package com.ichan.eshop.service.impl;

import com.ichan.eshop.dao.UserDao;
import com.ichan.eshop.dto.UserRegisterRequest;
import com.ichan.eshop.model.User;
import com.ichan.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
