package com.idh.songk.danang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.idh.songk.danang.R;

public class resort_hoianpesta extends AppCompatActivity {


    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort_hoianpesta);


        //-------------- START ---------------- 하단광고

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2821664824480291/2184494920");

        //--------------- END --------------- 하단광고

        li5 = (LinearLayout) findViewById(R.id.libtn5);



        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/place/The+Pearl+Hoi+An,+a+Festa+Hotel+%26+Resort/@15.9186247,108.3281247,17z/data=!3m1!4b1!4m8!3m7!1s0x31420f5a7aa07023:0x9d4f811afc12820b!5m2!4m1!1i2!8m2!3d15.9186196!4d108.3303187?hl=ko"));

                startActivity(intent);

            }
        });



        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/locations/1046562272183086/the-pearl-hoi-an-a-festa-hotel-resort/?hl=ko"));

                startActivity(intent);

            }
        });





    }
}
