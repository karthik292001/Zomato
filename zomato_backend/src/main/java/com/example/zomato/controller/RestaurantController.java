package com.example.zomato.controller;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zomato.entities.Restaurant;
import com.example.zomato.repositories.RestaurantRepository;
import com.example.zomato.services.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService rSrv;

    @Autowired
    RestaurantRepository rRepo;

    
    @PostMapping("/add")
    public String addUser(@RequestBody Restaurant resta){
        rSrv.addResta(resta);
        return "Restuarant added successfully";
    }

    @GetMapping("/read")
    public List<Restaurant> read(){
        return rSrv.readAll();
    }

    @PostMapping("/search")
    public List<Restaurant> searchRestaurants(@RequestBody Map<String, String> requestBody) {
        System.out.println("hi");
        String keyword=  requestBody.get("keyword");
        return rRepo.findByNameContainingIgnoreCase(keyword);
    }

    @GetMapping("/sort")
    public List<Restaurant> sortRestaurants(boolean descending) {
        List<Restaurant> allRestaurants = rRepo.findAll();
 
        Comparator<Restaurant> comparator = getComparator();
 
        if (descending) {
            comparator = comparator.reversed();
        }
 
        return allRestaurants.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
 
    private Comparator<Restaurant> getComparator() {
        return (p1, p2) -> Double.compare(p1.getDistance(), p2.getDistance());
    }


   


}
