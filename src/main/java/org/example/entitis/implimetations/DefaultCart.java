package org.example.entitis.implimetations;

import org.example.entitis.Cart;
import org.example.entitis.Product;

import java.util.ArrayList;

public class DefaultCart implements Cart {
    ArrayList<Product> products;
    public DefaultCart(){
        products=new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return products.isEmpty();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void clear() {
        products=new ArrayList<>();
    }
}
