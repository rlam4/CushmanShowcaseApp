package com.rlam.cushmanshowcaseapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public ImageButton b1;
    public ImageButton b2;
    public Button b3;
    public Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewFlipper viewFlipper;
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        viewFlipper.startFlipping();

        init();
    }

    public void init() {

        //Factory and Warehouse Button
        b1 = (ImageButton)findViewById(R.id.fawButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, IndustrialMainActivity.class);
                startActivity(a);
            }
        });

        //Commercial Button
        b2 = (ImageButton)findViewById(R.id.commercialButton);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, CommercialMainActivity.class);
                startActivity(b);
            }
        });

//        b3 = (Button)findViewById(R.id.browseCushman);

//        b3.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cushman.com/"));
//                startActivity(browse);
//            }
//        });



    }

    public void cushmanWeb(View v) {
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cushman.com/"));
        startActivity(browse);
    }


}
