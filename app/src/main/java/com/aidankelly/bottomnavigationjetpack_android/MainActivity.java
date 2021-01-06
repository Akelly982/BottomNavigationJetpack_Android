package com.aidankelly.bottomnavigationjetpack_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bottomNavigationView is the component we used in activity main for the menu_bar.xml we created
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        //create navController
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        // connect up the bottom navigation to navCtrl
        NavigationUI.setupWithNavController(bottomNavigationView,navController);


    }
}