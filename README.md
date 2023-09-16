# Buyanything E-commerce Backend Application ![Java](https://img.shields.io/badge/Language-Java-green)

Buyanything E-commerce Backend Application, a Java-based system designed to fulfill basic e-commerce operations. Buyanything supports user registration, sign-in/sign-out, product catalog navigation, adding products to the cart, order submission, and user management.

## Table of Contents

1. [Introduction](#introduction)
2. [Menu Navigation](#menu-navigation)
3. [Sign Up](#sign-up)
4. [Sign In](#sign-in)
5. [Sign Out](#sign-out)
6. [Product Catalog](#product-catalog)
7. [Checkout](#checkout)
8. [My Orders](#my-orders)
9. [Settings](#settings)
10. [Customer List](#customer-list)

## Introduction

Buyanything is a Java-based e-commerce backend application that provides essential functionalities for an online shopping platform. It allows users to create accounts, browse products, add items to their cart, complete orders, manage their account settings, and view customer information.

## Menu Navigation

- **Main Menu**: Users are greeted with a main menu upon launching the application. It includes options such as Sign Up, Sign In/Sign Out, Product Catalog, My Orders, Settings, and Customer List.

- **Exit Program**: Users can exit the program by entering 'exit' in the console while in the main menu.

- **Incorrect Input Handling**: The application handles incorrect input by displaying an error message and returning to the main menu when users input any digit other than 1, 2, 3, 4, or 5.

## Sign Up

- Users can register for an account by selecting 'Sign Up' from the main menu. They are prompted to enter their first name, last name, password, and email.

- Successful registration results in a new user account being created, and users receive a 'New user is created' notification.

- Validation checks ensure that email addresses are unique and not empty. Users receive appropriate error messages for unsuccessful registration attempts.

## Sign In

- Users with registered accounts can sign in by selecting 'Sign In' from the main menu. They are asked to provide their email and password.

- Successful sign-in displays a welcome message with the user's name and changes the 'Sign In' label to 'Sign Out'.

- Unsuccessful sign-in displays an error message for invalid credentials.

## Sign Out

- Users can sign out by selecting 'Sign Out' from the main menu while logged in. A sign-out message is displayed, and the 'Sign Out' label changes to 'Sign In'.

## Product Catalog

- Users can browse the product catalog by selecting 'Product Catalog' from the main menu. A list of products is displayed.

- Users can return to the main menu by entering 'menu' in the console while in the Product Catalog.

- Products can be added to the cart by entering the product ID. Users receive feedback about the added product.

## Checkout

- Users can proceed to checkout by selecting 'checkout' in the Product Catalog menu. They are prompted to enter their credit card number.

- Successful checkout clears the cart and displays a confirmation message.

- Error handling includes checking for an empty cart, not being logged in, and validating credit card numbers.

## My Orders

- Users can view their order history by selecting 'My Orders' from the main menu, provided they are logged in.

- Error handling ensures that users must be logged in to view their order history and that they receive a message if they have no orders.

## Settings

- Users can change their password or email address by selecting 'Settings' from the main menu and following the prompts.

- Error handling ensures that users must be logged in to access these settings and provides clear options for changing passwords and emails.

## Customer List

- Users can view a list of customers, excluding their passwords, by selecting 'Customer List' from the main menu.

---

This README.md provides an overview of the Buyanything E-commerce Backend Application's features and functionality. For detailed technical information and code implementation, please refer to the application's source code.
