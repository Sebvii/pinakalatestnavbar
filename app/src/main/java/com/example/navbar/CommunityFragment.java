package com.example.navbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CommunityFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_fragment);

        // Profile Image Click
        ImageView profileImage = findViewById(R.id.profileImage);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommunityFragment.this, CommunityFood.class));
            }
        });

        // Masugid Click
        ImageView masugid = findViewById(R.id.masugidImage);
        masugid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommunityFragment.this, Masugid.class));
            }
        });

        // Wani Click
        ImageView wani = findViewById(R.id.wanniImage);
        wani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommunityFragment.this, Wani.class));
            }
        });

        // Playmaker Click
        ImageView playmaker = findViewById(R.id.playmakerImage);
        playmaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommunityFragment.this, PlayMaker.class));
            }
        });
    }
}
