// Write a program in Java to print even numbers between 23 and 57, each number 
// should be printed in a row separated by comma(,).

import java.util.Scanner;
public class 6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lower Limit: ");
        int lowerLimit = sc.nextInt();
        System.out.print("Enter a upper Limit: ");
        int upperLimit = sc.nextInt();
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
            
        }
    }
}