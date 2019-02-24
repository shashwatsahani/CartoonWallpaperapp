package com.example.ragnar.useless;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by ragnar on 29/12/17.
 */

public class Front extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    boolean doubleBackToExitPressedOnce = false;
    NavigationView navig;
    boolean a;
    private ActionBarDrawerToggle toggle;
    Button poke,looney,superh,hallo,angry,simps;
    private static final String TAG = "Front";
    private InterstitialAd interstitialAd;
    private FirebaseAnalytics mFirebaseAnalytics;

   // private AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);
     //   mAdView = (AdView) findViewById(R.id.adView);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);
        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9874900066695797/5053942098");
        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                interstitialAd.show();
            }
        });
      //  MobileAds.initialize(this,"ca-app-pub-5523453618419022/8841230906");
        navig=(NavigationView)findViewById(R.id.navig);
        poke=(Button)findViewById(R.id.poke);
        looney=(Button)findViewById(R.id.looney);
        hallo=(Button)findViewById(R.id.hallo);
        simps=(Button)findViewById(R.id.simps);
        superh=(Button)findViewById(R.id.superh);
        angry=(Button)findViewById(R.id.angry);
        navig.setItemIconTintList(null);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.Open,R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v(TAG,"Permission is granted");

            } else {


                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);

            }
        }

      //  ActivityCompat.requestPermissions(Front.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);

        toggle.syncState();
        superh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitialAd.setAdListener(new AdListener() {

                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        interstitialAd.show();
                    }
                });
                startActivity(new Intent(Front.this,superhero.class));

            }
        });
        looney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Front.this,loony.class));

            }
        });
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitialAd.setAdListener(new AdListener() {

                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        interstitialAd.show();
                    }
                });
                startActivity(new Intent(Front.this,angry.class));

            }
        });
        hallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitialAd.setAdListener(new AdListener() {

                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        interstitialAd.show();
                    }
                });
                startActivity(new Intent(Front.this,hallo.class));
            }
        });
        poke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitialAd.setAdListener(new AdListener() {

                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        interstitialAd.show();
                    }
                });
                startActivity(new Intent(Front.this,MainActivity.class));
            }
        });
        simps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitialAd.setAdListener(new AdListener() {

                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        interstitialAd.show();
                    }
                });
                startActivity(new Intent(Front.this,simp.class));
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#000000"));
        actionBar.setBackgroundDrawable(colorDrawable);

        navig.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.db1:startActivity(new Intent(Front.this,Front.class));finishAffinity();return true;
                    case R.id.db2:startActivity(new Intent(Front.this,MainActivity.class));return true;
                    case R.id.db3:startActivity(new Intent(Front.this,simp.class));return true;

                    case R.id.db6:startActivity(new Intent(Front.this,angry.class));return true;
                     case R.id.db7:startActivity(new Intent(Front.this,hallo.class));return true;
                    case R.id.db8:startActivity(new Intent(Front.this,loony.class));return true;
                    case R.id.db9:startActivity(new Intent(Front.this,superhero.class));return true;
                    case R.id.db10:startActivity(new Intent(Front.this,credits.class));return true;
                    default:
                        return false;
                }
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_d,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item))
            return true;
        int id = item.getItemId();
        switch (id)
        {
            case R.id.menu1: Uri uri = Uri.parse("market://details?id=" +this.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);

                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
                }
            return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onBackPressed() {

        if (doubleBackToExitPressedOnce) {

            super.onBackPressed();


            return;

        }
        if(this.drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            this.drawerLayout.closeDrawer(GravityCompat.START);

        }


        this.doubleBackToExitPressedOnce = true;
        //  Toast.makeText(this, "To Exit ,Click twice simultaneously", Toast.LENGTH_SHORT).show();
        Snackbar.make(findViewById(android.R.id.content),"Press back again to exit",Snackbar.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                doubleBackToExitPressedOnce = false;
            }
        }, 2000);

    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }
    protected void onResume() {
        super.onResume();
        a=haveNetworkConnection();
        if(!a)
        {
           /* View CustomToast=Front.this.getLayoutInflater().inflate(R.layout.toast,null);
            Toast toast=new Toast(getApplicationContext());
            toast.setView(CustomToast);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();*/
            SpannableStringBuilder builder = new SpannableStringBuilder();
            builder.append(" ").append(" ");
            builder.setSpan(new ImageSpan(Front.this, R.drawable.error), builder.length() - 1, builder.length(), 0);
            builder.append(" \t   No active internet or Slow speed");
            Snackbar.make(findViewById(android.R.id.content), builder, Snackbar.LENGTH_LONG).show();
        }
    }
}
