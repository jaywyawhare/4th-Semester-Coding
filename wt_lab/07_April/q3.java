// Write a program in java to perform following operations on user entered strings –
//     i) Change the case of the string 
//     ii) Reverse the string 
//     iii) Compare two strings 
//     iv) Insert one string into another string

import java.util.Scanner;
import java.util.regex.Matcher;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("1. Change Case");
        System.out.println("2. Reverse String");
        System.out.println("3. Compare Strings");
        System.out.println("4. Insert String");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Original String: " + str);
                    System.out.println("Changed String: " + changeCase(str));
                    break;
                case 2:
                    System.out.println("Original String: " + str);
                    System.out.println("Reversed String: " + reverseString(str));
                    break;
                case 3:
                    System.out.println("Original String: " + str);
                    System.out.println("Enter String to compare: ");
                    String str2 = sc.nextLine();
                    System.out.println("Comparison Result: " + compareStrings(str, str2));
                    break;
                case 4:
                    System.out.println("Original String: " + str);
                    System.out.println("Enter String to insert: ");
                    String str3 = sc.nextLine();
                    System.out.println("Inserted String: " + insertString(str, str3));
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("1. Change Case");
            System.out.println("2. Reverse String");
            System.out.println("3. Compare Strings");
            System.out.println("4. Insert String");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    
}