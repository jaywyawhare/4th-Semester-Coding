// Write a program in Java to convert from upper case to lower case and vice versa 
// of an alphabet and print the old character and new character as shown in example. 
// (Ex: a->A, M->m).

import java.util.Scanner;
public class 2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("The character is upper case.");
            System.out.println("The new character is " + Character.toLowerCase(ch));
        } else {
            System.out.println("The character is lower case.");
            System.out.println("The new character is " + Character.toUpperCase(ch));
        }
        
    }
}

