package com.ace.mapper;

import com.ace.pojo.User;

import java.util.List;

public interface UserMapper {
    int insert(User user);

    int insertSelective(User user);

    List<User> findAll();

    User selectById(Integer id);

    int updateByKey(User user);

    int deleteById(Integer id);

    List<User> findAuthByName(String username);

    User selectByname(String username);

    boolean login(String username,String password);
}
