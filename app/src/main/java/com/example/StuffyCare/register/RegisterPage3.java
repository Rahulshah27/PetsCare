package com.example.StuffyCare.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

import com.example.StuffyCare.R;

public class RegisterPage3 extends AppCompatActivity {

    Pinview pinview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page3);
        pinview = findViewById(R.id.myPinView);

        pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                Toast.makeText(getApplicationContext(), pinview.getValue(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goBackToRegister2(View view) {
        startActivity(new Intent(getApplicationContext(), RegisterPage2.class));
        finish();
    }

    public void goToRegisterPage4(View view) {
        startActivity(new Intent(getApplicationContext(), RegisterPage4.class));
        finish();
    }
}