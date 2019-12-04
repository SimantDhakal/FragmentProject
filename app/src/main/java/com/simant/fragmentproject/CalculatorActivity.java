package com.simant.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.simant.fragmentproject.fragments.CircleFragment;
import com.simant.fragmentproject.fragments.PalendromeFragment;
import com.simant.fragmentproject.fragments.ReverseFragment;
import com.simant.fragmentproject.fragments.SecondFragment;
import com.simant.fragmentproject.fragments.SumFragment;

public class CalculatorActivity extends AppCompatActivity {

    private Button buttonSum, buttonCircle, buttonReverse, buttonPalendrome;
    private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        buttonSum = findViewById(R.id.btnSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    SumFragment sumFragment = new SumFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = false;
                } else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = true;
                }
            }
        });

        buttonCircle = findViewById(R.id.btnCircle);
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    CircleFragment circleFragment = new CircleFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, circleFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = false;
                } else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = true;
                }
            }
        });

        buttonReverse = findViewById(R.id.btnReverse);
        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseFragment reverseFragment = new ReverseFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = false;
                } else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = true;
                }
            }
        });


        buttonPalendrome = findViewById(R.id.btnPalendrome);
        buttonPalendrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    PalendromeFragment palendromeFragment = new PalendromeFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, palendromeFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = false;
                } else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    status = true;
                }
            }
        });
    }
}
