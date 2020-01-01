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

public class tour_danang_museum extends AppCompatActivity {

    private AdView mAdView;
    LinearLayout li1, li2, li3, li4, li5, li6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_danang_museum);

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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EB%8B%A4%EB%82%AD%EB%B0%95%EB%AC%BC%EA%B4%80(%E6%B2%B1%E7%81%A2%E5%AF%B6%E8%97%8F)/@16.0522618,108.2235659,14.09z/data=!4m8!1m2!2m1!1z64uk64KtIOuwleusvOq0gCA!3m4!1s0x3142183691882913:0xc9180a3982a9ef58!8m2!3d16.0763928!4d108.2216114?hl=ko-KR"));
                startActivity(intent);
            }
        });


    }
}
