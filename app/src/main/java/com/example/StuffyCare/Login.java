package com.example.StuffyCare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginWithGoogle(View view) {
    }


    public void loginButtonClick(View view) {
        startActivity(new Intent(Login.this, DrawerActivity.class));
        finish();
    }
}