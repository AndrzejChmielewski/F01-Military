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

        // Find the button by its ID
        Button storeButton = findViewById(R.id.storeButton);

        // Set a click listener for the button
        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of your store and create an Intent to open it
                String storeUrl = "YOUR_STORE_URL_HERE"; // Replace with your store URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(storeUrl));

                // Start the activity to open the store link
                startActivity(intent);
            }
        });
    }
}
