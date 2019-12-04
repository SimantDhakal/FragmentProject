package com.simant.fragmentproject.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.simant.fragmentproject.R;

import java.util.Scanner;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment {

    View view;
    EditText editTextNumber;
    Button buttonAuto;
    Integer number, result, checkMor;
    TextView textViewAuto;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

        editTextNumber = view.findViewById(R.id.editAuto);
        buttonAuto = view.findViewById(R.id.btnAutomorphic);
        textViewAuto = view.findViewById(R.id.textAuto);

        buttonAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int N = Integer.parseInt(editTextNumber.getText().toString());
                System.out.println(isAutomorphic(N) ? "Automorphic" : "Not Automorphic");
            }
        });

        return view;
    }

    // Function to check Automorphic number
    static boolean isAutomorphic(int N)
    {
        // Store the square
        int sq = N * N;

        // Start Comparing digits
        while (N > 0) {
            // Return false, if any digit of N doesn't
            // match with its square's digits from last
            if (N % 10 != sq % 10)
                return false;

            // Reduce N and square
            N /= 10;
            sq /= 10;
        }

        return true;
    }

}
