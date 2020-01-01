package com.idh.songk.danang;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

//import android.support.v7.app.AppCompatActivity;

public class food_vetnam_menu_walnam extends AppCompatActivity {

    private AdView mAdView;
    LinearLayout li1, li2, li3, li4, li5, li6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu_vetnam_walnam);


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


//
//        li5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.google.com/maps/place/%EC%9A%A9%EA%B5%90(%EC%9A%A9+%EB%8B%A4%EB%A6%AC)/@16.061146,108.224864,17z/data=!3m1!4b1!4m5!3m4!1s0x314219cd0b3b5c7f:0x4a4d8fb2a6169930!8m2!3d16.0611409!4d108.227058"));
//
//                startActivity(intent);
//
//            }
//        });



    }
}
