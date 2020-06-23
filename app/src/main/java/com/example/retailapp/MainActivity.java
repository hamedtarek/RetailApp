package com.example.retailapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this code for full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        // link NavController(fragment) with BottomNavigation(list Botton)
        NavController navController = Navigation.findNavController(this,R.id.my_nav_host_fragment);
        BottomNavigationView bottomNav = findViewById(R.id.Bottom_Nav);
        NavigationUI.setupWithNavController(bottomNav , navController);

    }
}