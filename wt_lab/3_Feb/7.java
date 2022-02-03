// Write a program in Java to add all the values in a given number and print. 
// Ex: 1235>11

import java.util.Scanner;
public class 7 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}