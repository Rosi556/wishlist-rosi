package com.rosi.wishlist.controllers;


import com.rosi.wishlist.document.Client;
import com.rosi.wishlist.services.ClientService;

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
public class ClientController {
    @Autowired
    ClientService service;


    @GetMapping(value="/client")
    public Flux<Client> getClients(){
        return service.findAll();
    }

    @GetMapping(value="/client/{id}")
    public Mono<Client> getClientById(@PathVariable String id){
        return service.findById(id);
    }

    @PutMapping(value="/client/{id}")
    public Mono<Client> putClientById(@PathVariable String id){
        return service.findById(id);
    }

    @DeleteMapping(value="/client/{id}")
    public Mono<Client> deleteClientById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping(value="/client")
    public Mono<Client> save(@RequestBody Client client){
        return service.save(client);
    }
    
}
