package com.frmeta.fashion.fashion.model;

import jakarta.persistence.*;


@Entity
@Table(name="listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;
    @Column
    private int stock;
    private Long price;
    private String size;
    private String condition;

}
