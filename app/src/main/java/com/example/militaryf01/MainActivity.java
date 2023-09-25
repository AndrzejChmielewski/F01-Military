package com.example.militaryf01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.companionapp1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the "Installation Guide" button by its ID
        Button guideButton = findViewById(R.id.guideButton);

        // Set a click listener for the "Installation Guide" button
        guideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of your installation guide and create an Intent to open it
                String guideUrl = "https://tinyurl.com/4p9rcmww"; // Replace with your installation guide URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(guideUrl));

                // Start the activity to open the installation guide link
                startActivity(intent);
            }
        });

        // Find the "Install Now" button by its ID
        Button storeButton = findViewById(R.id.storeButton);

        // Set a click listener for the "Install Now" button
        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of your store and create an Intent to open it
                String storeUrl = "https://play.google.com/store/apps/dev?id=4887226526184134400"; // Replace with your store URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(storeUrl));

                // Start the activity to open the store link
                startActivity(intent);
            }
        });

        // Find the "Rate App" button by its ID
        Button rateButton = findViewById(R.id.rateButton);

        // Set a click listener for the "Rate App" button
        rateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of your app on Google Play for rating
                String appUrl = "https://play.google.com/store/apps/details?id=com.watchfacestudio.militaryf01"; // Replace with your app's package name

                // Create an Intent to open the app's page on Google Play
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(appUrl));

                // Try to open the Google Play app; if not available, open the Play Store website
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.watchfacestudio.militaryf01"));
                    startActivity(intent);
                }
            }
        });
    }
}
