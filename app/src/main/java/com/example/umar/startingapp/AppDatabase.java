package com.example.umar.startingapp;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by umar on 17/12/2017.
 */
@Database(entities = {User.class},version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
