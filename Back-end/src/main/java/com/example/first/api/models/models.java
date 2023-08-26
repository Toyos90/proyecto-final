package com.example.first.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@Entity
@Table(name="myCart")
@NoArgsConstructor
@AllArgsConstructor
public class models {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name= "product")
    private String product;
    @Column (name= "price")
    private Float price;
}
