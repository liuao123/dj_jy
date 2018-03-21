package com.dj.springboot_mybatis.service;

import com.dj.springboot_mybatis.domain.Ordera;

import java.util.List;

public interface OrderaService {
    List<Ordera> findOrdera();

    void addOrder(Ordera ordera);

    void deleteOrder(Integer id);

    void updateOrder(Ordera ordera);
}
