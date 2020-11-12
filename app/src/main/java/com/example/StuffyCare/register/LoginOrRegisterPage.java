package com.example.StuffyCare.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.StuffyCare.Login;
import com.example.StuffyCare.R;

public class LoginOrRegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register_page);
    }

    public void goToSignInPage(View view) {
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void goToregisterPage1(View view) {
        startActivity(new Intent(getApplicationContext(), RegisterPage1.class));
        finish();
    }
}