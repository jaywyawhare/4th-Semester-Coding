// Write a program in
// java to input the details of a student having roll, name, full_mark and
// secured_mark as data members using constructor, then calculate the CGPA
// and display the details of student with CGPA.

import java.util.*;

class student {
    String name;
    int roll_num;
    int full_mark;
    int secured_mark;
    float cgpa;
    
    Scanner sc = new Scanner(System.in);
    student(){
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the roll number of the student");
        roll_num = sc.nextInt();
        System.out.println("Enter the full mark of the student");
        full_mark = sc.nextInt();
        System.out.println("Enter the secured mark of the student");
        secured_mark = sc.nextInt();
        cgpa = (float) secured_mark/full_mark;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_num);
        System.out.println("CGPA: " + cgpa);
    }
public class q7 {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}