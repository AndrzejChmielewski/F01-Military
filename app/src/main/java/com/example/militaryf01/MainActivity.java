// The package name for your current application
package com.example.militaryf01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

// *** FIX: The import for the R class must match your application's package name. ***
// This ensures that you can access your app's own resources, like layouts and IDs.
// I have changed it from "com.example.companionapp1.R" to "com.example.militaryf01.R".
import com.example.militaryf01.R;

public class MainActivity extends AppCompatActivity {

    // Constants for URLs and email make the code cleaner and easier to maintain.
    private static final String STORE_URL = "https://play.google.com/store/apps/dev?id=4887226526184134400";
    private static final String APP_URL = "https://play.google.com/store/apps/details?id=com.watchfacestudio.militaryf01";
    private static final String GUIDE_URL = "https://tinyurl.com/4p9rcmww";
    private static final String SUPPORT_EMAIL = "ArtistryTimeStudios@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This will now correctly find 'activity_main' in your project's resources.
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is linked from your XML layout (e.g., using android:onClick="openPlayStore").
     * It cleverly handles clicks from multiple buttons by checking the ID of the clicked view.
     * @param view The button or view that was clicked.
     */
    public void openPlayStore(View view) {
        // Use the view's ID to decide which URL to open.
        // If the rateButton is clicked, open the app's specific page. Otherwise, open the developer store page.
        String url = view.getId() == R.id.rateButton ? APP_URL : STORE_URL;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    /**
     * This method is called when the "Installation Guide" button is clicked.
     * It opens the specified URL in a web browser.
     * @param view The button or view that was clicked.
     */
    public void openInstallationGuide(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(GUIDE_URL));
        startActivity(intent);
    }

    /**
     * This method is called when the email link is clicked.
     * It opens an email client with the support email and subject pre-filled.
     * @param view The text view or button that was clicked.
     */
    public void sendEmail(View view) {
        // ACTION_SENDTO is the correct intent for sending an email to a specific recipient.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + SUPPORT_EMAIL)); // Use mailto: URI
        intent.putExtra(Intent.EXTRA_SUBJECT, "Support Request for Military F-01");

        // Good practice: Check if an app exists to handle the email intent before starting the activity.
        // This prevents the app from crashing if no email client is installed.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
