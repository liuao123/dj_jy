package com.dj.springboot_mybatis.service;

import com.dj.springboot_mybatis.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> findPro();

    void addPro(Product product);

    void deletePro(Integer id);

    void updatePro(Product product);
}
