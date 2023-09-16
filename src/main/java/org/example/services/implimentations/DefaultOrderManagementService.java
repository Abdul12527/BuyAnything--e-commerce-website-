package org.example.services.implimentations;

import org.example.entitis.Order;
import org.example.services.OrderManagementService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultOrderManagementService implements OrderManagementService {
    private static DefaultOrderManagementService instance;
    List<Order> orders=new ArrayList<>();
    @Override
    public void addOrder(Order order) {
        if(order==null)return;
        orders.add(order);

    }

    @Override
    public List<Order> getOrdersByUserId(int userId) {
        return orders.stream().filter(o->o.getCustomerId().equals(userId)).collect(Collectors.toList());
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    void clearServiceState() {
        orders = new ArrayList<>();
    }
    public static OrderManagementService getInstance() {
        if (instance == null) {
            instance = new DefaultOrderManagementService();
        }
        return instance;
    }
}
