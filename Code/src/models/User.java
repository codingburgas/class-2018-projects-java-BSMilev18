package models;

import java.util.ArrayList;
import java.util.List;

//User class: contains user information
public class User {
    private Long userId;
    private String username;
    private String password;
    private List<Project> plans;

    //Constructor
    public User(Long userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.plans = new ArrayList<>();
    }

    //Getters and Setters
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Project> getPlans() {
        return plans;
    }
    public void setPlans(List<Project> plans) {
        this.plans = plans;
    }
}
