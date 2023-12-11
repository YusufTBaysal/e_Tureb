package com.example.test;

import android.content.Intent;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).addToBackStack(null).commit();
        }


    }
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        if (item.getItemId() == R.id.home) {
            fragment = new HomeFragment();
        } else if (item.getItemId() == R.id.chatgpt) {
            fragment = new ChatGptFragment();
        }
        else if (item.getItemId() == R.id.maps) {
               fragment = new MapsFragment();
    }

        boolean result = loadFragment(fragment);
        Log.d("FragmentLoad", "Fragment Loaded: " + (fragment != null ? fragment.getClass().getSimpleName() : "null"));
        return result;
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commitAllowingStateLoss();
            return true;
        }
        return false;
    }




    public void git1(View view) {
        Intent intent = new Intent(this, Konaklama.class);
        startActivity(intent);
    }

    public void git2(View view) {
        Intent intent = new Intent(this, Yemeicme.class);
        startActivity(intent);
    }

    public void git3(View view) {
        Intent intent = new Intent(this, Gezi.class);
        startActivity(intent);
    }
}