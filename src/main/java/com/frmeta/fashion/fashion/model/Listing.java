package com.frmeta.fashion.fashion.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="listing")
public class Listing {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    @Column(name="name", nullable = false)
    private String name;

    @Getter
    @Setter
    @Column(name="image_url", nullable = false)
    private String imageUrl;

    @Getter
    @Setter
    @Column(name="stock", nullable = false)
    private int stock;


    @Getter
    @Setter
    @Column(name="price", nullable = false)
    private Long price;


    @Getter
    @Setter
    @Column(name="size", nullable = false)
    private String size;


    @Getter
    @Setter
    @Column(name="condition", nullable = false)
    private String condition;
    public Listing(){

    }

    public Listing(String name, String imageUrl, int stock, Long price, String size, String condition){
        this.name = name;
        this.imageUrl = imageUrl;
        this.stock = stock;
        this.price = price;
        this.size = size;
        this.condition = condition;
    }

    @Override
    public String toString() {
        ObjectMapper om = new ObjectMapper();
        try {
            return om.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
