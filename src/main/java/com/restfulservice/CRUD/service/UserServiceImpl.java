package com.restfulservice.CRUD.service;

import com.restfulservice.CRUD.model.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
   /* @Override
    public List<User> getAllUsers(){
        return this.users;
    }*/
    @Override
    public User getUser(Integer userid){
        return users.stream()
                .filter(x->x.getUserid() == userid)
                .findAny()
                .orElse(new User(0, "Not Available"));
    }

    public static List<User> users;

    public UserServiceImpl(){
        users=new LinkedList<>();
        users.add(new User(100, "David"));
        users.add(new User(101, "Peter"));
        users.add(new User(102, "John"));
    }
}
