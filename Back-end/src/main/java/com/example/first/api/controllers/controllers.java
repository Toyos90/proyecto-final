package com.example.first.api.controllers;
import com.example.first.api.models.models;
import com.example.first.api.services.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
@CrossOrigin(origins = "*")
public class controllers {

    @Autowired
    services myCart;

    @GetMapping
    public List<models> getProduct(){

        return myCart.getProduct();
    }
}
