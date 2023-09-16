package org.example.services.implimentations;

import org.example.entitis.User;
import org.example.services.UserManagementService;

import java.util.ArrayList;
import java.util.List;

public class DefaultUserManagementService implements UserManagementService {
    private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already used by another user. Please, use another email";
    private static final String EMPTY_EMAIL_ERROR_MESSAGE = "You have to input email to register. Please, try one more time";
    private static final String NO_ERROR_MESSAGE = "";
    private static DefaultUserManagementService instance;
    private List<User> users=new ArrayList<>();


    @Override
    public String registerUser(User user) {
        if(user==null)return NO_ERROR_MESSAGE;
        String error=checkUniqueEmail(user.getEmail());
        if(error!=null&&!error.isEmpty())return error;
        users.add(user);
        return NO_ERROR_MESSAGE;
    }
    public static DefaultUserManagementService getInstance(){
        if(instance==null){
            instance=new DefaultUserManagementService();
        }
        return instance;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUserByEmail(String userEmail) {
        for(User user:users)if(user.getEmail().equals(userEmail))return user;
        return null;
    }

    private String checkUniqueEmail(String email){
        if(email==null||email.isEmpty())return EMPTY_EMAIL_ERROR_MESSAGE;
        for(User user:users)if(user.getEmail().equals(email))return NOT_UNIQUE_EMAIL_ERROR_MESSAGE;
        return NO_ERROR_MESSAGE;
    }
}
