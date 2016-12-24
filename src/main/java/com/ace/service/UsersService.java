package com.ace.service;

import com.ace.pojo.Users;

import java.util.List;

/**
 * Created by Administrator on 2016/12/17.
 */
public interface UsersService {
    int insert(Users users);

    int insertSelective(Users users);

    List<Users> findAll();

    Users selectById(Integer id);

    int updateByKey(Users users);

    int deleteById(Integer id);

    List<Users> findAuthByName(String username);

    Users selectByname(String username);

    boolean login(String username,String password);



}
