package com.restfulservice.CRUD;

import com.restfulservice.CRUD.model.User;
import com.restfulservice.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("")
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }

    @ResponseBody
    @RequestMapping("/{id}")
    public Map<String, Object> getUser(@PathVariable("id") Integer id){
        Map<String, Object> map=new LinkedHashMap<>();
        map.put("result", "Get User Implementation");
        return map;
    }

    @ResponseBody
    @RequestMapping(value="", method= RequestMethod.POST)
    public Map<String, Object> createUser(){
        Map<String, Object>map=new LinkedHashMap<>();
        map.put("result", "Create User implementation");
        return map;
    }

    @ResponseBody
    @RequestMapping(value="", method=RequestMethod.PUT)
    public Map<String, Object> updateUser(){
        Map<String, Object> map=new LinkedHashMap<>();
        map.put("result", "Update User Implementation");
        return map;
    }

    @ResponseBody
    @RequestMapping(value="", method=RequestMethod.DELETE)
    public Map<String, Object> deleteUser(){
        Map<String, Object> map=new LinkedHashMap<>();
        map.put("result", "Delete User Implementation");
        return map;
    }
}
