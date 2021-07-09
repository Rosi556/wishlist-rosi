package com.rosi.wishlist.repository;

import com.rosi.wishlist.document.WishList;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface WishListRepository extends ReactiveMongoRepository<WishList, String> {
    
}
