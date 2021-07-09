package com.rosi.wishlist.services;

import com.rosi.wishlist.document.WishList;
import com.rosi.wishlist.repository.WishListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WishListServiceImpl implements WishListService{

    @Autowired
    WishListRepository pr;

    @Override
    public Flux<WishList> findAll() {
        return pr.findAll();
    }

    @Override
    public Mono<WishList> findById(String id) {
        return pr.findById(id);
    }

    @Override
    public Mono<WishList> save(WishList wishList) {
        return pr.save(wishList);
    }
}
