package assgn.assignment1;

import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fist no. : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second no. : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of given numbers is "+ sum);
    }
}

