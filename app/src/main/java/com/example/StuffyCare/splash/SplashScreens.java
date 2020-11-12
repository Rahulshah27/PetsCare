package com.example.StuffyCare.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.StuffyCare.R;
import com.example.StuffyCare.register.LoginOrRegisterPage;

public class SplashScreens extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topAnim, bottomAnim;
    ImageView splashImage1 ;
    TextView logo, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screens);

        // Animations
//        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
//        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        // hooks
//        splashImage1 = findViewById(R.id.ss_image);
//
//        logo = findViewById(R.id.text_logo);
//        slogan = findViewById(R.id.text_slogan);
//
//        splashImage1.setAnimation(topAnim);
//        logo.setAnimation(bottomAnim);
//        slogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreens.this, LoginOrRegisterPage.class);
                startActivity(intent);
            }
        }, SPLASH_SCREEN);
    }
}