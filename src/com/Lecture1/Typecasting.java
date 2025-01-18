package com.Lecture1;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // //int num = input.nextInt();
        // System.out.println(num);

        // typecasting
        // int num = (int)(65.87f);
        // System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a);   // 257 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 30;
        // byte c = 60;
        // int d = (a * b) / c;
        // System.out.println(d);
       
        // byte b = 50;
        // b = b * 2;


        // int number = 'A';
        // System.out.println(number);

        // System.out.println("दीपशिखा");
      
        // System.out.println(3 * 6);
        // System.out.println(3 * 5.77655444);
        // System.out.println(3 * 5.77655444f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - ( d - s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }
    
}
