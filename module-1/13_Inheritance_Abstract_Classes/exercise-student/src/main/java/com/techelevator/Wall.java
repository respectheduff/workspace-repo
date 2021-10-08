package com.techelevator;

import java.awt.*;
import java.lang.reflect.Method;

public class Wall {
    private String name;
    private String color;
    private int length;
    private int height;

    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public int getArea(int i) {
        return getArea(length * height);
    }

}