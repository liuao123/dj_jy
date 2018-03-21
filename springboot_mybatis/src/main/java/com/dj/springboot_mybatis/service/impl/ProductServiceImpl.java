package com.dj.springboot_mybatis.service.impl;

import com.dj.springboot_mybatis.domain.Product;
import com.dj.springboot_mybatis.mapper.ProductMapper;
import com.dj.springboot_mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findPro() {
        return productMapper.findPro();
    }

    @Override
    public void addPro(Product product) {
        productMapper.addPro(product);
    }

    @Override
    public void deletePro(Integer id) {
        productMapper.deletePro(id);
    }

    @Override
    public void updatePro(Product product) {
        productMapper.updatePro(product);
    }
}
