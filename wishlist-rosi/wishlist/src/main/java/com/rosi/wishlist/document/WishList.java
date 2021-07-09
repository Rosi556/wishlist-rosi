package com.rosi.wishlist.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="wishlist")
public class WishList {
    @Id
    private String id;

    private String products;
    private String cliente;

    

    public WishList(String id, String products, String cliente) {
        this.id = id;
        this.products = products;
        this.cliente = cliente;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getProducts() {
        return products;
    }



    public void setProducts(String products) {
        this.products = products;
    }



    public String getCliente() {
        return cliente;
    }



    public void setCliente(String cliente) {
        this.cliente = cliente;
    }



    public boolean add_product(){
        
        return false;

    }
    

    
}
