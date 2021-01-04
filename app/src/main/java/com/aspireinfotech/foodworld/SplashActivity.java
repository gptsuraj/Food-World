package com.aspireinfotech.foodworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Animation blink_anim,bounce_anim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        //id calling
        imageView = (ImageView)findViewById(R.id.splash_iv);
        textView=(TextView)findViewById(R.id.splash_tv);
        blink_anim= AnimationUtils.loadAnimation(this,R.anim.blink);
        //imageView.setAnimation(blink_anim);
        bounce_anim=AnimationUtils.loadAnimation(this,R.anim.bounce);
        textView.setAnimation(bounce_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(SplashActivity.this, CategoryActivity.class);
                startActivity(i);
                finish();

            }
        },3000);
    }
}
