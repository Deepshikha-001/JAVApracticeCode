package assgn.assignment2;

import java.util.Scanner;

public class conditionalLoops {
     //public static void main(String[] args) {
        
     
    //  @SuppressWarnings("resource")
    //     Scanner in = new Scanner(System.in);
    //    System.out.print("Enter the number :");
    //     int n = in.nextInt();

    // int a = 1;
    //    int b = 0;
    //     while(n>0){
    //        int m = n % 10;
    //      n = n / 10;
    //        a = m * a;
    //        b = m + b;
    //     }

    //     int c = a - b;

    //     System.out.println(c);



    //     @SuppressWarnings("resource")
    //     Scanner in = new Scanner(System.in);
    //    System.out.print("Enter the number :");
    //     int n = in.nextInt();
     
        // for(int i=1; i<=n; i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // }





    //     @SuppressWarnings("resource")
    //     Scanner in = new Scanner(System.in);
    //    System.out.print("Enter the number :");
    //     int n = in.nextInt();

    //    int a = 1;
    //    for(int i=1; i<=n; i++){
    //        a = a * i;
    //     }
    //    System.out.println(a);
      

public static boolean isArmstrong(int number){
       
       @SuppressWarnings("resource")
       Scanner in = new Scanner(System.in);
      System.out.print("Enter the number :");
       int n = in.nextInt();

       int a = 0;
       while(n>0){
        int m = n % 10;
        int b = m*m*m;
        a = a + b;
        n = n / 10;
        
       }
       System.out.println(a);
    }
       
    public static void main(String[] args){
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
      
  }

