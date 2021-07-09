package com.rosi.wishlist.repository;

import com.rosi.wishlist.document.Product;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

    
}
