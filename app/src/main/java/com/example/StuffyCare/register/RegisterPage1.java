package com.example.StuffyCare.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.StuffyCare.R;

public class RegisterPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page1);
    }

    public void goToMobileNumber(View view) {
        Intent intent = new Intent();
        startActivity(new Intent(getApplicationContext(), RegisterPage2.class));
        finish();
    }
}