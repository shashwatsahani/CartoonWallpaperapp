package com.example.ragnar.useless;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class Splash extends AppCompatActivity
{
    private static final int DELAYED=2000;
    Button sub;
    Animation frombottom,fromtop;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();


imageView =(ImageView)findViewById(R.id.imageView);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.fromtop);
        imageView.setAnimation(fromtop);

      new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,Front.class);
                startActivity(i);

            }
        },DELAYED);


       /* imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Splash.this,Front.class));
                finish();
            }
        });*/

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
