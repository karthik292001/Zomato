package com.example.zomato.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zomato.entities.Menu;
import com.example.zomato.services.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService mSrv;


    @PostMapping("/add")
    public String addMenu(@RequestBody Menu menu){
        mSrv.addMenu(menu);
        return "Menu added successfully";
    }

    @PostMapping("/read")
    public List<Menu> read(@RequestBody Map<String, Integer> requestBody){
        int id = requestBody.get("id");
        return mSrv.readAll(id);
    }
    
    
}
