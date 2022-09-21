package com.ichan.eshop.dao;

import com.ichan.eshop.dto.UserRegisterRequest;
import com.ichan.eshop.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
