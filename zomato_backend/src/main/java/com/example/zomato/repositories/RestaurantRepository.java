package com.example.zomato.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zomato.entities.Restaurant;

public interface  RestaurantRepository extends JpaRepository<com.example.zomato.entities.Restaurant, Integer>{

    List<Restaurant> findByNameContainingIgnoreCase(String keyword);
    
}
