package com.example.first.api.services;

import com.example.first.api.models.models;
import com.example.first.api.repositories.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class services {

    @Autowired
    repositories myCart;

    public List<models> getProduct() {
        return (List<models>) myCart.findAll();
    }
}
