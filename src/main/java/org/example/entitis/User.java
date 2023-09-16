package org.example.entitis;

public interface User {
    String getFirstName();
    String getLastName();
    String getEmail();
    String getPassword();
    Integer getId();

    void setEmail(String email);
    void setPassword(String password);

}
