package com.idh.songk.danang;

import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.idh.songk.danang.R;

public class playnight_club extends AppCompatActivity {

    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playnight_club);


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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EB%89%B4-%EC%98%A4%EB%A6%AC%EC%97%94%ED%83%88+%EB%82%98%EC%9D%B4%ED%8A%B8%ED%81%B4%EB%9F%BD/@16.0827123,108.2190295,17z/data=!3m1!4b1!4m5!3m4!1s0x3142183c3d7b9ebb:0x452c789484e558bb!8m2!3d16.0827072!4d108.2212235?hl=ko"));

                startActivity(intent);

            }
        });



        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/tags/newphuongdong/?hl=ko"));
                startActivity(intent);

            }
        });





    }
}
