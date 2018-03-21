package com.dj.springboot_mybatis.mapper;

import com.dj.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    /*@Select("select * from user")
    List<User> findUserAll();

    @Select("select * from user where id = #{id}")
    User findUserById(Integer id);

    void deleteAll(List<Integer> ids);

    @Insert("insert into user (name) values (#{name})")
    @SelectKey(before = false, keyProperty="id",resultType = Integer.class, statement = "SELECT LAST_INSERT_ID()")
    void insertUser(User user);

    @Update("update user set name = #{name} where id = #{id}")
    void updateUser(User user);

    @SelectProvider(type = UserMapperSQL.class,method = "findUserByIdd")
    User findUserByIdd(Integer id);*/

    List<User> findUser();

    Integer addUser(User user);

    User findUserById(Integer id);

    void deleteUser(Integer id);

    void updateUser(User user);
}
