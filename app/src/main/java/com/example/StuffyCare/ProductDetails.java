package com.example.StuffyCare;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

import com.example.StuffyCare.adapter.ViewPagerAdapter;
import com.example.StuffyCare.items.CartItem;

public class ProductDetails extends AppCompatActivity {
    public Boolean isLike =false;
    public Integer Qty= 1;
    public int n=3;

    private ArrayList<CartItem> ProductsList;

    private String[] imageUrls = new String[]{
            "https://stuffycare.com/wp-content/uploads/2020/06/61xFTcEHBEL._SL1000_.jpg",
            "https://stuffycare.com/wp-content/uploads/2020/06/91S7CaN0otL._SL1500_-500x500.jpg",
            "https://stuffycare.com/wp-content/uploads/2020/06/DogTreat002-500x500.jpg",
            "https://stuffycare.com/wp-content/uploads/2020/06/DogTreat003.jpg",

    };
    String[] qty= {"1", "2", "3","4", "5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);
        TextView originalPrice = (TextView) findViewById(R.id.original_price);
        originalPrice.setPaintFlags(originalPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


        //ViewPager Photos Slide Implementation
        slideImage();

        //RecyclerViewForCart

        //Like button implementation
        final ImageButton like = findViewById(R.id.like_button2);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isLike) {
                    like.setColorFilter(Color.LTGRAY);
                    isLike = false;
                }
                else {
                    like.setColorFilter(Color.RED);
                    isLike = true;
                    Toast.makeText(view.getContext(),"Added to Favourites",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Add to Cart

        Button addToCart = findViewById(R.id.addToCart);
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Cart cart =new Cart();
                cart.addToCart(n);
                Toast.makeText(ProductDetails.this, "Added to the Cart", Toast.LENGTH_SHORT).show();
                n++;
            }
        });


        //Cart button
        ImageButton cart = findViewById(R.id.cart_button);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ProductDetails.this, Cart.class);
                startActivity(intent);
            }
        });

        //Quantity Implementation
        final ElegantNumberButton button = (ElegantNumberButton) findViewById(R.id.qty_button);
        button.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = button.getNumber();
            }
        });



        //Description and Review Tab
        final Button desc= findViewById(R.id.description);
        final Button rev= findViewById(R.id.reviews);
        final TextView desc_view = findViewById(R.id.description_view);
        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rev.setBackgroundColor(getResources().getColor(R.color.grey_20));
                desc.setBackgroundColor(getResources().getColor(R.color.white));
                desc_view.setVisibility(View.VISIBLE);
            }
        });
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rev.setBackgroundColor(getResources().getColor(R.color.white));
                desc.setBackgroundColor(getResources().getColor(R.color.grey_20));
                desc_view.setVisibility(View.INVISIBLE);

            }
        });
    }




    public void slideImage(){
        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageUrls);
        viewPager.setAdapter(adapter);
        LinearLayout sliderDotspanel = findViewById(R.id.SliderDots);

        final int dotscount = adapter.getCount();
        final ImageView[] dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}