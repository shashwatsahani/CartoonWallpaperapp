package com.example.ragnar.useless;

import android.app.WallpaperManager;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.internal.NavigationMenu;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import io.github.yavski.fabspeeddial.FabSpeedDial;

import static android.widget.Toast.makeText;

/**
 * Created by ragnar on 30/12/17.
 */

public class superhero extends AppCompatActivity {
    Field[] fields;
    ImageView img;
    RelativeLayout l1;
    int[] a,du;
    FabSpeedDial fabSpeedDial;
    private InterstitialAd interstitialAd;
    LinearLayout lhz;
    String[] col;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superhero);
        // ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        img=(ImageView)findViewById(R.id.img);
        a=new int[]{
                R.drawable.z1,
                R.drawable.z2,
                R.drawable.z3,
                R.drawable.z4,
                R.drawable.z5,
                R.drawable.z6,
                R.drawable.z7,
                R.drawable.z8,
                R.drawable.z9,
                R.drawable.z10,
                R.drawable.z11,
                R.drawable.z12,
                R.drawable.z13,
                R.drawable.z14,
                R.drawable.z15,
                R.drawable.z16,
                R.drawable.z17,
                R.drawable.z18,
                R.drawable.z19,
                R.drawable.z20,
                R.drawable.z21,
                R.drawable.z22,
                R.drawable.z23,
                R.drawable.z24,
                R.drawable.z25,
                R.drawable.z26,

        };
        du=new int[]{
                R.mipmap.z1,
                R.mipmap.z2,
                R.mipmap.z3,
                R.mipmap.z4,
                R.mipmap.z5,
                R.mipmap.z6,
                R.mipmap.z7,
                R.mipmap.z8,
                R.mipmap.z9,
                R.mipmap.z10,
                R.mipmap.z11,
                R.mipmap.z12,
                R.mipmap.z13,
                R.mipmap.z14,
                R.mipmap.z15,
                R.mipmap.z16,
                R.mipmap.z17,
                R.mipmap.z18,
                R.mipmap.z19,
                R.mipmap.z20,
                R.mipmap.z21,
                R.mipmap.z22,
                R.mipmap.z23,
                R.mipmap.z24,
                R.mipmap.z25,
                R.mipmap.z26,

        };
        l1=(RelativeLayout)findViewById(R.id.l1);
        lhz=(LinearLayout)findViewById(R.id.lhz);

        try{
        for(int i=0;i<du.length;i++)
        {
            final int j=i;
            ImageView IMg=new ImageView(this);
            IMg.setImageResource(du[i]);
            // Letset(IMg);
            IMg.setAdjustViewBounds(true);
            IMg.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    //  imgswtch.setImageResource(Animal.images[j]);
                   // Toast.makeText(superhero.this,"Hola this is",Toast.LENGTH_SHORT).show();
                img.setImageResource(a[j]);
                }
            });
            lhz.addView(IMg);

        } }catch (OutOfMemoryError e)
        {
            Snackbar.make(findViewById(android.R.id.content),"Sometimes we hide the images tray ;p",Snackbar.LENGTH_SHORT).show();
        }


        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-9874900066695797/5053942098");
        interstitialAd.loadAd(adRequest);
        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
        }
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }
        });
        final ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#000000"));
        actionBar.setBackgroundDrawable(colorDrawable);
        fabSpeedDial=(FabSpeedDial)findViewById(R.id.fabspeed);
        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                //Toast.makeText(MainActivity.this,"Hey",Toast.LENGTH_SHORT).show();
                int id=menuItem.getItemId();
                switch(id)
                {
                    case R.id.menu_1:/*Bitmap bitmap;
                        OutputStream out;
                        bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.backpack);


                        try{
                            out=new FileOutputStream(mp);
                            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);
                            out.flush();
                            out.close();
                            Toast.makeText(MainActivity.this,"Saved Successfully", Toast.LENGTH_SHORT).show();return true;
                        }catch (Exception e)
                        {
                            Toast.makeText(MainActivity.this,"Error Occured", Toast.LENGTH_SHORT).show();return true;
                        }*/


                        try {
                            // image naming and path  to include sd card  appending name you choose for file
                            //actionBar.hide();
                            lhz.setVisibility(View.INVISIBLE);
                            Date currentTime = Calendar.getInstance().getTime();
                          //  String mPath = Environment.getRootDirectory().toString() + "/Useless/" +currentTime + ".jpg";
                            File file= Environment.getExternalStorageDirectory();
                            File dir=new File(file+"/Useless/");
                            dir.mkdir();
                            File mp=new File(dir,currentTime+".jpg");
                            fabSpeedDial.setVisibility(View.INVISIBLE);
                            // create bitmap screen capture
                            View v1 = getWindow().getDecorView().getRootView();
                            v1=findViewById(R.id.l1);
                            v1.setDrawingCacheEnabled(true);

                            Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
                            v1.setDrawingCacheEnabled(false);

                            //File imageFile = new File(mPath);


                            FileOutputStream outputStream = new FileOutputStream(mp);
                            int quality = 100;
                            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
                            outputStream.flush();
                            outputStream.close();
                            fabSpeedDial.setVisibility(View.VISIBLE);
                            lhz.setVisibility(View.VISIBLE);
                            //actionBar.show();
                            makeText(superhero.this,"Saved Successfully", Toast.LENGTH_SHORT).show();
                            return true;


                        } catch (Throwable e) {
                            fabSpeedDial.setVisibility(View.VISIBLE);
                            lhz.setVisibility(View.VISIBLE);
                            // Several error may come out with file handling or DOM
                            e.printStackTrace();
                            makeText(superhero.this,"Error Occured,Please Check for permissions", Toast.LENGTH_SHORT).show();return true;
                        }
                    case R.id.menu_2:
                        // makeText(MainActivity.this,"Hey 2", Toast.LENGTH_SHORT).show();return true;
                        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
                        try {

                            lhz.setVisibility(View.INVISIBLE);
                            fabSpeedDial.setVisibility(View.INVISIBLE);
                            // create bitmap screen capture
                            View v1 = getWindow().getDecorView().getRootView();
                            v1=findViewById(R.id.l1);
                            v1.setDrawingCacheEnabled(true);

                            Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
                            v1.setDrawingCacheEnabled(false);


                            wallpaperManager.setBitmap(bitmap);
                            makeText(superhero.this,"Wallpaper Applied Succesfully", Toast.LENGTH_SHORT).show();
                            fabSpeedDial.setVisibility(View.VISIBLE);
                            lhz.setVisibility(View.VISIBLE);
                            return true;

                        }catch (Exception e)
                        {
                            fabSpeedDial.setVisibility(View.VISIBLE);
                            lhz.setVisibility(View.VISIBLE);
                            Log.d("Ms",e+"");
                            makeText(superhero.this,"Error occured,Please Check for permissions", Toast.LENGTH_SHORT).show();return true;
                        }
                    case R.id.menu_3:
                        try{
                            fabSpeedDial.setVisibility(View.INVISIBLE);
                            lhz.setVisibility(View.INVISIBLE);
                            // create bitmap screen capture
                            View v1 = getWindow().getDecorView().getRootView();
                            v1=findViewById(R.id.l1);
                            v1.setDrawingCacheEnabled(true);

                            Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
                            v1.setDrawingCacheEnabled(false);
                            fabSpeedDial.setVisibility(View.VISIBLE);
                            lhz.setVisibility(View.VISIBLE);
                            //Intent share = new Intent(Intent.ACTION_SEND);
                            //share.setType("image/jpeg");
                            String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "temp1", null);
                            Uri uri = Uri.parse(path);

                            Intent intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("image/jpeg");
                            intent.putExtra(Intent.EXTRA_STREAM, uri);
                            startActivity(Intent.createChooser(intent, "Share Image"));return true;}
                        catch (Exception e)
                        {
                            fabSpeedDial.setVisibility(View.VISIBLE);
                            lhz.setVisibility(View.VISIBLE);
                            Log.d("Ms",e+"");
                            makeText(superhero.this,"Error occured,Please Check for permissions", Toast.LENGTH_SHORT).show();return true;
                        }
                    default:
                        return true;
                }

            }

            @Override
            public void onMenuClosed() {

            }
        });


        getSupportActionBar().setTitle(Html.fromHtml("<font color='#ffffff'>Superheroes</font>"));


        col=new String[]{"50","100","200","300","400","500","600","700","800","900","A100","A200","A400","A700"};



        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int i;
                i =random.nextInt(a.length);
                img.setImageResource(a[i]);
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                }
                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        super.onAdClosed();
                    }
                });
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int df;
                Random random=new Random();
                int i,gg;
                gg=random.nextInt(col.length);
                l1.setBackgroundColor(df=getMatColor(col[gg]));
                String hexColor = String.format("#%06X", (0xFFFFFF & df));
                ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(hexColor));
                actionBar.setBackgroundDrawable(colorDrawable);
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                }
                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        super.onAdClosed();
                    }
                });
            }
        });



    }
    private int getMatColor(String typeColor)
    {
        int returnColor = Color.BLACK;
        int arrayId = getResources().getIdentifier("mdcolor_" + typeColor, "array", getApplicationContext().getPackageName());

        if (arrayId != 0)
        {
            TypedArray colors = getResources().obtainTypedArray(arrayId);
            int index = (int) (Math.random() * colors.length());
            returnColor = colors.getColor(index, Color.BLACK);
            colors.recycle();
        }
        return returnColor;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

