package com.example.zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zomato.entities.Users;
import com.example.zomato.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService uSrv;
    
    @PostMapping("/add")
    public String addUser(@RequestBody Users user){
        uSrv.addUser(user);
        return "Added successfully";
    }
}
