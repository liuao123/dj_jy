package com.dj.springboot_mybatis.controller;

import com.dj.springboot_mybatis.domain.User;
import com.dj.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //全表查询
    @RequestMapping("findUser")
    @ResponseBody
    public List<User> findUser(){
        List<User> user = userService.findUser();
        return user;
    }

    //    id查询
    @RequestMapping("findUserById")
    @ResponseBody
    public User findUserById (Integer id){
        User user = userService.findUserById(id);
        return user;
    }

    //    增加
    @RequestMapping("addUser")
    @ResponseBody
    public Integer addUser(User user){
        Integer id = userService.addUser(user);

        return id;
    }

    //    根据id删除
    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser(Integer id){
       userService.deleteUser(id);
        return "ok";
    }

    //    修改
    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(User user){
      userService.updateUser(user);

        return "ok";
    }

}
