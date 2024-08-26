package com.example.zomato.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zomato.entities.Orders;
import com.example.zomato.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService oSrv;


    @PostMapping("/add")
    public String addMenu(@RequestBody Orders order){
        System.out.println(order);
        oSrv.addOrder(order);
        return "order placed successfully";
    }
    
    @PostMapping("/getOrders")
    public List<Orders> readOrders(@RequestBody Map<String, Integer> requestBody){
        int id = requestBody.get("id");
        return oSrv.readOrders(id);
    }


    @GetMapping("/readOrders")
    public List<Orders> readAllOrders(){
        return oSrv.readAllOrders();
    }

    @PostMapping("/updateStatus")
    public String updateStatus(@RequestBody Map<String, Integer> requestBody){
        int id = requestBody.get("id");
        oSrv.updateStatus(id);
        return "Status updated successfully";
    }
}
