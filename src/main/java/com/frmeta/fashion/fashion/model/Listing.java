package com.frmeta.fashion.fashion.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="listing")
@Getter
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Column(name="name", nullable = false)
    private String name;

    @Setter
    @Column(name="image_url", nullable = false)
    private String imageUrl;

    @Setter
    @Column(name="stock", nullable = false)
    private int stock;


    @Setter
    @Column(name="price", nullable = false)
    private Long price;

    @Setter
    @Column(name="size", nullable = false)
    private String size;


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
