package com.example.StuffyCare.ui.settings;

import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.StuffyCare.Cart;
import com.example.StuffyCare.R;
import com.example.StuffyCare.register.LoginOrRegisterPage;
import com.example.StuffyCare.register.RegisterPage2;

public class Settings extends Fragment {

    private SettingsViewModel mViewModel;

    public static Settings newInstance() {
        return new Settings();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.settings_fragment, container, false);
        final ConstraintLayout btnLogout = root.findViewById(R.id.btnLogout);
        //final ImageButton btnCart = root.findViewById(R.id.btnCartSettingsFragmentScene);


        // On Click Btns
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });

//        btnCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                goToCart();
//            }
//        });
        return root;
    }

//    private void goToCart() {
//        startActivity(new Intent(getActivity(), Cart.class));
//    }

    private void logout() {

        Intent i1 = new Intent(getActivity(), LoginOrRegisterPage.class);
        startActivity(i1);

//        final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
//        alert.setTitle("Logout");
//        alert.setMessage("Are you sure you wish to logout?")
//                .setCancelable(false)
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                       // FirebaseAuth.getInstance().signOut();
//                        Intent i1 = new Intent(getActivity(), LoginOrRegisterPage.class);
//                        startActivity(i1);
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        //alert.setCancelable(true);
////                        Intent i2 = new Intent();
////                        i2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
////                        startActivity(i2);
//                    }
//                });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        // TODO: Use the ViewModel
    }

}