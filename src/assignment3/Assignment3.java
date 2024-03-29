package assignment3;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Circle-----");
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("-----Rectangle-----");
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);

        System.out.println("----Triangle-----");
        System.out.print("Enter side A of triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side B of triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side C of triangle: ");
        double sideC = scanner.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        // In kết quả
        System.out.println("Results:");
        circle.printResult();
        rectangle.printResult();
        triangle.printResult();

        scanner.close();
    }
}
