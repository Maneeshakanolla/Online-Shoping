package com.example.onlineshoping;

public class RowModelList1 {
    String nonVege, nonVegeCost;
    int nonVegeImage;

    public RowModelList1(String nonVege, String nonVegeCost, int nonVegeImage) {
        this.nonVege = nonVege;
        this.nonVegeCost = nonVegeCost;
        this.nonVegeImage = nonVegeImage;
    }

    public String getNonVege() {
        return nonVege;
    }

    public void setNonVege(String nonVege) {
        this.nonVege = nonVege;
    }

    public String getNonVegeCost() {
        return nonVegeCost;
    }

    public void setNonVegeCost(String nonVegeCost) {
        this.nonVegeCost = nonVegeCost;
    }

    public int getNonVegeImage() {
        return nonVegeImage;
    }

    public void setNonVegeImage(int nonVegeImage) {
        this.nonVegeImage = nonVegeImage;
    }
}
