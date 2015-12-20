package com.example.thisdoesnotexist.helpinghands;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class DonationComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_complete);
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DonationComplete.this, Menu.class));
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://Paypal.Me/SeanWatterson/10.48"));
                startActivity(browserIntent);
            }
        });
    }

    }



