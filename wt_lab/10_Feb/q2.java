// Write a program in Java to accept 10 numbers from command line and check how many of them are even and how many odd.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int count_even = 0;
        int count_odd = 0;

        for(int i =0; i<10; i++) {
            int num = Integer.parseInt(args[i]);
            if(num%2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
            System.out.println("Number of even and odd numers persent given input is " + count_even + " and " + count_odd + " respectively");
        }
    }
}