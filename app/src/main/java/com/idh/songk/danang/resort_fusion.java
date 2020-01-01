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

public class resort_fusion extends AppCompatActivity {


    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort_fusion);


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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%ED%93%A8%EC%A0%84%EC%8A%A4%EC%9C%84%ED%8A%B8+%EB%8B%A4%EB%82%AD%EB%B9%84%EC%B9%98+%ED%98%B8%ED%85%94/@16.0811613,108.2448018,17z/data=!4m8!3m7!1s0x3142178da9720b99:0x79a511f54df7b9b1!5m2!4m1!1i2!8m2!3d16.0811562!4d108.2469958?hl=ko"));

                startActivity(intent);

            }
        });


        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/tags/%ED%93%A8%EC%A0%84%EC%8A%A4%EC%9C%84%ED%8A%B8%EB%8B%A4%EB%82%AD%EB%B9%84%EC%B9%98/?hl=ko"));

                startActivity(intent);

            }
        });





    }
}
