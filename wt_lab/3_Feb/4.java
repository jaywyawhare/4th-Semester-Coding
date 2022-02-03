// Write a program in Java to print the corresponding grade for the given mark using if..else statement.

import java.util.Scanner;
public class 4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mark: ");
        int mark = sc.nextInt();
        if (mark >= 90) {
            System.out.println("Grade: O");
        } else if (mark >= 80) {
            System.out.println("Grade: E");
        } else if (mark >= 70) {
            System.out.println("Grade: A");
        } else if (mark >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F for you!");
        }
    }
}