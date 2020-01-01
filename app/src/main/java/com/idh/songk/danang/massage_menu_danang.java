package com.idh.songk.danang;

import android.content.Intent;
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

//import android.support.v7.app.AppCompatActivity;

public class massage_menu_danang extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    LinearLayout li1, li2, li3, li4, li5, li6, li7,li8, li9, li10, shareb, write,  weatherbtn1, weatherbtn2, weatherbtn3, weatherbtn4, playnight_btn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage_menu_danang);





        li1 = (LinearLayout) findViewById(R.id.libtn1);
        li2 = (LinearLayout) findViewById(R.id.libtn2); //공항 - > 야간 공항 도착 행동 오령
        li3 = (LinearLayout) findViewById(R.id.libtn3);
        li4 = (LinearLayout) findViewById(R.id.libtn4);
        li5 = (LinearLayout) findViewById(R.id.libtn5);

        li6 = (LinearLayout) findViewById(R.id.libtn6);
        li7 = (LinearLayout) findViewById(R.id.libtn7);
        li8 = (LinearLayout) findViewById(R.id.libtn8);
        li9 = (LinearLayout) findViewById(R.id.libtn9);
        li10 = (LinearLayout) findViewById(R.id.libtn10);






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


              li1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_pink.class);
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
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_papaya.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });

        li3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_lotus.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });
        li4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_flower.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });
        li5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_saigon.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });
        li6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_bilad.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });
        li7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(massage_menu_danang.this, massage_menu_danang_vie.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });
//
//
//        li8.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(food_hoian_menu.this, resort_goldenbay.class);
//                startActivity(intent);
//
//                if (mInterstitialAd.isLoaded()) {
//                    mInterstitialAd.show();
//                } else {
//                    Log.d("TAG", "The interstitial wasn't loaded yet.");
//                }
//
//            }
//        });
//
//
//












    }
}
