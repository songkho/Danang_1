package com.idh.songk.danang;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class foodeat extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    private AdView mAdView;



    LinearLayout li1, li2, li3, li4, li5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);


        //-------------- START ---------------- 실제전면광고

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2821664824480291/5604865181");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        //--------------- END --------------- 실제전면광고


        //-------------- START ---------------- 하단광고

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2821664824480291/2184494920");

        //--------------- END --------------- 하단광고




        li1 = (LinearLayout) findViewById(R.id.libtn1);
        li2 = (LinearLayout) findViewById(R.id.libtn2);
        li3 = (LinearLayout) findViewById(R.id.libtn3);



        li1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(foodeat.this, food_vetnam_menu.class);
                startActivity(intent);

//                if (mInterstitialAd.isLoaded()) {
//                    mInterstitialAd.show();
//                } else {
//                    Log.d("TAG", "The interstitial wasn't loaded yet.");
//                }

            }
        });

        li2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(foodeat.this, food_danang_menu.class);
                startActivity(intent);

//                if (mInterstitialAd.isLoaded()) {
//                    mInterstitialAd.show();
//                } else {
//                    Log.d("TAG", "The interstitial wasn't loaded yet.");
//                }

            }
        });

        li3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(foodeat.this, food_hoian_menu.class);
                startActivity(intent);

//                if (mInterstitialAd.isLoaded()) {
//                    mInterstitialAd.show();
//                } else {
//                    Log.d("TAG", "The interstitial wasn't loaded yet.");
//                }

            }
        });



    }
}
