package com.miloradsimic.solarsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class CustomAdapter extends ArrayAdapter<Planet> {

    CustomAdapter(Context context, List<Planet> planets) {
        super(context, R.layout.custom_row, planets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row, parent, false);

        Planet singlePlanetItem = getItem(position);
        TextView myText = (TextView) customView.findViewById(R.id.listItemText);
        ImageView myImage = (ImageView) customView.findViewById(R.id.listItemImage);

        myText.setText(singlePlanetItem.getName());
        myImage.setImageResource(singlePlanetItem.getIcon());
        return customView;
    }
}
