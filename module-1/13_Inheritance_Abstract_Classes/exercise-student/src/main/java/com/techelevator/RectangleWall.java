package com.techelevator;

public class RectangleWall extends Wall {
    private int length;
    private int height;

    public RectangleWall(String name, String color) {
        super(name, color);
    }

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }


    public int getArea(){
        return length * height;
    }


    //    public String toString(){
//        return getArea(length*height) rectangle;
//    }
//    @Override
//    public String toString() {
//        return "RectangleWall{" +
//                "length=" + length +
//                ", height=" + height +
//                '}';
//    }
}
