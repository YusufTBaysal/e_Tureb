package com.example.test;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoriler);


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