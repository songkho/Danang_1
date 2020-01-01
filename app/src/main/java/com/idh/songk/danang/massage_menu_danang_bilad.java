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

public class massage_menu_danang_bilad extends AppCompatActivity {

    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage_menu_danang_bilad);


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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EB%B9%8C%EB%9D%BC%EB%93%9C%EC%8A%A4%ED%8C%8C+%EB%8B%A4%EB%82%AD/@16.0344241,108.2275754,17z/data=!3m1!4b1!4m12!1m6!2m5!1z7Iqk7YyM!5m3!5m2!4m1!1i2!3m4!1s0x0:0xbd7c3469b75abc65!8m2!3d16.0344196!4d108.2297704?hl=ko"));

                startActivity(intent);

            }
        });



        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/tags/%EB%B9%8C%EB%9D%BC%EB%93%9C%EC%8A%A4%ED%8C%8C/?hl=ko"));
                startActivity(intent);

            }
        });





    }
}
