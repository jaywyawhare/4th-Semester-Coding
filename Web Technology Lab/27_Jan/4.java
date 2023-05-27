// Program to check a user entered number is palindrome or not.

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
        int day;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = SC.nextInt();
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome.");
        } 
    }
}
