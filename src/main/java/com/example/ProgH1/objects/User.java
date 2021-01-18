package com.example.ProgH1.objects;

public class User {

    private final int id;
    private final String password;

    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
