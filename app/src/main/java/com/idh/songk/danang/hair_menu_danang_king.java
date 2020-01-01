package com.idh.songk.danang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.idh.songk.danang.R;

//import android.support.v7.app.AppCompatActivity;

public class hair_menu_danang_king extends AppCompatActivity {

    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_menu_danang_king);


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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EB%8B%A4%EB%82%AD+%ED%99%A9%EC%A0%9C%EC%9D%B4%EB%B0%9C+King+Barber+%E7%9A%87%E5%B8%9D%E7%90%86%E9%AB%AE%E5%BA%97/@16.0692331,108.2345652,17z/data=!4m8!1m2!2m1!1z7Zmp7KCc7J2067Cc7IaM!3m4!1s0x31421991bcf5e499:0xd3391306cc639e70!8m2!3d16.069575!4d108.235789?hl=ko "));

                startActivity(intent);

            }
        });



        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/tags/%ED%99%A9%EC%A0%9C%EC%9D%B4%EB%B0%9C%EC%86%8C/?hl=ko"));
                startActivity(intent);

            }
        });





    }
}
