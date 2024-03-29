package com.class3;

public class Circle extends Shape {
    String radius;

    public Circle(String radius) {
        this.radius = radius;
    }

    public Circle(String radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Color; " + this.color);
    }
    public double perimeter() {
        return 2 * Math.PI * Double.parseDouble(radius);
    }

    public double area() {
        return Math.PI * Math.pow(Double.parseDouble(radius), 2);
    }
}