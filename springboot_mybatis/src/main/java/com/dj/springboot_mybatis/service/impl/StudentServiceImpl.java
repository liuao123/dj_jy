package com.dj.springboot_mybatis.service.impl;

import com.dj.springboot_mybatis.domain.Student;
import com.dj.springboot_mybatis.mapper.StudentMapper;
import com.dj.springboot_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> findStu() {
        return studentMapper.findStu();
    }
}
