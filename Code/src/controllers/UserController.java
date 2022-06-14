package controllers;
//First layer: basic data presentation

import services.UserService;

public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    public void ShowUsers(){
        String userInformation = userService.displayUsers();
    }
}
