package com.example.cse412project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import java.lang.*;

public class SecondFragment extends Fragment {
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*
        //create string for URL for the Java Database Connectivity API.
        //We assume the postgresql server is localhost, port is 5432, and database name is cse412project
        String jdbcURL = "jdbc:postgresql://10.0.2.2:5432/cse412project";
        //we need the username and password for the server
        String username = "postgres";
        String password = "XX";
        try{
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            Log.d("Connection established", "Connection established");
            connection.close();
        }
        catch (SQLException e){
            Log.d("ERROR", "ERROR! Could not connect");
            String s = e.getMessage();
            Log.e("APP", "exception", e);
        }
        */
        view.findViewById(R.id.button_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_UserProfileFragment_to_loginFragment);
            }
        });
        view.findViewById(R.id.button_user_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_UserProfileFragment_to_UserSearchFragment);
            }
        });
        view.findViewById(R.id.button_view_posts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_commentsList);
            }
        });
        view.findViewById(R.id.button_view_friends).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_friendsList);
            }
        });
        view.findViewById(R.id.button_make_post).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id. action_UserProfileFragment_to_newPostFragment);
            }
        });
    }


}