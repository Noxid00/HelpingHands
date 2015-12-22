package com.example.thisdoesnotexist.helpinghands;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class NeighborhoodAlliance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neighborhood_alliance);
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NeighborhoodAlliance.this, CharityList.class));
            }


        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NeighborhoodAlliance.this, CharityList.class));
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://Paypal.Me/SeanWatterson"));
                startActivity(browserIntent);
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NeighborhoodAlliance.this, ThanksForYourDonationPage.class));
            }
        });
    }
}

