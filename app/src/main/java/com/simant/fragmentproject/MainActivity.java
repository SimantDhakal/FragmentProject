package com.simant.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.simant.fragmentproject.fragments.FirstFragment;
import com.simant.fragmentproject.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnFragmentL;
    private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmentL = findViewById(R.id.btnFragment);
        btnFragmentL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    FirstFragment firstFragment = new FirstFragment();
                    fragmentTransaction.replace(R.id.fragmentContainer, firstFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    btnFragmentL.setText("Load Second Fragment");
                    status = false;
                } else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.fragmentContainer, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    btnFragmentL.setText("Load First Fragment");
                    status = true;
                }
            }
        });
    }
}
