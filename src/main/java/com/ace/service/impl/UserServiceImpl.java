package com.ace.service.impl;

import com.ace.mapper.UserMapper;
import com.ace.pojo.User;
import com.ace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public int insert(User user) {
        return this.userMapper.insert(user);
    }

    public int insertSelective(User user) {
        return this.userMapper.insertSelective(user);
    }

    public List<User> findAll() {
        return this.userMapper.findAll();
    }

    public User selectById(Integer id) {
        return this.userMapper.selectById(id);
    }

    public int updateByKey(User user) {
        return this.userMapper.updateByKey(user);
    }

    public int deleteById(Integer id) {
        return this.userMapper.deleteById(id);
    }

    public List<User> findAuthByName(String username) {
        return this.userMapper.findAuthByName(username);
    }

    public boolean login(String username, String password) {
        User user = userMapper.selectByname(username);
        if(user!=null){
            if(user.getUserUsername().equals(username) && user.getUserPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public User selectByname(String username) {
        return this.userMapper.selectByname(username);
    }



}