package org.example.entitis.implimetations;

import org.example.entitis.Order;
import org.example.entitis.Product;

import java.util.ArrayList;

public class DefaultOrder implements Order {
    private Integer customerId;
    private ArrayList<Product> products=new ArrayList<>();
    private String creditCardNumber;
    private int Number_of_digits_in_credit_card_number=12;

    @Override
    public Integer getCustomerId() {
        return this.customerId;
    }

    @Override
    public void setCustomerId(Integer customerId) {
        this.customerId=customerId;
    }

    @Override
    public void setProducts(ArrayList<Product> products) {
        this.products=products;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber=creditCardNumber;
    }

    @Override
    public boolean isCreditCardNumberValid(String creditCardNumber) {
        return creditCardNumber.length()==Number_of_digits_in_credit_card_number;
    }
}
