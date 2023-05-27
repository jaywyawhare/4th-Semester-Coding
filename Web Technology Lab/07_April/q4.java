// Let there are two student names as Mayank Ranjan Padhi and Ahmed Asmit Patel. Design and
// implement a Java program that will exchange the last name of the two students in such a way that
// the new names are going to be: Mayank Ranjan Patel and Ahmed Asmit Padhi.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For First Student");
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter middle name: ");
        String middleName = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.println("For Second Student");
        System.out.println("Enter first name: ");
        String firstName2 = sc.nextLine();
        System.out.println("Enter middle name: ");
        String middleName2 = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName2 = sc.nextLine();
        String temp = lastName;
        lastName = lastName2;
        lastName2 = temp;
        System.out.println("First Student: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Second Student: " + firstName2 + " " + middleName2 + " " + lastName2);
    }
    
}