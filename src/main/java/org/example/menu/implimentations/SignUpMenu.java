package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.entitis.User;
import org.example.entitis.implimetations.DefaultUser;
import org.example.menu.Menu;
import org.example.services.UserManagementService;
import org.example.services.implimentations.DefaultUserManagementService;

import java.util.Scanner;

public class SignUpMenu implements Menu {
    private UserManagementService userManagementService;
    private ApplicationContext context;

    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = sc.next();
        System.out.print("Please, enter your last name: ");
        String lastName = sc.next();
        System.out.print("Please, enter your password: ");
        String password = sc.next();
        System.out.print("Please, enter your email: ");

        sc = new Scanner(System.in);
        String email = sc.nextLine();

        User user=new DefaultUser(firstName,lastName,email,password);
        String errorMessage = userManagementService.registerUser(user);
        if (errorMessage == null || errorMessage.isEmpty()) {
            context.setLoggedUser(user);
            System.out.println("New user is created");
        } else {
            System.out.println(errorMessage);
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** SIGN UP *****");
    }
}
