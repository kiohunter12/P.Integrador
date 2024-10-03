package com.example.msorder.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.msorder.entity.Order;
import com.example.msorder.repository.OrderRepository;
import com.example.msorder.service.OrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> list() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getById(Integer Id) {
        return Optional.empty();
    }

    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order update(Integer Id, Order order) {
        return null;
    }

    @Override
    public void delete(Integer Id) {

    }
}
