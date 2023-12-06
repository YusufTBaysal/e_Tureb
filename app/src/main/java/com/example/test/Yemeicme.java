package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Yemeicme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemeicme);
    }

    public void komagene(View view) {
        Intent intent = new Intent(this, Komagene.class);
        startActivity(intent);
    }

    public void sokMarket(View view) {
        Intent intent = new Intent(this, SokMarket.class);
        startActivity(intent);
    }
}