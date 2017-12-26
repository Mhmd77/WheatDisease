package ir.hoshmand.zamin.iran.wheatdisease.models;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Mohammad on 12/20/2017.
 */

public class MenuItem {
    private String name;
    private ArrayList<Title> titles;
    private Drawable image;

    public MenuItem(String name, Drawable image) {
        this.name = name;
        this.image = image;
        titles = new ArrayList<>();
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public Drawable getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

}
