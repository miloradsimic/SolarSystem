package com.miloradsimic.solarsystem;

import android.media.Image;

public class Planet {

    private String name;
    private int icon;

    public Planet(String name, int icon){
        super();
        this.name = name;
        this.icon = icon;

    }

    public int getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }
}
