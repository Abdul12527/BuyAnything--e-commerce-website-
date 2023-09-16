package org.example.menu.implimentations;

import org.example.configs.ApplicationContext;
import org.example.entitis.Cart;
import org.example.entitis.Product;
import org.example.menu.Menu;
import org.example.services.ProductManagementService;
import org.example.services.implimentations.DefaultProductManagementService;

import java.util.Scanner;

public class ProductCatalogMenu implements Menu {
    private static final String CHECKOUT_COMMAND = "checkout";
    private ApplicationContext context;
    private ProductManagementService productManagementService;

    {
        context = ApplicationContext.getInstance();
        productManagementService = DefaultProductManagementService.getInstance();
    }
    @Override
    public void start() {
        Menu menuToNavigate = null;
        while (true) {
            printMenuHeader();
            printProductsToConsole();

            String userInput = readUserInput();

            if (context.getLoggedUser() == null) {
                menuToNavigate = new MaimMenu();
                System.out.println("You are not logged in. Please, sign in or create new account");
                break;
            }

            if (userInput.equalsIgnoreCase(MaimMenu.MENU_COMMAND)) {
                menuToNavigate = new MaimMenu();
                break;
            }

            if (userInput.equalsIgnoreCase(CHECKOUT_COMMAND)) {
                Cart sessionCart = context.getCartSession();
                if (sessionCart == null || sessionCart.isEmpty()) {
                    System.out.println("Your cart is empty. Please, add product to cart first and then proceed with checkout");
                } else {
                    menuToNavigate = new CheckoutMenu();
                    break;
                }
            } else {
                Product productToAddToCart = fetchProduct(userInput);

                if (productToAddToCart == null) {
                    System.out.println("Please, enter product ID if you want to add product to cart. Or enter 'checkout' if you want to proceed with checkout. Or enter 'menu' if you want to navigate back to the main menu.");
                    continue;
                }

                processAddToCart(productToAddToCart);
            }
        }

        menuToNavigate.start();

    }

    private String readUserInput() {
        System.out.print("Product ID to add to cart or enter 'checkout' to proceed with checkout: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        return userInput;
    }
    private void processAddToCart(Product productToAddToCart){
        context.getCartSession().addProduct(productToAddToCart);
        System.out.printf("Product %s has been added to your cart. "
                + "If you want to add a new product - enter the product id. "
                + "If you want to proceed with checkout - enter word "
                + "'checkout' to console %n", productToAddToCart.getProductName());
    }

    private Product fetchProduct(String userInput){
        return productManagementService.getProductById(Integer.parseInt(userInput));
    }

    private void printProductsToConsole(){
        productManagementService.getProducts().stream().forEach(o-> System.out.println(o.getId()+":"+o.getProductName()));
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** PRODUCT CATALOG *****");
        System.out.println("Enter product id to add it to the cart or 'menu' if you want to navigate back to the main menu");
    }
}
