package com.Lecture2;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        
        // int salary = 25400;
        // if(salary > 30000){
        //     salary += 5000;
        // } else if (salary > 20000) {
        //     salary += 3000;
        // }
        // else{
        //     salary += 1000;
        // }
        // System.out.println(salary);





        // for(int num=1; num <=5; num++){
        //     System.out.println(num);
        // }

        // for(int num=1; num <=5; num++){
        //         System.out.println("Hello World");
        //      }





        //  int num = 1;
        //  while(num <= 5){
        //     System.out.println(num);
        //     num += 1;
        //  }



        //  @SuppressWarnings("resource")
        // Scanner input = new Scanner (System.in);
        //  System.out.print("Enter the number : ");
        //  int n = input.nextInt();
        //  int num = 1;
        //  while(num <= n){
        //     System.out.println(num);
        //     num += 1;
        //  }





        // int num = 1;
        // do{
        //     System.out.println(num);
        //     num++;
        // } while(num <= 5);


        
        //  @SuppressWarnings("resource")
        // Scanner input = new Scanner (System.in);
        //  System.out.print("Enter the number : ");
        //  int n = input.nextInt();
        // int num = 1;
        // do{
        //     System.out.println(num);
        //     num++;
        // } while(num <= n);






        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;
        // if(b > max){
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }

        //OOOOOOOOORRRRRRRRRR  

        // int max = 0;
        // if(a > b){
        //     max = a;
        // } else {
        //     max = b;
        // }

        // if (c>max){
        //     max = c;
        // }

        // System.out.println(max + " is the highest.");


        //OOOOOORRRRRRR

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max + " is the highest.");





    }
}
