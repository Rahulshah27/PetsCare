package com.example.StuffyCare.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.StuffyCare.DrawerActivity;
import com.example.StuffyCare.R;

public class RegisterPage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page4);
    }


    public void goToHomePageFromRegister4(View view) {
        startActivity(new Intent(getApplicationContext(), DrawerActivity.class));
        finish();
    }
}