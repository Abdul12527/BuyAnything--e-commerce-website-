package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.menu.Menu;
import org.example.services.OrderManagementService;
import org.example.services.implimentations.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {
    private ApplicationContext context;
    private OrderManagementService orderManagementService;
    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagementService.getInstance();
    }
    @Override
    public void start() {
        printMenuHeader();
        if(context.getLoggedUser()==null){
            System.out.println("Please, log in or create new account to see list of your orders");
            new MaimMenu().start();
            return;
        }
        System.out.println(orderManagementService.getOrdersByUserId(context.getLoggedUser().getId()));

    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** MY ORDERS *****");
    }
}
