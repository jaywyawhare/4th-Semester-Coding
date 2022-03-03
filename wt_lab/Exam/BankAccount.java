// Define a class BankAccount having data members: acc_no, name
// and balance. Define appropriate methods to initialize and display the
// values of these data members. Input values for two objects and determine
// who is having more balance in his/her account. Implement it using
// runtime polymorphism.

import java.util.*;

public class BankAccount {
    int acc_no;
    String name;
    double balance;

    public void setData(int acc_no, String name, double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void display() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        b1.input();
        b2.input();
        b1.display();
        b2.display();
        if (b1.balance > b2.balance) {
            System.out.println("" + b1.name + " is having more balance");
        } else if (b1.balance < b2.balance) {
            System.out.println("" + b2.name + " is having more balance");
        } else {
            System.out.println("Both are having same balance");

        }
    }

    
}