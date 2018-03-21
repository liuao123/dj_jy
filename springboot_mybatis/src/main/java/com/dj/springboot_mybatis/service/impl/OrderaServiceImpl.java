package com.dj.springboot_mybatis.service.impl;

import com.dj.springboot_mybatis.domain.Ordera;
import com.dj.springboot_mybatis.mapper.OrderMapper;
import com.dj.springboot_mybatis.service.OrderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderaServiceImpl implements OrderaService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Ordera> findOrdera() {
        return orderMapper.findOrdera();
    }

    @Override
    public void addOrder(Ordera ordera) {
        orderMapper.addOrder(ordera);
    }

    @Override
    public void deleteOrder(Integer id) {
        orderMapper.deleteOrder(id);
    }

    @Override
    public void updateOrder(Ordera ordera) {
        orderMapper.updateOrder(ordera);
    }
}
