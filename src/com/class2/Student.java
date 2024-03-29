package com.class2;

import java.util.Scanner;

public class Student {
    String name = "";
    String email = "";
    boolean active = false;
    Scanner inputScanner = new Scanner(System.in);

    public Student(String name, String email, boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
    }
    public  void input() {
        System.out.print("Name:");
        this.name = inputScanner.nextLine();

        System.out.print("Email:");
        this.email = inputScanner.nextLine();

        System.out.print("Active: [y/n]");
        String answer = inputScanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            this.active = true;
        }
    }
    public void display() {
        System.out.println("====Student info=====");
        System.out.println("Name: " + this.name);
        System.out.println("Email " + this.email);
        if(this.active) {
            System.out.println("Status studying");
        } else {
            System.out.println("Status graduated");
        }
    }
    public String getName() {
        return this.name ;
    }

    public String getEmail() {
        return this.name ;
    }

    public boolean getActive() {
        return this.active ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
