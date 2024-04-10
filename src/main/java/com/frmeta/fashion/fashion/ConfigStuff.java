package com.example.springbootdemo.config;

import com.frmeta.fashion.fashion.model.Listing;
import com.frmeta.fashion.fashion.repository.ListingRepository;
import com.frmeta.fashion.fashion.service.ListingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class ConfigStuff {

//    @Bean
//    public ListingService dtwla() {
//        return new ListingService();
//    }
//
//    @Bean
//    public ListingRepository listingRepo() {
//
//        return new ListingRepository();
//    }
//
//    @Bean
//    public void entityManagerFactory
}