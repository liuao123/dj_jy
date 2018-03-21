package com.dj.springboot_mybatis.mapper;

import com.dj.springboot_mybatis.domain.Ordera;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface OrderMapper {

    @SelectProvider(type = UserMapperSQL.class,method = "findOrdera")
    List<Ordera> findOrdera();

    @InsertProvider(type = UserMapperSQL.class,method = "addOrder")
    void addOrder(Ordera ordera);

    @DeleteProvider(type = UserMapperSQL.class,method = "deleteOrder")
    void deleteOrder(Integer id);

    @UpdateProvider(type = UserMapperSQL.class,method = "updateOrder")
    void updateOrder(Ordera ordera);
}
