package com.Lecture1;

import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
       /*  System.out.println("Hello, World!");
        System.out.println("My name is Deepshikha.");*/
 
        System.out.print("Hello, World!");
        System.out.println("My name is Deepshikha.");

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
    }
}
