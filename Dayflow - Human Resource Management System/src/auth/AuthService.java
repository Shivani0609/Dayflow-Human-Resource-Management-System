package auth;

import model.User;
import java.util.HashMap;

public class AuthService {

    private static HashMap<String, User> users = new HashMap<>();

    static {
        // Admin user
        users.put(
            "admin@dayflow.com",
            new User("admin@dayflow.com", "admin123", "ADMIN")
        );

        // Employee user
        users.put(
            "emp@dayflow.com",
            new User("emp@dayflow.com", "emp123", "EMPLOYEE")
        );
    }

    public static User login(String email, String password) {
        if (users.containsKey(email)) {
            User user = users.get(email);
            if (user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }
}
