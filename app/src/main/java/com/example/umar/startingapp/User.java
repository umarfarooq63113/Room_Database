package com.example.umar.startingapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by umar on 17/12/2017.

 */
@Entity

public class User {


    public User(int id,String userName, String password, String email) {
id=10;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    @PrimaryKey
    private int id;
    @ColumnInfo(name = "userName")
    private String userName;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "email")
    private String email;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
