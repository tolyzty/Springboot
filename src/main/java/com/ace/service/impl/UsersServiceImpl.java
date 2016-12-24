package com.ace.service.impl;

import com.ace.mapper.UsersMapper;
import com.ace.pojo.Users;
import com.ace.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/17.
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;


    public int insert(Users users) {
        return this.usersMapper.insert(users);
    }

    public int insertSelective(Users users) {
        return this.usersMapper.insertSelective(users);
    }

    public List<Users> findAll() {
        return this.usersMapper.findAll();
    }

    public Users selectById(Integer id) {
        return this.usersMapper.selectById(id);
    }

    public int updateByKey(Users users) {
        return this.usersMapper.updateByKey(users);
    }

    public int deleteById(Integer id) {
        return this.usersMapper.deleteById(id);
    }

    public List<Users> findAuthByName(String username) {
        return this.usersMapper.findAuthByName(username);
    }

    public Users selectByname(String username) {
        return this.usersMapper.selectByname(username);
    }

    public boolean login(String username, String password) {
        Users users = usersMapper.selectByname(username);
        if (users!=null){
            if (users.getUsername().equals(username)&&users.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
