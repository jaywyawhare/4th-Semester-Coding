// Write a program in Java to accept 10 numbers from command line and check how many of them are even and how many odd.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        //add the numbers in array
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        //find even number
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even Number : " + arr[i]);
                System.out.println("number of even numbers : " + (i + 1));
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd Number : " + arr[i]);
                System.out.println("number of odd numbers : " + (i + 1));
            }
        } 
    }
}