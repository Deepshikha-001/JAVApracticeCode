package com.Lecture2;

import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        
        // int n = 13839;
        // @SuppressWarnings("unused")
        // int count = 0;
        // while(n>0){
        //     int rem = n % 10;
        //     if(rem == 8){
        //         count++;
        //     }n = n / 10;
        // }
        // System.out.println(count);

 
            //using input method....

            
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        // System.out.print("Enter the digit : ");
        // int x = in.nextInt();
        // int count = 0;
        // while(n>0){
        //     int rem = n % 10;
        //     if(rem == x){
        //         count++;
        //     }
        //     n = n / 10;
        // }
        // System.out.println(count);

       int a = 1;
       int b = 0;
        while(n>0){
           int m = n % 10;
         n = n / 10;
           a = m * a;
           b = m + b;
        }

        int c = a - b;

        System.out.println(c);

        

  
        



    }
}
