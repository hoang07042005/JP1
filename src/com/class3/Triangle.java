package com.class3;

public class Triangle extends Shape {
    String sideA;
    String sideB;
    String sideC;

    public Triangle(String sideA, String sideB, String sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String sideA, String sideB, String sideC, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    public String getSideA() {
        return sideA;
    }

    public String getSideB() {
        return sideB;
    }

    public String getSideC() {
        return sideC;
    }

    public void setSideA(String sideA) {
        this.sideA = sideA;
    }

    public void setSideB(String sideB) {
        this.sideB = sideB;
    }

    public void setSideC(String sideC) {
        this.sideC = sideC;
    }

    public double perimeter() {
        return Double.parseDouble(sideA) + Double.parseDouble(sideB) + Double.parseDouble(sideC);
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - Double.parseDouble(sideA)) * (s - Double.parseDouble(sideB)) * (s - Double.parseDouble(sideC)));
    }

    @Override
    public void display() {
        System.out.println("SideA " + this.sideA);
        System.out.println("SideB " + this.sideB);
        System.out.println("SideC " + this.sideC);
        System.out.println("Color " + this.color);
    }
}
