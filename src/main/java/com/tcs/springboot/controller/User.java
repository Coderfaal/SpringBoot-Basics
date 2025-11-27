package com.tcs.springboot.controller;

import jakarta.persistence.*;

@Entity
@Table(name = "normalpeople")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userId;
   private String userName;
    private String password;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
