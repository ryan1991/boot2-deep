package com.kinbo.boot2deep.controller;

import com.kinbo.boot2deep.aspect.UserLog;
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
    @UserLog(module = "用户管理", operate = "添加用户")
    public int addUser(String name, int age){
        return userMapper.insertOne(name, age);
    }


    @RequestMapping("/find")
    @UserLog(module = "用户管理", operate = "查询用户")
    public User findUser(String name){
        return userMapper.findByName(name);
    }

}
