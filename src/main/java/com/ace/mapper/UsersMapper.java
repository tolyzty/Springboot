package com.ace.mapper;

import com.ace.pojo.User;
import com.ace.pojo.Users;

import java.util.List;

public interface UsersMapper {
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