package com.frmeta.fashion.fashion.controller;

import com.frmeta.fashion.fashion.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frmeta.fashion.fashion.model.Listing;
import java.util.List;

@RestController
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping("/listing")
    public ResponseEntity<String> getAllListing(){
        List<Listing> list = listingService.findAll();
        return ResponseEntity.ok(list.toString());
    }
}
