package org.example.entitis.implimetations;

import org.example.entitis.User;

public class DefaultUser implements User {
    private static int userCount=0;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer id;

    {
        id=userCount++;
    }

    public DefaultUser(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DefaultUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    void clearSate(){
        userCount=0;
    }
}
