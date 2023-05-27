// Write a Java class which has a method called ProcessInput(). This method checks the number
// entered by the user. If the entered number is negative then throw an user defined exception called
// NegativeNumberException, otherwise it displays the double value of the entered number.

import java.util.*;
public class four {
    public static void main(String[] args) {
        try {
            ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void ProcessInput() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        System.out.println(number * 2);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }    
}