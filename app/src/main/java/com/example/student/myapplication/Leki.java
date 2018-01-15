package com.example.student.myapplication;

/**
 * Created by student on 2018-01-15.
 */

public class Leki {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return dawka;
    }

    public void setPrice(String price) {
        this.dawka = price;
    }


    private String name;
    private String dawka;


    public Leki(String name, String price) {
        this.name = name;
        this.dawka = price;
    }
}
