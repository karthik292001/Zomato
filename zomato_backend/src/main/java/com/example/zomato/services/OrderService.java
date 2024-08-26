package com.example.zomato.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zomato.entities.Orders;
import com.example.zomato.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository oRepo;

    public void addOrder(Orders order) {
        oRepo.save(order);
    }

    public List<Orders> readOrders(int id) {
        return oRepo.findAllByUserId(id);
    }

    public void updateStatus(int id) {
        Orders o=oRepo.findById(id).get();
        o.setStatus("delivered");
        oRepo.save(o);
    }

    public List<Orders> readAllOrders() {
        return oRepo.findAll();
    }
    
}
