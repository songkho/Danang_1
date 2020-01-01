package com.idh.songk.danang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    protected void onCreate(Bundle savedInstanceState){

        //BitmapDrawable bd = (BitmapDrawable)getResources().getDrawable(R.mipmap.lsp2);

        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }


}
