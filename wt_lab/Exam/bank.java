// Define a class BankAccount having data members: acc_no, name
// and balance. Define appropriate methods to initialize and display the
// values of these data members. Input values for two objects and determine
// who is having more balance in his/her account. Implement it using
// runtime polymorphism.

public class bank {
    int acc_no;
    String name;
    double balance;

    public void setData(int acc_no, String name, double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        bank b1 = new bank();
        bank b2 = new bank();
        b1.setData(101, "Raj", 10000);
        b2.setData(102, "Raju", 20000);
        b1.display();
        b2.display();
        if (b1.balance > b2.balance) {
            System.out.println("Raju is having more balance");
        } else if (b1.balance < b2.balance) {
            System.out.println("Raj is having more balance");
        } else {
            System.out.println("Both are having same balance");
        }
    }
}