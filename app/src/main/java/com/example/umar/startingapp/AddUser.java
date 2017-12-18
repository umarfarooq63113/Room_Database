package com.example.umar.startingapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddUser extends AppCompatActivity {
Button addUser;
    int a = 19;
EditText username,password,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        final AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"production").
               allowMainThreadQueries().build();
        //List<User> users = db.userDao().getUsers();
        addUser = findViewById(R.id.saveUser);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);

        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a++;
                db.userDao().insertAll(new User(10,username.getText().toString(),password.getText().toString()
                        ,email.getText().toString()));
                startActivity(new Intent(AddUser.this,MainActivity.class));
            }
        });
    }
}
