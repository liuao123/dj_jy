package com.dj.springboot.service;

import com.dj.springboot.pojo.User;

import java.util.List;


public interface UserService {

	List<User> findUserAll();
	
	User findUserById(Integer id);
	
	void deleteAll(List<Integer> ids);
	
	void insertUser(User user);
	
	void updateUser(User user);
	
	void insertOrUpdate(User user) throws Exception;
	
	User findUserByIdd(Integer id);
}
