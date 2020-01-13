package com.example.lenovo.sfarApp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.sfar.R;
import com.example.lenovo.sfarApp.viewpager.CustomPager;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences sp;
    SharedPreferences.Editor se;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sp=getSharedPreferences("logininfo",MODE_PRIVATE);
        se=sp.edit();
        se.putString("name","sfar");
        se.putString("pass","1234");
        se.commit();

        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this, CustomPager.class);
                startActivity(i);

            }
        },3000);
    }

}
