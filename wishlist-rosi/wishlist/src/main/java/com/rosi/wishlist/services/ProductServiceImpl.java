package com.rosi.wishlist.services;

import com.rosi.wishlist.document.Product;
import com.rosi.wishlist.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository pr;

    @Override
    public Flux<Product> findAll() {
        return pr.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        return pr.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return pr.save(product);
    }

    
}
