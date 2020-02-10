package com.idh.songk.danang;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //RewardedVideoAd mRewardedVideoAd;

    // 2.10데스크탑

    private AdView mAdView;

    private InterstitialAd mInterstitialAd;


    TextView tv1, adtext1;
    LinearLayout li1, li2, li3, li4, li5, li6, li7, li8, li9, li10, shareb, write,
            weatherbtn1, weatherbtn2, weatherbtn3, weatherbtn4, playnight_btn, libtn_resort, libtn_hair, libtn_sctoor, libtn_massage, libtn_tatoo, libtn_korea;

    EditText vetnamnoney, koreamoneytext;

    String changemoney;

    int result;
    int i = 0;


    int changeValue;

    String v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vetnamnoney = findViewById(R.id.vetnammoneytext);
        koreamoneytext = findViewById(R.id.koreamoneytext);
        koreamoneytext.setInputType(EditorInfo.TYPE_NULL); // setCursorVisible(false);


        vetnamnoney.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


//                CharSequence s : 현재 에디트텍스트에 입력된 문자열을 담고 있다.//
//                int start : s 에 저장된 문자열 내에 새로 추가될 문자열의 위치값을 담고있다.//
//                int count : s 에 담긴 문자열 가운데 새로 사용자가 입력할 문자열에 의해 변경될 문자열의 수가 담겨있다.
////              int after : 새로 추가될 문자열의 수

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

//                CharSequence s : 사용자가 새로 입력한 문자열을 포함한 에디트텍스트의 문자열이 들어있음
//                int start : 새로 추가된 문자열의 시작 위치의 값
//                int before : 새 문자열 대신 삭제된 기존 문자열의 수가 들어 있다
//                int count : 새로 추가된 문자열의 수가 들어있다.

                try {

//                    DecimalFormat sosu1 = new DecimalFormat("###,###.##");

                    double changeValue = Double.parseDouble(vetnamnoney.getText().toString()) / 20;
                    DecimalFormat sosu2 = new DecimalFormat("###,###.## 원");
                    koreamoneytext.setText(sosu2.format(changeValue));

                    if (vetnamnoney == null) {
                        koreamoneytext.setText("0원");
                    }

                } catch (NumberFormatException e) {

//
                }


//                if (!s.toString().equals("")){
//
//                    vetnamnoney.setText("");
//                    koreamoneytext.setText("");
//
//
//                }


            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });


        ////페이스북 광고/////


        ////페이스북 광고/////


        //////////////---------네트워크 연결 확인 ----------/////////////////

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        if (cm.getActiveNetworkInfo() != null) {
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            switch (activeNetwork.getType()) {
                case ConnectivityManager.TYPE_WIMAX:
                    //Log.d("Test","Wibro 네트워크연결");

                    break;
                case ConnectivityManager.TYPE_WIFI:
                    //Log.d("Test","WiFi 네트워크연결");

                    break;
                case ConnectivityManager.TYPE_MOBILE:
                    //Log.d("Test","3G 네트워크연결");

                    break;
            }
        } else {
            Log.d("Test", "네트워크연결 안됨");
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("인터넷 연결 에러(Data connection request)");
            alertDialog.setMessage("인터넷 연결을 다시 확인해주세요! \n연결 후 다시 만나요 :) \n\n" +
                    "Data connection request");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            });
            alertDialog.show();
        }


        //////////////---------네트워크 연결 ----------/////////////////


////-------------------------------------------------------------------

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");


        //-------------- START ---------------- 실제전면광고


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2821664824480291/5604865181");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());    // 1. 광고 로드

        //--------------- END --------------- 실제전면광고

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("asd", "The interstitial wasn't loaded yet.");
                }
            }
        });


        //-------------- START ---------------- 하단광고

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2821664824480291/2184494920");

        //--------------- END --------------- 하단광고


        tv1 = (TextView) findViewById(R.id.tv1);
        adtext1 = (TextView) findViewById(R.id.adtext); // 리워드 광고
        li1 = (LinearLayout) findViewById(R.id.libtn1);
        li2 = (LinearLayout) findViewById(R.id.libtn2); //공항 - > 야간 공항 도착 행동 오령
        li3 = (LinearLayout) findViewById(R.id.libtn3);
        li4 = (LinearLayout) findViewById(R.id.libtn4);
        li5 = (LinearLayout) findViewById(R.id.libtn5);
        li6 = (LinearLayout) findViewById(R.id.libtn6); // 그랩
        li7 = (LinearLayout) findViewById(R.id.libtn7); // 관광지 메뉴로

        li8 = (LinearLayout) findViewById(R.id.libtn8); // 관광지 메뉴로
        li9 = (LinearLayout) findViewById(R.id.libtn9); // 관광지 메뉴로
        li10 = (LinearLayout) findViewById(R.id.libtn10); // 관광지 메뉴로
