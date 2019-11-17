package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class logo extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;
    private  TextView tversion;


    public static int TIME_OUT =4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        tv = findViewById(R.id.tv);
        iv = findViewById(R.id.iv);
        tversion = findViewById(R.id.tversion);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.blink);
        tversion.startAnimation(myanim);




        Handler hundler = new Handler();
        hundler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(logo.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_OUT);

    }
}
