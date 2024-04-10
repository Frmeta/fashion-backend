package com.frmeta.fashion.fashion.service;

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
}
