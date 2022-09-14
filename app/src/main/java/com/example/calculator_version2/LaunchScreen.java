package com.example.calculator_version2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchScreen extends AppCompatActivity {
    private  static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().
        setContentView(R.layout.activity_launch_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN)
    }
}