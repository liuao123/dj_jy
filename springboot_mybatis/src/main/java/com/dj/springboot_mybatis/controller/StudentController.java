package com.dj.springboot_mybatis.controller;

import com.dj.springboot_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("findStu")
    public String findStu(Model model){
        model.addAttribute("stuList",studentService.findStu());
        return "student";
    }
}
