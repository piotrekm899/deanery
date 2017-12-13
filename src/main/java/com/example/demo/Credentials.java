package com.example.demo;

import com.example.validation.Username;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Credentials {

    public Credentials() {
    }


    @Username
    @NotNull(message = "this field is required")
    private String username;

    @NotNull (message = "this field is required")
    private String password;

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
}