//        li8 = (LinearLayout) findViewById(R.id.libtn8); // 관광지 메뉴로


        weatherbtn1 = (LinearLayout) findViewById(R.id.weatherbtn1); // 관광지 메뉴로
        weatherbtn2 = (LinearLayout) findViewById(R.id.weatherbtn2); // 관광지 메뉴로
        weatherbtn3 = (LinearLayout) findViewById(R.id.weatherbtn3); // 관광지 메뉴로
        weatherbtn4 = (LinearLayout) findViewById(R.id.weatherbtn4); // 관광지 메뉴로


        playnight_btn = (LinearLayout) findViewById(R.id.libtn_night);
        libtn_resort = (LinearLayout) findViewById(R.id.libtn_resort);
        libtn_hair = (LinearLayout) findViewById(R.id.libnt_hair);
        libtn_tatoo = (LinearLayout) findViewById(R.id.libnt_tatto);
        libtn_massage = (LinearLayout) findViewById(R.id.libtn_masage);
        libtn_sctoor = (LinearLayout) findViewById(R.id.libnt_scooter);
        libtn_korea = (LinearLayout) findViewById(R.id.libtn_food_korea); // 한국음식


        //------------------------------------------- 날씨 링크 --------------------------------------------------------------//

        weatherbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/search?q=bana+hill+weather&oq=banahill+w&aqs=chrome.1.69i57j0l5.5915j0j7&sourceid=chrome&ie=UTF-8"));
                startActivity(intent);
            }
        });

        weatherbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/search?ei=YFBJXavAIoz90gSzir-oDQ&q=hoi+an+weather&oq=hoi+weather&gs_l=psy-ab.3.0.0i7i30i19l10.17435.18591..19771...0.0..0.180.426.0j3......0....1..gws-wiz.......0i7i30j0i13.gweiFEK8gOw"));
                startActivity(intent);
            }
        });

        weatherbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/search?ei=dVBJXZjcMIv_0gSzhYGYCw&q=danang+weather&oq=da+weather&gs_l=psy-ab.3.0.0i7i30i19l10.17136.17729..18808...0.0..0.114.228.0j2......0....1..gws-wiz.......0i7i30.WP_2xElSQzE"));
                startActivity(intent);
            }
        });

        weatherbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/search?ei=iVBJXbHpMJyWr7wPkPWc2Ak&q=seoul+weather&oq=se+weather&gs_l=psy-ab.3.0.0i7i30i19l10.7132.11921..12939...5.0..0.126.588.0j5......0....1..gws-wiz.......0i71j0i67j0i10j0j0i131i67.CA3LUmretXY"));
                startActivity(intent);
            }
        });

        //------------------------------------------- 날씨 링크 끝 --------------------------------------------------------------//


//        //------------------------------------------- 앱 리뷰 링크 --------------------------------------------------------------//


        write = (LinearLayout) findViewById(R.id.write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.idh.songk.danang&hl=ko&showAllReviews=true"));
                startActivity(intent);
            }
        });

        //        //------------------------------------------- 앱 리뷰 링크 --------------------------------------------------------------//


        //------------------------------------------- 앱 공유 링크 --------------------------------------------------------------//
        shareb = (LinearLayout) findViewById(R.id.shareb);
        shareb.setOnClickListener(this);
        //------------------------------------------- 앱 공유 링크 --------------------------------------------------------------//

        //------------------------------------------- 야간 공항 링크 --------------------------------------------------------------//


//       li2.setOnClickListener(new Button.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Intent intent = new Intent(getApplicationContext(), nightair.class);
//               startActivity(intent);
//
//           }
//       });


        li2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nightair.class);
                startActivity(intent);

            }
        });


        li6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, foodeat.class);
                startActivity(intent);

            }
        });


        li7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tour_menu.class);
                startActivity(intent);

            }
        });


        playnight_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playnight_menu.class);
                startActivity(intent);

            }
        });

        libtn_resort.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, resort_menu.class);
                startActivity(intent);

            }
        });


        libtn_tatoo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tatoo_menu_danang.class);
                startActivity(intent);

            }
        });
//
        libtn_massage.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, massage_menu_danang.class);
                startActivity(intent);

            }
        });
//
//        libtn_sctoor.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, sctoor_menu_danang.class);
//                startActivity(intent);
//
//            }
//        });

        libtn_hair.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hair_menu_danang.class);
                startActivity(intent);

            }
        });

        libtn_korea.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, food_vetnam_koreafood_menu.class);
                startActivity(intent);

            }
        });


        //------------------------------------------- 야간 공항 링크 --------------------------------------------------------------//


        //------------------------------------------- 버튼 링크 --------------------------------------------------------------//

        li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://translate.google.co.kr/?um=1&ie=UTF-8&hl=ko&client=tw-ob#ko/vi/"));
                startActivity(intent);

            }
        });


