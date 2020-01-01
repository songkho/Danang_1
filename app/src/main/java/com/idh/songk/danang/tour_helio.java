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

public class tour_helio extends AppCompatActivity {

            private AdView mAdView;//
        LinearLayout li1, li2, li3, li4, li5, li6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_helio);



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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%ED%97%AC%EB%A6%AC%EC%98%A4+%EB%A0%88%ED%81%AC%EB%A6%AC%EC%97%90%EC%9D%B4%EC%85%98+(%EC%95%BC%EC%8B%9C%EC%9E%A5)/@16.0373606,108.222533,17z/data=!4m8!1m2!2m1!1z64uk64KtIO2XrOumrOyYpCDsi5zti7A!3m4!1s0x0:0xb2f5c4a784d34c60!8m2!3d16.0371567!4d108.2246312?hl=ko-KR"));
                startActivity(intent);
            }
        });


    }
}
