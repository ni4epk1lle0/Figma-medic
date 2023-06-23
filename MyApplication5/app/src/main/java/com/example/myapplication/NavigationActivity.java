package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    AnalisFragment analisFragment = new AnalisFragment();
    BlankFragment blankFragment = new BlankFragment();
    HelpFragment helpFragment = new HelpFragment();
    ProfileFragment profileFragment = new ProfileFragment();



  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, analisFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Analiz:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, analisFragment).commit();
                        return true;
                    case R.id.Result:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment).commit();
                        return true;
                    case R.id.Help:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,  helpFragment).commit();
                        return true;
                    case R.id.Profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,  profileFragment).commit();
                        return true;
                }
                return false;
            }
        });


    }
}