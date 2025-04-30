package utils;

import models.User;

import java.util.ArrayList;

public class userManager {
    private ArrayList<User> users;

    public userManager() {
        users = new ArrayList<>();
    }

    public void registerUser(String fullName, String username, String password) {
        User user = new User(fullName, username, password);
        users.add(user);
        System.out.println("User registered: " + user.getUsername());
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
