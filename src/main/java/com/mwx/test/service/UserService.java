package com.mwx.test.service;

import com.mwx.test.model.User;
import java.util.List;
public interface UserService{

    User getUser(Integer id);

    List<User> getByPage(Integer pagenum,Integer pagesize);

    void insertUser(User user);
}
