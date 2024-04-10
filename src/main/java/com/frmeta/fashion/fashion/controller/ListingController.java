package com.frmeta.fashion.fashion.controller;

import com.frmeta.fashion.fashion.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frmeta.fashion.fashion.model.Listing;
import java.util.List;

@RestController
public class ListingController {

    @Autowired
    private ListingService listingService;

    @RequestMapping("/")
    public ResponseEntity<String> getAllListing(){
        List<Listing> list = listingService.findAll();
        return ResponseEntity.ok(list.toString());
    }

    @RequestMapping("/test")
    public String test(){
        return new String("Hello world");
    }

    @RequestMapping("/create")
    public String create(){
        listingService.create(new Listing("hoho", "url", 12, 123123L, "besar", "baru lah"));
        return new String("harusnya sih created");
    }

    @RequestMapping("/save")
    public String save(){
        //TODO: Terima string json
        String jsonString = "lolol";
        // listingService.save(jsonString);
        return "congrats";
    }
}
