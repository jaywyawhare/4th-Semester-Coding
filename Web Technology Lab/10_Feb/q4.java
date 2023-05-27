// Write a program in Java to overload subtract method with various parameters in a class.

import java.util.Scanner;
public class q4 {
    static float subtract(float a, float b) {
        return a - b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static float subtract() {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        sc.close();
        return a - b;
    }

    public static void main(String[] args) {

        System.out.println("Subtract with no parameter");
        System.out.println(subtract());
        System.out.println("Subtract with float parameter");
        System.out.println(subtract(12.4f, 67.8f));
        System.out.println("Subtract with int parameter");
        System.out.println(subtract(34, 2));
    }
}