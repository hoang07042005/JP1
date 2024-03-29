package com.class2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {
//        System.out.println("Hello");

//        int numbers[] = new int[5];
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter new number : ");
//            numbers[i] = input.nextInt();
//        }
//
//        Arrays.sort(numbers);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(" " + numbers[i]);
//        }

//        for (int item : numbers) {
//            System.out.println(item);
//        }

        Student students[] = new Student[3];
//        students[0] = new Student();
//        students[1] = new Student();
//        students[2] = new Student();
        students[0] = new Student("hoang", "hoang@gmail", true);
        students[1] = new Student("tuan", "tuan@gmail", true);
        students[2] = new Student("son", "son@gmail", true);

        for (Student item : students) {
            System.out.println("===Input new student");
            item.input();
        }
        for (Student item : students){
            item.display();
        }
        //object
//        Student student1 = new Student();
//
//        student1.setName("hoang");
//        student1.setEmail("hoang@gmail");
//        student1.setActive(true);
    }
}
