// Write a program in Java to create a class – Box with three data members
// (length, width, height) and a method volume (). Also implement the
// application class Demo where an object of the box class is created with
// user entered dimensions and volume is printed.

import java.util.Scanner;
class Box {
    float length;
    float width;
    float height;

    Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    float volume() {
        return length * width * height;
    }
}

class Demo {
    void printData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length width and height:");
        Box b = new Box(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println("The volume is: " + b.volume());
        sc.close();
    }
}

public class q3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.printData();

    }
}