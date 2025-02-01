package com.example.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private EditText searchBar;
    private Button breakfastButton, lunchButton, snacksButton, dinnerButton;
    // Declare LinearLayouts for food items
    private LinearLayout fooditem1;
    private LinearLayout fooditem2;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);

        // Initialize views from the layout
        searchBar = view.findViewById(R.id.search_bar);
        breakfastButton = view.findViewById(R.id.breakfast_button);
        lunchButton = view.findViewById(R.id.lunch_button);
        snacksButton = view.findViewById(R.id.snacks_button);
        dinnerButton = view.findViewById(R.id.dinner_button);

        // Initialize the LinearLayouts for food items
        fooditem1 = view.findViewById(R.id.fooditem1);
        fooditem2 = view.findViewById(R.id.fooditem2);

        // Set up the search bar listener
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // No action needed here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // For now, display a toast as a placeholder for search functionality
                Toast.makeText(getContext(), "Searching: " + s.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
                // No action needed here
            }
        });

        // Set up button listeners for categories
        View.OnClickListener categoryClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button clickedButton = (Button) v;
                String category = clickedButton.getText().toString();
                Toast.makeText(getContext(), "Category Selected: " + category, Toast.LENGTH_SHORT).show();
            }
        };

        breakfastButton.setOnClickListener(categoryClickListener);
        lunchButton.setOnClickListener(categoryClickListener);
        snacksButton.setOnClickListener(categoryClickListener);
        dinnerButton.setOnClickListener(categoryClickListener);

        // Set click listeners for food items to navigate to NextActivity
        fooditem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FoodOne.class);
                startActivity(intent);
            }
        });

        fooditem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FoodTwo.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
