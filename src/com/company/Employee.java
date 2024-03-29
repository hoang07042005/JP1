package com.company;

import java.util.Scanner;

public class Employee extends Person {
   int level;
   public Employee(String name, String email, int salary, int level) {
       super(name, email, salary);
       this.level = level;
   }

    @Override
    public int getBonus() {
        return 2 * this.salary;
    }

//    @Override
//    public void input() {
//
//    }

    @Override
    public void display() {
        System.out.println("This is a Employee");
        System.out.println("name " + this.name);
        System.out.println("email " + this.email);
        System.out.println("salary " + this.salary);
    }

//    @Override
//    public void code() {
//        System.out.println();
//    }
//
//    @Override
//    public void debug() {
//        System.out.println();
//    }
}
