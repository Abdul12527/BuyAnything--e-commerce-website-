package org.example.entitis;

import java.util.ArrayList;

public interface Cart {
    boolean isEmpty();
    void addProduct(Product product);
    ArrayList<Product> getProducts();
    void clear();
}
