// Write a program in Java to initialize two character variables in a program and display the characters in alphabetical order. 
// Eg1:  if first character is s and second is e 
// O/P: e,s 
// Eg2:  if first character is a and second is e 
// O/P: a,e

import java.util.Scanner;

public class 3 {
    public static void main(String[] args) {
        System.out.print("Program only support same case characters.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter a second character: ");
        char ch2 = sc.next().charAt(0);
        if (ch1 > ch2) {
            System.out.println(ch2 + " " + ch1);
        } else {
            System.out.println(ch1 + " " + ch2);
        }
    }
}