//        li1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.google.co.kr/search?ei=J765W9-wA4zb8QW4rJaQBg&q=%EA%B5%AC%EA%B8%80%EB%B2%88%EC%97%AD+%ED%95%9C%EA%B5%AD%EC%96%B4+%EB%B2%A0%ED%8A%B8%EB%82%A8%EC%96%B4&oq=%EA%B5%AC%EA%B8%80%EB%B2%88%EC%97%AD+%ED%95%9C%EA%B5%AD%EC%96%B4+%EB%B2%A0%ED%8A%B8%EB%82%A8%EC%96%B4&gs_l=psy-ab.3...1312.1415.0.1578.2.2.0.0.0.0.0.0..0.0....0...1.1j4.64.psy-ab..2.0.0....0.On0gqERjrd0"));
//                startActivity(intent);
//
//            }
//        });
//        li2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://translate.google.co.kr/?um=1&ie=UTF-8&hl=ko&client=tw-ob#ko/vi/"));
//
//                startActivity(intent);
//
//            }
//        });
        li3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.kr/maps/search/%EB%8B%A4%EB%82%AD+%EC%9D%8C%EC%8B%9D/@16.0641343,108.2249926,14.23z"));

                startActivity(intent);

            }
        });
        li4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.kr/maps/search/%EB%8B%A4%EB%82%AD+%ED%98%B8%ED%85%94/@16.0653533,108.2063709,14z/data=!3m1!4b1"));

                startActivity(intent);

            }
        });
/////////////////--------부킹닷컴-------/////////////
//        li4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.booking.com/index.ko.html?label=gen173nr-1DCAEoggI46AdIM1gEaH2IAQGYARe4ARfIAQzYAQPoAQGIAgGoAgM;sid=c0f5077837441a16cf52bf2cc68e29ac;keep_landing=1&sb_price_type=total&"));
//
//                startActivity(intent);
//
//            }
//        });
//        ///////////////--------부킹닷컴-------/////////////

//        ///////////////--------아고다-------/////////////
//        li5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.agoda.com/ko-kr/?site_id=1430285&tag=911ebde7-5036-685e-58fa-9c8b7e2e4bdb&device=c&network=g&adid=94157074821&rand=2969963050515234043&expid=&adpos=1t1&url=http://www.agoda.com/ko-kr/index.html?site_id=1430285&tag=911ebde7-5036-685e-58fa-9c8b7e2e4bdb&gclid=Cj0KCQiAnY_jBRDdARIsAIEqpJ2jeJWnPKprRZ65Gx8errPehqhyQHdilErg6T8yke20s4nGVNJdbvYaAgBOEALw_wcB"));
//                startActivity(intent);
//
//            }
//        });
//        ///////////////--------아고다-------/////////////


        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.kr/maps/place/%EB%B2%A0%ED%8A%B8%EB%82%A8+%EB%8B%A4%EB%82%AD+H%E1%BA%A3i+Ch%C3%A2u,+%EB%8B%A4%EB%82%AD/@16.0471659,108.1716865,13z/data=!3m1!4b1!4m5!3m4!1s0x314219c792252a13:0xfc14e3a044436487!8m2!3d16.0544068!4d108.2021667"));
                startActivity(intent);

            }
        });
//        //--------------------------------------------------------------------------------------------------------------------//


        li8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/dir//%EB%B0%94%EB%82%98+%ED%9E%90+%EC%BC%80%EC%9D%B4%EB%B8%94%EC%B9%B4+%EB%A7%A4%ED%91%9C%EC%86%8C+Ho%C3%A0+Ninh,+H%C3%B2a+Vang,+%C4%90%C3%A0+N%E1%BA%B5ng+550000+%EB%B2%A0%ED%8A%B8%EB%82%A8/@16.0260833,108.0326399,18.14z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3141f60e12484c09:0x422b4d4670cc57d5!2m2!1d108.0336861!2d16.0264378?hl=ko"));
                startActivity(intent);

            }
        });

        li9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/dir//%EB%B2%A0%ED%8A%B8%EB%82%A8+%EA%BD%9D%EB%82%A8+%EC%84%B1+H%E1%BB%99i+An,+%ED%98%B8%EC%9D%B4%EC%95%88+%EA%B5%AC%EC%8B%9C%EA%B0%80%EC%A7%80/@15.8782117,108.2581748,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x31420e7ee98e523b:0x4d519e7e97da8424!2m2!1d108.3282151!2d15.878223?hl=ko"));
                startActivity(intent);

            }
        });

        li10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/dir//%EB%8B%A4%EB%82%AD%EA%B5%AD%EC%A0%9C%EA%B3%B5%ED%95%AD+%EB%B2%A0%ED%8A%B8%EB%82%A8+550000+%C4%90%C3%A0+N%E1%BA%B5ng,+H%E1%BA%A3i+Ch%C3%A2u/@16.0563319,108.1674479,15592m/data=!3m1!1e3!4m8!4m7!1m0!1m5!1m1!1s0x314219a273df52d1:0xb203f9fca295071a!2m2!1d108.2025533!2d16.0563348"));
                startActivity(intent);

            }
        });


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.shareb:

                Intent msg = new Intent(Intent.ACTION_SEND);
                msg.addCategory(Intent.CATEGORY_DEFAULT);
                msg.putExtra(Intent.EXTRA_SUBJECT, "다낭여행 https://play.google.com/store/apps/details?id=com.idh.songk.danang&hl=ko");
                msg.putExtra(Intent.EXTRA_TEXT, "");
                msg.putExtra(Intent.EXTRA_TITLE, "제목");
                msg.setType("text/plain");
                startActivity(Intent.createChooser(msg, "공유"));
                break;
        }

    }


}





