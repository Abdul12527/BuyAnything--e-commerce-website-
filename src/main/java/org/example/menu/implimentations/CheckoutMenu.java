package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.entitis.Order;
import org.example.entitis.implimetations.DefaultOrder;
import org.example.menu.Menu;
import org.example.services.OrderManagementService;
import org.example.services.implimentations.DefaultOrderManagementService;

import java.util.Scanner;

public class CheckoutMenu implements Menu {
    private ApplicationContext context;
    private OrderManagementService orderManagementService;

    {
        context=ApplicationContext.getInstance();
        orderManagementService= DefaultOrderManagementService.getInstance();
    }
    @Override
    public void start() {
        while (true) {
            printMenuHeader();
            Scanner sc = new Scanner(System.in);
            String userInput = sc.next();

            if (!createOrder(userInput)) {
                continue;
            }
            context.getCartSession().clear();
            break;
        }

        System.out.println("Thanks a lot for your purchase. Details about order delivery are sent to your email.");

    }
    private boolean createOrder(String creditCardNumber){
        Order order=new DefaultOrder();
        if (!order.isCreditCardNumberValid(creditCardNumber)) {
            return false;
        }
        order.setCreditCardNumber(creditCardNumber);
        order.setProducts(context.getCartSession().getProducts());
        order.setCustomerId(context.getLoggedUser().getId());
        return true;
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHECKOUT *****");
        System.out.print("Enter your credit card number without spaces and press enter if you confirm purchase: ");
    }
}
