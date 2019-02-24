package com.example.ragnar.useless;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;

/**
 * Created by ragnar on 1/1/18.
 */

public class credits extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
        ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#212121"));
        actionBar.setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#ffffff'>Credits</font>"));
    }
}
