package com.Lecture3;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int empID = in.nextInt();
      String department = in.next();
      
    //    switch(empID) {
    //     case 1:
    //        System.out.println("Deepshikha");
    //        break;

    //     case 2:
    //        System.out.println("Vishal Jha");
    //        break;

    //     case 3:
    //         System.out.println("Emp Nmuber 3");
    //         switch (department) {
    //             case "IT":
    //                 System.out.println("IT Department");
    //                 break;
    //             case "Management":
    //                 System.out.println("Mangement Department");
    //                 break;

    //             default:
    //                 System.out.println("No Department entered");
    //         }
    //         break;
    //         default :
    //             System.out.println("Enter correct EmpID");
    //   }



    switch(empID) {
        case 1 -> System.out.println("Deepshikha");
        case 2 -> System.out.println("Vishal Jha");
        case 3 -> {System.out.println("Emp Nmuber 3");
            switch (department) {
                case "IT" -> System.out.println("IT Department");
                case "Management" -> System.out.println("Mangement Department");
                default -> System.out.println("No Department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
      }

    }
}
