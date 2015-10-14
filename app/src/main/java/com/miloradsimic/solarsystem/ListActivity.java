    package com.miloradsimic.solarsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends Activity {
    private List<Planet> planets = new ArrayList<Planet>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        populatePlanets();

        /*String[] planets = {"Merkur", "Venera", "Zemlja", "Mars", "Jupiter", "Saturn", "Uran", "Neptun", "Pluton"};
        String[] images = {"merkur.jpg", "venera.jpg", "zemlja.jpg", "mars.jpg", "jupiter.jpg", "saturn.jpg", "uran.jpg", "neptun.jpg", "pluton.jpg" }*/
        ListAdapter myAdapter = new CustomAdapter(this, planets);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(ListActivity.this, Planeta.class);

                        Planet planet = (Planet) parent.getItemAtPosition(position);

                        intent.putExtra("name", planet.getName());
                        intent.putExtra("icon", planet.getIcon());

                        startActivity(intent);

                        /*Toast.makeText(ListActivity.this, planets, Toast.LENGTH_LONG).show();*/
                    }
                }
        );
    }
    /*Adding items to list*/
    private void populatePlanets() {
        planets.add(new Planet("Merkur", R.drawable.merkur));
        planets.add(new Planet("Venera", R.drawable.venera));
        planets.add(new Planet("Zemlja", R.drawable.zemlja));
        planets.add(new Planet("Mars", R.drawable.mars));
        planets.add(new Planet("Jupiter", R.drawable.jupiter));
        planets.add(new Planet("Saturn", R.drawable.saturn));
        planets.add(new Planet("Uran", R.drawable.uran));
        planets.add(new Planet("Neptun", R.drawable.neptun));
        planets.add(new Planet("Pluton", R.drawable.pluton));
    }

}
