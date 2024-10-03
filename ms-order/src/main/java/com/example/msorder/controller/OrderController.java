package com.example.msorder.controller;


import com.example.msorder.entity.Order;
import com.example.msorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> List() {
        return ResponseEntity.ok(orderService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> getdById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(orderService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Order> save(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.save(order));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Order> update(@PathVariable (required = true) Integer id, @RequestBody Order order) {
        return ResponseEntity.ok(orderService.update(id, order));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Order>> delete(@PathVariable (required = true) Integer id) {
        orderService.delete(id);
        return ResponseEntity.ok(orderService.list());
    }
}
