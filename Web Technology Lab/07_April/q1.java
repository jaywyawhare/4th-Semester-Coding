// Write a program in java that receives a full name as parameter and prints on the console by
// adding a substring in between as follows:
//     Example: Input: Pratik Dash Output: Pratik Kumar Dash

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String fullName = sc.nextLine();
        System.out.println("Full name with space: " + fullName);
        String[] substrings = splitString(fullName);
        System.out.println("First name: " + substrings[0]);
        System.out.println("Middle name: " + substrings[1]);
        System.out.println("Last name: " + substrings[2]);
    }
    
}