import java.util.Scanner;
public class test {
    public static void main(String[] args) 
    {
        parent p1;
        parent p2;
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount();
        b1.getval();
        b2.getval();
        if(b1.acc_no>b2.acc_no)
        {
            b1.dispval();

        }
        else
        {
            b2.dispval();
        }

    }
    
}

class parent{

}

class BankAccount extends parent{
    Scanner s=new Scanner(System.in);
    public int acc_no;
    String name;
    double balance;
    public void getval()
    {
        System.out.println("Enter Name");
        name = s.nextLine();
        System.out.println("Enter Acc No");
        acc_no = s.nextInt();
        System.out.println("Enter Balance");
        balance = s.nextDouble();
    }
    public void dispval()
    {
        System.out.printf("Acc No:%d\n",acc_no);
        System.out.printf("Name:%s\n",name);
        System.out.printf("Balance:%f\n",balance);
    }
}