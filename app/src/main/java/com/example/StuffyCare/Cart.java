package com.example.StuffyCare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.StuffyCare.adapter.RecyclerViewAdapterCart;
import com.example.StuffyCare.items.CartItem;

public class Cart extends AppCompatActivity {

    private TextView mTextView;
    public ArrayList<CartItem> ProductsList;
    private RecyclerView cartRecyclerView;
    private RecyclerViewAdapterCart mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
        addToCart(1);
        buildRecyclerView();

        Button placeOrder = findViewById(R.id.place_order);
        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Cart.this, SelectAddress.class);
                startActivity(intent);
            }
        });
    }

    public void addToCart(int n){
        ProductsList = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            CartItem products = new CartItem();
            products.setName("Dog healthy food , large, 15 Inch");
            ProductsList.add(products);
        }

    }

    public void buildRecyclerView() {

        cartRecyclerView = findViewById(R.id.recyclerView_cart);
        cartRecyclerView.setHasFixedSize(true);
        mLayoutManager =new LinearLayoutManager(getApplicationContext());
        mAdapter = new RecyclerViewAdapterCart(ProductsList);
        cartRecyclerView.setLayoutManager(mLayoutManager);
        cartRecyclerView.setAdapter(mAdapter);

    }

}
