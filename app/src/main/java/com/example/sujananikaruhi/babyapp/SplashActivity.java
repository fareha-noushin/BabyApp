package com.example.sujananikaruhi.babyapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    int splashTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar bar=getSupportActionBar();
        bar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();




            }
        },splashTime);
    }
}

