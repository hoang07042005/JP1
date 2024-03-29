package com.class3;

public class Rectangle extends Shape {
    String width;
    String length;

    public Rectangle(String width, String length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String width, String length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    public String getWidth() {
        return width;
    }

    public String getLength() {
        return length;
    }

    public void setWidth(String width) {

        this.width = width;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public double perimeter() {
        return 2 * (Double.parseDouble(width) + Double.parseDouble(length));
    }

    public double area() {
        return Double.parseDouble(width) * Double.parseDouble(length);
    }

    @Override
    public void display() {
        System.out.println("Length " + this.length);
        System.out.println("With " + this.width);
        System.out.println("Color " + this.color);
    }
}
