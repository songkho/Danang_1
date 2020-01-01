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

public class resort_goldenbay extends AppCompatActivity {


    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort_goldenbay);


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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EA%B3%A8%EB%93%A0%EB%B2%A0%EC%9D%B4+%EB%8B%A4%EB%82%AD+%ED%98%B8%ED%85%94/@16.0976548,108.2225925,17z/data=!3m1!4b1!4m8!3m7!1s0x3142180fe0af6541:0x7286a33cefda8ba!5m2!4m1!1i2!8m2!3d16.0976497!4d108.2247865?hl=ko"));

                startActivity(intent);

            }
        });

        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/tags/%EA%B3%A8%EB%93%A0%EB%B2%A0%EC%9D%B4%ED%98%B8%ED%85%94/?hl=ko"));

                startActivity(intent);

            }
        });





    }
}
