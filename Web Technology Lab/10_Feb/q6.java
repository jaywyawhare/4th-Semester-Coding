// Write a program in Java to define a
// class Rectangle having data member: length and breadth; to calculate the
// area and perimeter of the rectangle. Use constructor to read, and
// member functions to calculate and display.

import java.util.*;
class Reactangle {
    float length;
    float breadth;
    void Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }
    void area(){
        System.out.println("Area of rectangle is: " + length * breadth);
    }
    void perimeter(){
        System.out.println("Perimeter of rectangle is: " + 2 * (length + breadth));
    }
    public static class q6 {
        public static void main(String[] args) {
            Reactangle r = new Reactangle();
            r.area();
            r.perimeter();
        }
    }
}