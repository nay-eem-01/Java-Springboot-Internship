package org.example.OOP.Problem10;

public class User {

    private String email;
    private String password;
    private String role;

    public User(String email, String password, String role) {

        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("Email can't be null nor empty");
        }
        if (!email.contains("@")){
            throw  new IllegalArgumentException("Invalid email ID");
        }
        if (password == null || password.isBlank()){
            throw new IllegalArgumentException("Passwords can't be null nor empty");
        }
        if (!(role.equals("user") || role.equals("admin"))){
            throw new IllegalArgumentException("Invalid roles");
        }

        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
