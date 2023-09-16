package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.menu.Menu;

public class SignOutMenu implements Menu {
    ApplicationContext context;

    {
        context=ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        context.setLoggedUser(null);

    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** Sign Out *****");
        System.out.println("Have a nice day! Look forward to welcoming back!");
    }
}
