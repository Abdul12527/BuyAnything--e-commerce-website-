package org.example.services;

import org.example.entitis.Product;

import java.util.List;

public interface ProductManagementService {
    List<Product> getProducts();

    Product getProductById(Integer productIdToAddToCart);
}
