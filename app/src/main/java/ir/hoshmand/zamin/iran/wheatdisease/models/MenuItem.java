package ir.hoshmand.zamin.iran.wheatdisease.models;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Mohammad on 12/20/2017.
 */

public class MenuItem {
    private int id;
    private String name;
    private ArrayList<Title>titles;
    private Drawable image;

    public MenuItem(String name, Drawable image) {
        this.name = name;
        this.image = image;
    }
    public ArrayList<Title> getTitles(){
        return titles;
    }
    public void addTitle(Title title){
        titles.add(title);

    }
    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
