//  Write a program in Java to find the largest among 3 user entered nos. through command line.

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = a>b ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println("Largest number is " + max);
    }
}