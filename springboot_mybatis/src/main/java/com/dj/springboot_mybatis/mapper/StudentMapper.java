package com.dj.springboot_mybatis.mapper;

import com.dj.springboot_mybatis.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from student")
    List<Student> findStu();
}
