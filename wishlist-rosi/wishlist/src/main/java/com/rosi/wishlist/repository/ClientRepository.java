package com.rosi.wishlist.repository;

import com.rosi.wishlist.document.Client;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, String>{
    
}
