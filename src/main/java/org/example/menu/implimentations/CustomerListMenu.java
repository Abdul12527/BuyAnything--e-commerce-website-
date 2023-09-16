package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.menu.Menu;
import org.example.services.UserManagementService;
import org.example.services.implimentations.DefaultUserManagementService;

public class CustomerListMenu implements Menu {
    private ApplicationContext context;
    private UserManagementService userManagementService;
    {
        context = ApplicationContext.getInstance();
        userManagementService = DefaultUserManagementService.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        userManagementService.getUsers().forEach(System.out::println);
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** USERS *****");
    }
}
