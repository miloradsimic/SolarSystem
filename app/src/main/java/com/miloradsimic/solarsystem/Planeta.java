package com.miloradsimic.solarsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Planeta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_desc);

        Bundle planetData = getIntent().getExtras();

        if(planetData == null)
            return;
        String caption = planetData.getString("name");
        int image = planetData.getInt("icon");

        final TextView planetCaption = (TextView) findViewById(R.id.planetDescName);
        final ImageView imageView = (ImageView) findViewById(R.id.planetDescImage);

        planetCaption.setText("Das ist " + caption + "! ");
        imageView.setImageResource(image);
    }
}
