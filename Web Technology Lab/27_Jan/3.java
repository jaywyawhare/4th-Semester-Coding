//  Program to print the corresponding week day for the given day no. of the
// current month using switch..case statement in Java

import java.util.Scanner;
public class 3 {
    public static void main(String args[]){
          int day;
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter a weekday number (0 to 6): ");
          day=SC.nextInt();
           
          if(day<0 || day>6){
              System.out.println("Invalid weekday number.");
              System.exit(0);
          }
           
          switch(day){
                case 0: 
                    System.out.println("Sunday");
                    break;
                case 1: 
                    System.out.println("Monday");
                    break;
                case 2: 
                    System.out.println("Tuesday");
                    break;
                case 3: 
                    System.out.println("Wednesday");
                    break;
                case 4: 
                    System.out.println("Thursday");
                    break;
                case 5: 
                    System.out.println("Friday");
                    break;
                case 6: 
                    System.out.println("Saturday");
                    break;                  
                default:
                    System.out.println("Invalid");
                    break;                  
          }
      }
}
