package com.example.umar.startingapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by umar on 17/12/2017.
 */

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<User> users;

    public UserAdapter(List<User>users) {
        this.users=users;
    }


    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position)   {

        holder.firstName.setText(users.get(position).getUserName());
        holder.password.setText(users.get(position).getPassword());
        holder.email.setText(users.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstName,password,email,userid;
        public ViewHolder(View itemView) {
            super(itemView);

            firstName = itemView.findViewById(R.id.firstName);
            password = itemView.findViewById(R.id.password);
            email = itemView.findViewById(R.id.email);

        }
    }
}
