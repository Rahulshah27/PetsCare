package com.example.StuffyCare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.StuffyCare.Payments.CardPayment;
import com.example.StuffyCare.Payments.UPIPayment;



public class PaymentMethods extends AppCompatActivity {
    RadioGroup radioGroup ;
    RadioButton radioButton;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_methods);
        radioGroup = findViewById(R.id.radioGroup);
        Button payment_continue = findViewById(R.id.deliverToAddress);


        payment_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Continue();
            }
        });


    }

    public void  Continue(){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        if(radioButton.getId()==R.id.radioButtonCard) {
            Intent intent = new Intent(PaymentMethods.this, CardPayment.class);
            startActivity(intent);
        }if(radioButton.getId()==R.id.radioButtonUPI) {
            Intent intent = new Intent(PaymentMethods.this, UPIPayment.class);
            startActivity(intent);
        }if(radioButton.getId()==R.id.radioButtonCOD) {

        }
    }
}
