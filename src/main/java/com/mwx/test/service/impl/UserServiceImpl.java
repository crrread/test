package com.mwx.test.service.impl;

import com.mwx.test.mapper.UserMapper;
import com.mwx.test.model.User;
import com.mwx.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer id){
        return userMapper.getById(id);
    }

    public List<User> getByPage(Integer pagenum, Integer pagesize){
        Integer start = (pagenum-1) * pagesize;
        return userMapper.getByPage(start,pagesize);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }
}
