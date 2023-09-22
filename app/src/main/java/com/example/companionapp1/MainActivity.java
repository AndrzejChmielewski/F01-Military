package com.example.companionapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                String guideUrl = "https://your-installation-guide-url.com"; // Replace with your installation guide URL
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
                String storeUrl = "https://docs.google.com/document/d/e/2PACX-1vQZheo56qNTpMBpS3zoCIuq3EhaZRPM2Y0JXf2OqJD8YqYt1kZk8bArWVtSW0qumt6b57zShJUxwu9a/pub"; // Replace with your store URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(storeUrl));

                // Start the activity to open the store link
                startActivity(intent);
            }
        });
    }
}
