package com.example.navbar;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RewardsFragment extends Fragment {

    public RewardsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_rewards_fragment, container, false);


        // First ImageView
        ImageView rewardImageFive = view.findViewById(R.id.rewardImagefive);
        rewardImageFive.setImageResource(R.drawable.five_ticktetr);
        rewardImageFive.setClickable(true);
        rewardImageFive.setOnClickListener(v -> {
            // Navigate to AnotherActivity
            Intent intent = new Intent(getActivity(), RewardFive.class);
            startActivity(intent);
        });

        // Second ImageView
        ImageView rewardImageTwo = view.findViewById(R.id.rewardImagetwo);
        rewardImageTwo.setImageResource(R.drawable.ten_ticketr);
        rewardImageTwo.setClickable(true);
        rewardImageTwo.setOnClickListener(v -> {
            // Navigate to AnotherActivity
            Intent intent = new Intent(getActivity(), RewardTwo.class);
            startActivity(intent);
        });

        // Third ImageView
        ImageView rewardImageThree = view.findViewById(R.id.rewardImagethree);
        rewardImageThree.setImageResource(R.drawable.five_ticketsr);
        rewardImageThree.setClickable(true);
        rewardImageThree.setOnClickListener(v -> {
            // Navigate to AnotherActivity
            Intent intent = new Intent(getActivity(), RewardThree.class);
            startActivity(intent);
        });

        return view;
    }
}
