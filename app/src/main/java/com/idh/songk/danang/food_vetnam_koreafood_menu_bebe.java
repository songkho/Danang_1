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

//import android.support.v7.app.AppCompatActivity;

public class food_vetnam_koreafood_menu_bebe extends AppCompatActivity {

    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu_korea_bebe);


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
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EB%B0%B0%EB%B2%A0%EC%8B%9D%EB%8B%B9/@16.0673253,108.238371,17z/data=!3m1!4b1!4m5!3m4!1s0x31421780d7093871:0x448b79bc691556e1!8m2!3d16.0673253!4d108.240565?hl=ko"));
                startActivity(intent);

            }
        });



        li6 = (LinearLayout) findViewById(R.id.libtn6);



        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/explore/tags/%EB%B2%A0%EB%B2%A0%EC%8B%9D%EB%8B%B9/?hl=ko\n"));
                startActivity(intent);

            }
        });





    }
}
