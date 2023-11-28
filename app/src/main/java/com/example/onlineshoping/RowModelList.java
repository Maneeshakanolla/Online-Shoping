package com.example.onlineshoping;

public class RowModelList {
    int vegImage;
    String vegName;

    public RowModelList(int vegImage, String vegName) {
        this.vegImage = vegImage;
        this.vegName = vegName;
    }

    public int getVegImage() {
        return vegImage;
    }

    public void setVegImage(int vegImage) {
        this.vegImage = vegImage;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }
}
