package com.lightcone.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Click listeners for all buttons
         View firstButton = findViewById(R.id.button1);
         firstButton.setOnClickListener(this);
         View secondButton = findViewById(R.id.button2);
         secondButton.setOnClickListener(this);
    }

    // Process the button click events

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.button1:
                Intent j = new Intent(this, Webscreen.class);
                j.putExtra(com.lightcone.webviewdemo.Webscreen.URL,
                    "http://eagle.phys.utk.edu/guidry/recipes/chili.html");
                startActivity(j);
                break;

            case R.id.button2:
                Intent k = new Intent(this, Webscreen.class);
                k.putExtra(com.lightcone.webviewdemo.Webscreen.URL,
                    "http://www.ssd.noaa.gov/goes/east/tatl/vis-l.jpg");
                startActivity(k);
                break;
        }

    }
}
