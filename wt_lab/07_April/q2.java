// Write a program in java to enter two strings, then concatenate and display them. Also split that
// resultant string into 4 substrings.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String str2 = sc.nextLine();
        System.out.println("Concatenated String: " + concatenateStrings(str1, str2));
        String[] substrings = splitString(concatenateStrings(str1, str2));
        System.out.println("Substring 1: " + substrings[0]);
        System.out.println("Substring 2: " + substrings[1]);
        System.out.println("Substring 3: " + substrings[2]);
        System.out.println("Substring 4: " + substrings[3]);
    }
}