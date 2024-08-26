package com.example.zomato.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zomato.entities.Users;
import com.example.zomato.repositories.UsersRepository;

@Service
public class UserService {
    @Autowired
    UsersRepository uRepo;

    public void addUser(Users user) {
        uRepo.save(user);
    }


    
}
