package com.example.StuffyCare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void registerButtonClick(View view) {
    }

    public void goToSignIn(View view) {
        startActivity(new Intent(Register.this, Login.class));
        finish();
    }
}