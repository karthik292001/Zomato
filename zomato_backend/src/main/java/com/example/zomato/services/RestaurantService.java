package com.example.zomato.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zomato.entities.Restaurant;
import com.example.zomato.repositories.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository rRepo;

    public void addResta(Restaurant resta) {
        rRepo.save(resta);
    }

    public List<Restaurant> readAll() {
        return rRepo.findAll();
    }
    
    
}
