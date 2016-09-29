package com.shuivy.happylendandreadbooks.models;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by 江 on 2016/9/27.
 */
public class BookInfo implements Serializable {
    private String title;
    private Bitmap img;
    private String des;
    private String location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}