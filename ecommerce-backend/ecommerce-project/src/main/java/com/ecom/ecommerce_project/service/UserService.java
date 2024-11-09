package com.ecom.ecommerce_project.service;

import com.ecom.ecommerce_project.exception.UserException;
import com.ecom.ecommerce_project.model.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

}
