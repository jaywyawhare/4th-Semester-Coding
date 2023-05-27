// Define an
// interface with three methods – earnings(), deductions() and bonus() and
// define a Java class „Manager‟ which uses this interface without
// implementing bonus() method. Also define another Java class „Substaff‟
// which extends from „Manager‟ class and implements bonus() method. Write
// the complete program to find out earnings, deduction and bonus of a
// sbstaff with basic salary amount entered by the user as per the
// following guidelines –
// Earnings = basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF = 12% of basic
// bonus = 50% of basic

import java.util.Scanner;

//using interface
interface Employee{
    int getSalary();
}
class Developer implements Employee{
    int basic;
    public Developer(int basic){
        this.basic = basic;
    }
    public int getSalary(){
        return basic + (basic * 0.8) + (basic * 0.15);
    }
}
class Sales implements Employee{
    int basic;
    public Sales(int basic){
        this.basic = basic;
    }
    public int getSalary(){
        return basic + (basic * 0.05);
    }
}
class Manager implements Employee{
    int basic;
    public Manager(int basic){
        this.basic = basic;
    }
    public int getSalary(){
        return basic + (basic * 0.8) + (basic * 0.15);
    }
}
class SubStaff implements Employee{
    int basic;
    public SubStaff(int basic){
        this.basic = basic;
    }
    public int getSalary(){
        return basic + (basic * 0.8) + (basic * 0.15);
    }
    public int bonus(){
        return basic + (basic * 0.5);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        int basic = sc.nextInt();
        Employee e1 = new Developer(basic);
        Employee e2 = new Sales(basic);
        Employee e3 = new Manager(basic);
        Employee e4 = new SubStaff(basic);
        System.out.println("Developer salary: "+e1.getSalary());
        System.out.println("Sales salary: "+e2.getSalary());
        System.out.println("Manager salary: "+e3.getSalary());
        System.out.println("SubStaff salary: "+e4.getSalary());
        System.out.println("SubStaff bonus: "+e4.bonus());
    }
}
