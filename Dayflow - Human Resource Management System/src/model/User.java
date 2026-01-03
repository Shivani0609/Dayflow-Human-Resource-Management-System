package model;

public class User {
    public String email;
    public String password;
    public String role; // ADMIN or EMPLOYEE

    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
