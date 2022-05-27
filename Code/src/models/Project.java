package models;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private Long planId;
    private String name;
    private String contents;
    private List<User> users;
    //Constructor
    public Project(Long planId, String name, String contents, List<User> users) {
        this.planId = planId;
        this.name = name;
        this.contents = contents;
        this.users = new ArrayList<>();
    }
    //Getters and Setters
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPlanId() {
        return planId;
    }
    public void setPlanId(Long planId) {
        this.planId = planId;
    }
}
