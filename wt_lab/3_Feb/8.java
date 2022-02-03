import java.util.Scanner;

public class 8 {
    public static void main(String[] args) {
        int digs[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        while (temp > 0) {
            digs[temp % 10] = 1;
            temp /= 10;
        }
        int digits = 0;
        for (int i = 0; i < digs.length; i++) {

            digits += digs[i];
        }
        System.out.println("no of distinct digits are: " + digits);
        sc.close();
    }
}