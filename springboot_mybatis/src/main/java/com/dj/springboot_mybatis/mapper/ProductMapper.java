package com.dj.springboot_mybatis.mapper;

import com.dj.springboot_mybatis.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProductMapper {

    @Select("select * from product")
    List<Product> findPro();

    @Insert("insert into product(product_id,product_name) values(#{productId},#{productName})")
    void addPro(Product product);

    @Delete("delete from product where product_id = #{id}")
    void deletePro(Integer id);

    @Update("update product set product_name = #{productName} where product_id = #{productId}")
    void updatePro(Product product);
}
