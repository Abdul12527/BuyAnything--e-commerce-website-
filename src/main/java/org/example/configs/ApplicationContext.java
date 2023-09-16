package org.example.configs;

import org.example.entitis.Cart;
import org.example.entitis.User;
import org.example.entitis.implimetations.DefaultCart;
import org.example.menu.Menu;

public class ApplicationContext {
    private static ApplicationContext instance;
    private User loggedUser;
    private Menu mainMenu;
    private Cart cartSession;

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        if(this.cartSession!=null){
            this.cartSession.clear();
        }
        this.loggedUser = loggedUser;
    }

    public static ApplicationContext getInstance() {
        if(instance==null)instance=new ApplicationContext();
        return instance;
    }

    public Cart getCartSession() {
        if(this.cartSession==null)this.cartSession=new DefaultCart();
        return cartSession;
    }

    public Menu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }
}
