package com.rosi.wishlist.controllers;

import com.rosi.wishlist.document.WishList;
import com.rosi.wishlist.services.WishListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public class WishListController {
    @Autowired
    WishListService service;


    @GetMapping(value="/wishList")
    public Flux<WishList> getWishLists(){
        return service.findAll();
    }

    @GetMapping(value="/wishList/{id}")
    public Mono<WishList> getWishListById(@PathVariable String id){
        return service.findById(id);
    }

    @PutMapping(value="/wishList/{id}")
    public Mono<WishList> putWishListById(@PathVariable String id){
        return service.findById(id);
    }

    @DeleteMapping(value="/wishList/{id}")
    public Mono<WishList> deleteWishListById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping(value="/wishList")
    public Mono<WishList> save(@RequestBody WishList wishList){
        return service.save(wishList);
    }
}
