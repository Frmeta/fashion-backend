package com.frmeta.fashion.fashion.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frmeta.fashion.fashion.repository.ListingRepository;
import com.frmeta.fashion.fashion.model.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepository;

    public List<Listing> findAll(){
        return listingRepository.findAll();
    }

    public Listing create(Listing l){
        Listing newListing = new Listing(l.getName(), l.getImageUrl(), l.getStock(), l.getPrice(), l.getSize(), l.getCondition());
        return listingRepository.save(newListing);
    }

    public Listing save(String jsonString) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        Listing listing = om.readValue(jsonString, Listing.class);
        return listingRepository.save(listing);
    }
}
