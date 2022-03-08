package com.mwx.test.controller;

import com.mwx.test.mapper.UserMapper;
import com.mwx.test.model.User;
import com.mwx.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping
    public User getUser(Integer id){
        return UserService.getUser(id);
    }

    @GetMapping("/page")
    public List<User> getByPage(Integer pagenum, Integer pagesize){
        return UserService.getByPage(pagenum,pagesize);
    }

    @PostMapping
    public void insertUser(@RequestBody User user){
        UserService.insertUser(user);
    }

}
