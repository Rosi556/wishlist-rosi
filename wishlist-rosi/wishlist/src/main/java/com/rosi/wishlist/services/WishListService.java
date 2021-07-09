package com.rosi.wishlist.services;

import com.rosi.wishlist.document.WishList;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WishListService {
    Flux<WishList> findAll();

    Mono<WishList> findById(String id);

    Mono<WishList> save(WishList wishList);

    
}
