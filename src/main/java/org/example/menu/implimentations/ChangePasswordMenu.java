package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.menu.Menu;

import java.util.Scanner;

public class ChangePasswordMenu implements Menu {
    ApplicationContext context;
    {
        context=ApplicationContext.getInstance();
    }
    @Override
    public void start() {
        printMenuHeader();
        Scanner sc=new Scanner(System.in);
        String userInput = sc.next();
        context.getLoggedUser().setPassword(userInput);
        System.out.println("Your password has been successfully changed");
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHANGE EMAIL *****");
        System.out.print("Enter new Password: ");

    }
}
