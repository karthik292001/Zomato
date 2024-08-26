package com.example.zomato.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zomato.entities.Orders;

public interface  OrderRepository extends JpaRepository<Orders, Integer>{

    List<Orders> findAllByUserId(int id);
    
}
