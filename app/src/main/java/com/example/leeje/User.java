package com.example.leeje.androidpresentsystem;

/**
 * Created by leeje on 2018-04-09.
 */

public class User {
    private String email,status;

    public User(){
    }
        public User(String email, String status){
            this.email=email;
            this.status=status;
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
