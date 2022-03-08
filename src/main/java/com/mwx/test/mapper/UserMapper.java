package com.mwx.test.mapper;

import com.mwx.test.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getById(@Param("id") Integer id);

    List<User> getByPage(Integer start, Integer pagesize);

    void insertUser(@Param("user") User user);
}
