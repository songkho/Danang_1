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

public class hoianfood extends AppCompatActivity {


    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoianfood);


        //-------------- START ---------------- 하단광고

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");


        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2821664824480291/2184494920");

        //--------------- END --------------- 하단광고



        ///////

        li5 = (LinearLayout) findViewById(R.id.libtn5);

        ///////





//        li5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://maps.app.goo.gl/whrAHJ1WWxEbbu2Q8"));
//
//                startActivity(intent);
//
//            }
//        });

        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/place/The+Hoianian-+wine+bar+%26+restaurant/@15.8784475,108.3299832,3a,75y,90t/data=!3m8!1e2!3m6!1sAF1QipOCMIhslbAVl2_nbE0bf_0fne9V4oAUHjSehF78!2e10!3e12!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipOCMIhslbAVl2_nbE0bf_0fne9V4oAUHjSehF78%3Dw360-h270-k-no!7i4608!8i3456!4m5!3m4!1s0x31420e7f26ba8671:0x750708ea6f535158!8m2!3d15.8784899!4d108.3299847?hl=ko"));

                startActivity(intent);

            }
        });




    }
}
