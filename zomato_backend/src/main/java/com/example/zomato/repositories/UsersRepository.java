package com.example.zomato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zomato.entities.Users;

public interface  UsersRepository extends JpaRepository<Users, Integer>{
    
}
