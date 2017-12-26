package ir.hoshmand.zamin.iran.wheatdisease.models;

import android.graphics.drawable.Drawable;

/**
 * Created by Mohammad on 12/20/2017.
 */

public class MenuItem {
    private int id;
    private String title;
    private Drawable image;

    public MenuItem(String title, Drawable image) {
        this.title = title;
        this.image = image;
    }

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
