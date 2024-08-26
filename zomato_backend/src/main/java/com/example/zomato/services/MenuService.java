package com.example.zomato.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zomato.entities.Menu;
import com.example.zomato.repositories.MenuRepository;

@Service
public class MenuService {

    @Autowired
    MenuRepository mRepo;

    public void addMenu(Menu menu) {
        mRepo.save(menu);
    }

    public List<Menu> readAll(int id) {
        return mRepo.findAllByRestId(id);
    }
    
}
