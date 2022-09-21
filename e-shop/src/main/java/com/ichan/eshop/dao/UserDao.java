package com.ichan.eshop.dao;

import com.ichan.eshop.dto.UserRegisterRequest;
import com.ichan.eshop.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
