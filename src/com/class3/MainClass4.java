package com.class3;

public class MainClass4 {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle("2", "2", "2", "");
//        System.out.println("-----Triangle-----");
//        System.out.println("Side A: " + triangle.getSideA());
//        System.out.println("Side B: " + triangle.getSideB());
//        System.out.println("Side C: " + triangle.getSideC());
//        System.out.println("Area: " + triangle.area());
//        System.out.println("Perimeter: " + triangle.perimeter());
//
//        Rectangle rectangle = new Rectangle("2", "3", "");
//        System.out.println("-----Rectangle-----");
//        System.out.println("Width: " + rectangle.getWidth());
//        System.out.println("Length: " + rectangle.getLength());
//        System.out.println("Area: " + rectangle.area());
//        System.out.println("Perimeter: " + rectangle.perimeter());

        Circle circle = new Circle("2", "");
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        circle.display();
    }
}
