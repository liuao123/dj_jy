package com.dj.springboot_mybatis.service.impl;

import com.dj.springboot_mybatis.domain.User;
import com.dj.springboot_mybatis.mapper.UserMapper;
import com.dj.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }

    @Override
    public Integer addUser(User user) {
        userMapper.addUser(user);
        Integer id = user.getId();
        return id;
    }


    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);

    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

}
