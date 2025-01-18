package com.Lecture2;

import java.util.Scanner;

public class reverseofNum {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = in.nextInt();
        int a = 0;
        while(x>0){
           int rem = x % 10;
           a = a * 10 + rem;
           x = x / 10;
        }
        System.out.println(a);
    }

}
    
