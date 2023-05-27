//  Program to print the corresponding grade for the given mark using if..else
// statement in Java

import java.util.Scanner;
public class 2 {
public static void main(String args[]){
          int marks;
          Scanner SC=new Scanner(System.in);           
          System.out.print("Enter your marks: ");
          marks=SC.nextInt();
          if (marks >= 90) {
            System.out.println("Grade: O");
        } else if (marks >= 80) {
            System.out.println("Grade: E");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F for You! You are failed!");
        }
    }
}
