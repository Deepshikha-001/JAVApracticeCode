package assgn.assignment2;

import java.util.Scanner;

public class FirstJavaProgram {
    
    public static void main(String[] args) {


        // @SuppressWarnings("resource")
        // Scanner input = new Scanner(System.in);


        //  System.out.print("Enter the number :");
        //  int x = input.nextInt();
        //  if(x % 2 == 0){
        //     System.out.println("Given no. is an even number.");
        //  } else{
        //     System.out.println("Given no. is an odd number.");
        //  }



        //  Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the NAME : ");
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name + "! Welcome and have a great day!");
        // scanner.close();




        // @SuppressWarnings("resource")
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the Principle : ");
        // int P = input.nextInt();
        // System.out.print("Enter the Time : ");
        // int T = input.nextInt();
        // System.out.print("Enter the Rate : ");
        // int R = input.nextInt();
        // int S = (P * T * R)/100;
        // System.out.println("Simple Interest : " + S);




        // @SuppressWarnings("resource")
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int num1 = input.nextInt();
        // System.out.print("Enter the other number : ");
        // int num2 = input.nextInt();
        // System.out.print("Enter an operator(+,-,*,/) : ");
        // char operator = input.next().charAt(0);

        // if(operator == '+'){
        //   int Sum = num1 + num2;
        //     System.out.print("Result :" + Sum);
        // } else if(operator == '-'){
        //     int difference = num1 - num2;
        //     System.out.print("Result :" + difference);
        // } else if(operator == '*'){
        //     int multiplication = num1 * num2;
        //     System.out.print("Result : " + multiplication);
        // } else if(operator == '/'){
        //     if(num2 != 0){
        //         int division = num1 / num2;
        //         System.out.print("Result : " + division);
        //     }
        //     else{
        //         System.out.print("Error : Divisibility by zero is not defined.");
        //     }
        // } else{
        //     System.out.print("Error :");
        // }




        // @SuppressWarnings("resource")
        // Scanner input = new Scanner (System.in);
        // System.out.print("Enter 1st number : ");
        // int x = input.nextInt();
        // System.out.print("Enter 2nd number :");
        // int y = input.nextInt();

        // if(x>y){
        //     System.out.println(x + " is the largest.");
        // } else if(x<y){
        //     System.out.println(y + " is the laregst.");
        // } else{
        //     System.out.println("Both the numbers are equal.");
        // }




        // @SuppressWarnings("resource")
        // Scanner input = new Scanner (System.in);
        // System.out.print("Enter the currency in Rupees : ");
        // int x = input.nextInt();
        // double USD = (x / 85.82);
        // System.out.println(x + "Rupees in USD is equal to " + USD);





        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = input.nextInt();
        int a=1, b=1, sum;
        sum = 1;
        System.out.println("1");
        System.out.println("1");
        for(int i=1; i<=n-2; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
        System.out.println("\n");






    }
}


