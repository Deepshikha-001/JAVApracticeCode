package com.Lecture2;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused", "resource" })
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b + " is the " + n + "th fibonacci number.");



              // OOOOOORRRRRRR



        // for(int count=2; count<=n; count++){
        //      int temp = b;
        //      b = b + a;
        //      a = temp;
        // }

        // System.out.println(b + " is the " + n + "th fibonacci number.");

        }
}
