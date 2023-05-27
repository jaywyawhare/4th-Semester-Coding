// Define two packages as – General and Marketing. In General package
// define a class „employee‟ with data members as empid(protected),
// ename(private) and a public method as earnings() which calculate total
// earnings as earnings basic + DA (80% of basic) + HRA (15% of basic) In
// Marketing package define a class „sales‟ which is extending from
// „employee‟ class and has a method tallowance() which calculates
// Travelling Allowance as 5% of total earning. Write the programs to find
// out total earning of a sales person for the given basic salary amount
// and print along with the emp id.

import java.*;
//using package
package General;
class Employee{
    protected int empid;
    private String ename;
    public Employee(int empid, String ename){
        this.empid = empid;
        this.ename = ename;
    }
    public int getEmpid(){
        return empid;
    }
    public String getEname(){
        return ename;
    }
    public int earnings(){
        return basic + (basic * 0.8) + (basic * 0.15);
    }
}
package Marketing;
class Sales extends General.Employee{
    int basic;
    public Sales(int empid, String ename, int basic){
        super(empid, ename);
        this.basic = basic;
    }
    public int getSalary(){
        return basic + (basic * 0.05);
    }
    public int tallowance(){
        return (basic + (basic * 0.8) + (basic * 0.15)) * 0.05;
    }
}
public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empid: ");
        int empid = sc.nextInt();
        System.out.println("Enter ename: ");
        String ename = sc.next();
        System.out.println("Enter basic: ");
        int basic = sc.nextInt();
        Sales s = new Sales(empid, ename, basic);
        System.out.println("Empid: " + s.getEmpid());
        System.out.println("Ename: " + s.getEname());
        System.out.println("Basic: " + s.getSalary());
        System.out.println("Tallowance: " + s.tallowance());
    }