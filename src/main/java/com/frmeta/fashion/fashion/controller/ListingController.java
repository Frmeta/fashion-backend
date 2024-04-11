package com.frmeta.fashion.fashion.controller;

import com.frmeta.fashion.fashion.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.frmeta.fashion.fashion.model.Listing;
import java.util.List;

@RestController
@RequestMapping(path = "/listing")
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping("/")
    public ResponseEntity<List<Listing>> getAllListing(){
        List<Listing> list = listingService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/create")
    public ResponseEntity<Listing> create(@RequestBody Listing listing){
        //listingService.create(new Listing("hoho", "url", 12, 123123L, "besar", "baru lah"));
        Listing l = listingService.create(listing);

        if (l == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else{
            return ResponseEntity.ok(listing);
        }


    }

    @PostMapping("/save")
    public ResponseEntity<Listing> save(@RequestBody Listing listing){
        listingService.save(listing);
        return ResponseEntity.ok(listing);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        listingService.delete(id);
        return ResponseEntity.ok("successfuly deleted");
    }
//    @PostMapping("/save")
//    public String save(@RequestBody Listing){
//        //TODO: Terima string json
//        String jsonString = "lolol";
//        // listingService.save(jsonString);
//        return "congrats";
//    }
}
