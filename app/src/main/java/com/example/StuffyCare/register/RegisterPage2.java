package com.example.StuffyCare.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.StuffyCare.R;

public class RegisterPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page2);
    }

    public void goBackToRegister1(View view) {
        startActivity(new Intent(RegisterPage2.this, RegisterPage1.class));
        finish();
    }

    public void goToRegisterPage3(View view) {
        startActivity(new Intent(RegisterPage2.this, RegisterPage3.class));
        finish();
    }
}