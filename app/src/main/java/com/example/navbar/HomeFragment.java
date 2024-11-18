package com.example.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);

        // Set an OnClickListener for the "Learn More" TextView
        TextView learnMoreTextView = view.findViewById(R.id.learn_more_button);
        learnMoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity when clicked
                Intent intent = new Intent(getActivity(), LearnMore.class); // Replace LearnMore.class with your target activity
                startActivity(intent);
            }
        });

        return view;
    }
}
