// Write a program in Java which will overload the area () method and
// display the area of a circle, triangle and square as per user choice and
// user entered dimensions.

import java.util.Scanner;

public class q5 {
    static void area(float r) {
        System.out.println("Area of circle is " + 3.14f * r * r);
    }
    static void area(float b, float h) {
        System.out.println("Area of triangle is " + (b * h) / 2);
    }
    static void area(float l) {
        System.out.println("Area of square is " + l * l);
    }
    
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the shape you want to calculate area of: ");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the radius of circle: ");
                    float r = sc.nextFloat();
                    area(r);
                    break;
                case 2:
                    System.out.println("Enter the base and height of triangle: ");
                    float b = sc.nextFloat();
                    float h = sc.nextFloat();
                    area(b, h);
                    break;
                case 3:
                    System.out.println("Enter the length of square: ");
                    float l = sc.nextFloat();
                    area(l);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
            
        }
    }
}