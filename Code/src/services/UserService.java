package services;
import database.UserDatabase;
import models.User;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;

//Second layer: business layer
public class UserService {
    private UserDatabase userDatabase;
    public UserService(UserDatabase userDatabase){
        this.userDatabase = userDatabase;
    }
    public String displayUsers(){
        String users = userDatabase.ShowUsers();
        return users;
    }
}
