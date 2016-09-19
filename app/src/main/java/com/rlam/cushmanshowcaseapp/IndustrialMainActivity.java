package com.rlam.cushmanshowcaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IndustrialMainActivity extends AppCompatActivity {

    public ImageButton b1;
    public ImageButton b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.industrial_main);


        b1 = (ImageButton)findViewById(R.id.tuggerButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(IndustrialMainActivity.this, TuggerMainActivity.class);
                startActivity(a);
            }
        });

        b2 = (ImageButton)findViewById(R.id.burdenCarrierButton);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(IndustrialMainActivity.this, BurdenCarrierMainActivity.class);
                startActivity(a);
            }
        });

    }
}
