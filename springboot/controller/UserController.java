package com.dj.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import com.dj.springboot.pojo.User;
import com.dj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 测试mybatis注解方式
	@RequestMapping("findUserAll")
	@ResponseBody
	public List<User> findUserAll() {
		return userService.findUserAll();
	}
	// 测试mybatis注解方式
	@RequestMapping("findUserById")
	@ResponseBody
	public User findUserById(Integer id) {
		return userService.findUserById(id);
	}
	
	// 测试mybatis xml方式
	@RequestMapping("deleteByIds")
	@ResponseBody
	public String deleteByIds() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		userService.deleteAll(list);
		return "ok";
	}
	
	@RequestMapping("insertUser")
	@ResponseBody
	public Integer insertUser(User user) {
		userService.insertUser(user);
		return user.getId();
	}
	
	// 测试事物
	@RequestMapping("insertOrUpdate")
	@ResponseBody
	public String insertOrUpdate(User user) throws Exception {
		userService.insertOrUpdate(user);
		return "ok";
	}
	
	// 使用Thymeleaf模板
	@RequestMapping("thymeleafTest")
	public String thymeleafTest(Model model) {
		model.addAttribute("userList", userService.findUserAll());
		return "userList";
	}
	
	// 测试mybatis @SelectProvider 注解方式
	@RequestMapping(value = "findUserByIdd")
	@ResponseBody
	public User findUserByIdd(Integer id) {
		return userService.findUserByIdd(id);
	}



	@RequestMapping("testdj")
	@ResponseBody
	public String testdj(){
		return "aa";
	}

	@RequestMapping("testdj1")
	@ResponseBody
	public String testdj1(@RequestBody User user){
		return "success";
	}
}
