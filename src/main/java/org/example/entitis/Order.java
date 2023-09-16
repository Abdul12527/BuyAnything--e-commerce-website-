package org.example.entitis;

import java.util.ArrayList;

public interface Order {
    Integer getCustomerId();
    void setCustomerId(Integer customerId);
    void setProducts(ArrayList<Product> products);
    void setCreditCardNumber(String creditCardNumber);
    boolean isCreditCardNumberValid(String creditCardNumber);
}
