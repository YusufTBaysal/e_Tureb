package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logoImageView = findViewById(R.id.logoImageView); // Logo için ImageView ID'si

        Animation fadeInOut = AnimationUtils.loadAnimation(this, R.anim.fade_in_out);
        logoImageView.startAnimation(fadeInOut);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Ana aktiviteye geçiş yapabilirsiniz
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000); // 2 saniye bekletme süresi
    }
}