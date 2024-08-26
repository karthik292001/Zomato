package com.example.zomato.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int menuId;
    private String totalprice;
    private int quantity;
    private int userId;
    private String status="order placed";

    
}
