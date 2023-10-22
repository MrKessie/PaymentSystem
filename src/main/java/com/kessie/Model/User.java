package com.kessie.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class User {
    @Id
    private int userId;
    private String username;
    //private double balance;

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //public double getBalance() {
        //return balance;
    //}

    //public void setBalance(double balance) {
        //this.balance = balance;
    //}
}
