package com.ace.service;

import com.ace.pojo.User;

import java.util.List;


public interface UserService {

    int insert(User user);

    int insertSelective(User user);

    List<User> findAll();

    User selectById(Integer id);

    int updateByKey(User user);

    int deleteById(Integer id);

    List<User> findAuthByName(String username);

    boolean login(String username,String password);

    User selectByname(String username);
}
