// Create an user defined exception named Check Argument to check the number of arguments
// passed through command line. If the number of arguments is less than four, throw the Check
// Argument exception, else print the addition of squares of all the four elements.

import java.util.*;
public class six {
    public static void main(String[] args) {
        try {
            CheckArgument();
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void CheckArgument() throws CheckArgumentException {
        if (args.length < 4) {
            throw new CheckArgumentException("Number of arguments should be four");
        }
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}