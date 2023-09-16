package org.example;

import org.example.menu.Menu;
import org.example.menu.implimentations.MaimMenu;
import org.example.menu.implimentations.SignInMenu;
import org.example.menu.implimentations.SignUpMenu;

public class Main {
    public static final String EXIT_COMMAND = "exit";
    public static void main(String[] args) {

        Menu mainMenu = new MaimMenu();
        mainMenu.start();
    }
}