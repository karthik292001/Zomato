package com.example.zomato.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zomato.entities.Menu;

public interface  MenuRepository extends JpaRepository<Menu, Integer> {

    List<Menu> findAllByRestId(int id);
    
}
