package com.example.sponsotask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements  BottomNavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    CollapsingToolbarLayout collapsingToolbarLayout;
    HomeFragment homeFragment=new HomeFragment();
    LiveClasses liveClasses=new LiveClasses();
    DownloadsFragment downloadsFragment=new DownloadsFragment();
    HelpFragment helpFragment=new HelpFragment();
    FragmentManager manager1 = getSupportFragmentManager();
    FragmentTransaction transaction1 = manager1.beginTransaction();





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

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        switch (menuItem.getItemId()) {
            case R.id.Home:
                getSupportActionBar().setTitle("Home");
                transaction.replace(R.id.container, homeFragment);


                break;

            case R.id.LiveClasses:
                getSupportActionBar().setTitle("Live Classes");

                transaction.replace(R.id.container, liveClasses);

                break;

            case R.id.Downloads:
                getSupportActionBar().setTitle("Downloads");

                transaction.replace(R.id.container, downloadsFragment);
                break;

            case R.id.Help:
                getSupportActionBar().setTitle("Help");

                transaction.replace(R.id.container,helpFragment);
                break;


        }
        transaction.commit();

        return true;
    }







}
