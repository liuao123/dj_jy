package com.dj.springboot.service;

import java.util.List;

import com.dj.springboot.mapper.UserMapper;
import com.dj.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUserAll() {
		return userMapper.findUserAll();
	}

	@Override
	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}

	@Override
	public void deleteAll(List<Integer> ids) {
		userMapper.deleteAll(ids);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void insertOrUpdate(User user) throws Exception {
		userMapper.insertUser(user);
		userMapper.updateUser(user);
	}

	@Override
	public User findUserByIdd(Integer id) {
		return userMapper.findUserByIdd(id);
	}
}
