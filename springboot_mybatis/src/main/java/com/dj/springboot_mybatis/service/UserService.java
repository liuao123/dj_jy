package com.dj.springboot_mybatis.service;

import com.dj.springboot_mybatis.domain.User;

import java.util.List;

public interface UserService {

    List<User> findUser();

    Integer addUser(User user);

    User findUserById(Integer id);

    void deleteUser(Integer id);

    void updateUser(User user);
}
