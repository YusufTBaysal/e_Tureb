package com.example.test;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemReselectedListener(this);

    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item){

        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.chatgpt:
                fragment = new ChatGptFragment();
                break;
            case R.id.maps:
                fragment = new MapsFragment();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }

    public void git1(View view){
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