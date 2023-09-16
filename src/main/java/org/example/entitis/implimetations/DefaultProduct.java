package org.example.entitis.implimetations;

import org.example.entitis.Product;
import org.example.entitis.StandardCategories;

public class DefaultProduct implements Product {
    private Integer id;
    private String productName;
    private StandardCategories productCategory;
    private Double price;

    @Override
    public String getProductName() {
        return this.productName;
    }

    public DefaultProduct(Integer id, String productName, StandardCategories productCategory,Double price) {
        this.id = id;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price=price;
    }

    @Override
    public String toString() {
        return "DefaultProduct{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productCategory=" + productCategory +
                '}';
    }

    @Override
    public Integer getId() {
        return this.id;
    }
}
