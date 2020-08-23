package com.restfulservice.CRUD.service;

import com.restfulservice.CRUD.model.User;

import java.util.List;

public interface UserService {
    //List<User> getAllUsers();
    User getUser(Integer userid);
}
