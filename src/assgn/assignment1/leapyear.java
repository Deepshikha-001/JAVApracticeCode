package assgn.assignment1;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = input.nextInt();
        if(year % 4 == 0){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }
}
