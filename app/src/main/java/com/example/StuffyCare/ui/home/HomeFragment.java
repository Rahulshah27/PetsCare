package com.example.StuffyCare.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.StuffyCare.Cart;
import com.example.StuffyCare.R;
import com.example.StuffyCare.ShopNowHome;


public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);
       // final ImageButton btnHomeCart = root.findViewById(R.id.imgBtnCart);
        // final Button btnShopNow = root.findViewById(R.id.btn_home_shop_now);
        final ConstraintLayout l_lytShopNow = root.findViewById(R.id.l_lytHomeGoToShopNow);

        final TextView textView = root.findViewById(R.id.text_home);

//        btnHomeCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getActivity(), Cart.class);
//                startActivity(i);
//            }
//        });

        l_lytShopNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ShopNowHome.class);
                startActivity(i);
            }
        });

//        btnShopNow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               goToHomeToShopNow();
//            }
//        });
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }

//    public void goToCartFromHome() {
//        Intent i = new Intent(getActivity(), Cart.class);
//        startActivity(i);
//    }
}