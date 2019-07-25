package com.kinbo.boot2deep.controller;

import com.kinbo.boot2deep.dao.UserMapper;
import com.kinbo.boot2deep.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/add")
    public int addUser(String name, int age){
        return userMapper.insertOne(name, age);
    }


    @RequestMapping("/find")
    public User findUser(String name){
        return userMapper.findByName(name);
    }

}
