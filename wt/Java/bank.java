// bank System

import java.util.*;
public class bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private float interestRate;

    public bank(int accountNumber, double balance, String customerName, float interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public float getInterestRate() {
        return interestRate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter customer name: ");
        String customerName = input.next();
        System.out.println("Enter initial balance: ");
        double balance = input.nextDouble();
        System.out.println("Enter interest rate: ");
        float interestRate = input.nextFloat();
        bank mybank = new bank(accountNumber, balance, customerName, interestRate);
        System.out.println("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        mybank.deposit(depositAmount);
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        mybank.withdraw(withdrawAmount);
        System.out.println("The balance is: " + mybank.getBalance());
        System.out.println("The customer name is: " + mybank.getCustomerName());
        System.out.println("The interest rate is: " + mybank.getInterestRate());     
    }
}