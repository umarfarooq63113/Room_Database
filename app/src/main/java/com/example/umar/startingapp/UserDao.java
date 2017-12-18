package com.example.umar.startingapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by umar on 17/12/2017.
 */
@Dao
public interface UserDao {
@Query("SELECT * FROM user")
List<User> getUsers();
@Insert
    void insertAll(User ...users);
}
