package com.Lecture5;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        // String personalised = myGreet("Deepshikha");
        // System.out.println(personalised);


        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }


    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    // static String greet(){
    //     String greeting = "how are you";
    //     return greeting;
    // }
}
