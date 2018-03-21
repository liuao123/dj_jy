package com.dj.springboot_mybatis.mapper;

import com.dj.springboot_mybatis.domain.Ordera;

public class UserMapperSQL {
    public String findOrdera(){
        return "select * from ordera";
    }

    public String addOrder(Ordera ordera){
        return "insert into ordera (price) values (#{price})";
    }

    public String deleteOrder(Integer id){
        return "delete from ordera where id = " + id;
    }
    public String updateOrder(Ordera ordera){
        return "update ordera set price = #{price} where id = " + ordera.getId();
    }
}
