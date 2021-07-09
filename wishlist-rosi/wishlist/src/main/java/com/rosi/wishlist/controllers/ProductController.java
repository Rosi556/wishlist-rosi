package com.rosi.wishlist.controllers;

import com.rosi.wishlist.services.ProductService;
import com.rosi.wishlist.document.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {
    @Autowired
    ProductService service;


    @GetMapping(value="/product")
    public Flux<Product> getProducts(){
        return service.findAll();
    }

    @GetMapping(value="/product/{id}")
    public Mono<Product> getProductById(@PathVariable String id){
        return service.findById(id);
    }

    @DeleteMapping(value="/product/delete/{id}")
    public Mono<Product> deleteProductById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping(value="/product")
    public Mono<Product> save(@RequestBody Product product){
        return service.save(product);
    }
}
