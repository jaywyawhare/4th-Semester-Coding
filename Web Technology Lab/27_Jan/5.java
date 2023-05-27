// Write a program in Java to take first name and last name from user and print
// both in one line as last name followed by first name.

import java.util.Scanner;
public class 5 {
    public static void main(String[] args) {
        System.out.println("Enter your first name: ");
        Scanner SC=new Scanner(System.in);
        String firstName = SC.next();
        System.out.println("Enter your last name: ");
        String lastName = SC.next();
        System.out.println(lastName + " " + firstName);
    }
}
