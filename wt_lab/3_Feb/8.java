// Write a program in Java to initialize a number and count the no. of dissimilar digits from that number. (Ex- 4548, no. of digits=3)

import java.util.Scanner;
public static 8 {
    public static void main(String[] args) {
        int digits[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            int a = temp % 10;
            digits[a]++;
            temp = temp / 10;
        }
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 1) {
                count++;
            }
        }
        System.out.println("The number of dissimilar digits is: " + count);
    }
}