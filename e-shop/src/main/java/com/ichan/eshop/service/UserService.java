package com.ichan.eshop.service;

import com.ichan.eshop.dto.UserLoginRequest;
import com.ichan.eshop.dto.UserRegisterRequest;
import com.ichan.eshop.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
