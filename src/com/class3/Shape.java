package com.class3;

public abstract class Shape {
    String color;
    protected String name;
    protected void getInfomation() {
        System.out.println("This is Shape info: ");
    }
    public abstract void display() ;
}
