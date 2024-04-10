package com.frmeta.fashion.fashion.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String imageUrl;

    @Getter
    @Setter
    @Column
    private int stock;


    @Getter
    @Setter
    private Long price;


    @Getter
    @Setter
    private String size;


    @Getter
    @Setter
    private String condition;

    public Listing(String name, String imageUrl, int stock, Long price, String size, String condition){
        this.name = name;
        this.imageUrl = imageUrl;
        this.stock = stock;
        this.price = price;
        this.size = size;
        this.condition = condition;
    }

}
