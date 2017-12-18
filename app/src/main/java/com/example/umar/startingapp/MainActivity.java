package com.example.umar.startingapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnSignUp;
    int a=29;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    //ArrayList<User> users;
    List<User> users;
    private String MTAG="UOL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User(a++,"umar","1234","umar@gmail.com");
            users.add(user);
        }
        /*AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"production").
                allowMainThreadQueries().build();
        List<User> users;
        users =db.userDao().getUsers();*/

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
        btnSignUp = findViewById(R.id.btnSinUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(MTAG, "BUTTON PRESSED ");
                startActivity(new Intent(getApplicationContext(),AddUser.class));
            }
        });


    }
}
