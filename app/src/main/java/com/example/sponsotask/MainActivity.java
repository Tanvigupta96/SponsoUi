package com.example.sponsotask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.widget.Toolbar;



import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    FrameLayout frameLayout;
    BottomNavigationMenu bottomNavigationView;
    CollapsingToolbarLayout collapsingToolbarLayout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        frameLayout = findViewById(R.id.container);
        bottomNavigationView = findViewById(R.id.bottom);
        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);
        getSupportActionBar().setTitle(" ");






    }
}
