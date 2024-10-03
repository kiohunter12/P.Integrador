package com.example.msorder.service;


import com.example.msorder.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public List<Order> list();
    public Optional<Order> getById(Integer Id);
    public Order save(Order order);
    public Order update(Integer Id, Order order);
    public void delete(Integer Id);
}
