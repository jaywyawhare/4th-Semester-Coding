// In an online application, a university would like to validate the university seat number (USN)
// entered by its student.
// Example: A sample USN looks like: 1DS09CS010
// Following are the constraints to enter registration number:
//     · Each USN must be length of 10 characters and the letters must be in upper case
//     · 1st character must be digit and have value either '1' or '2'
//     · 6th and 7th characters must be upper case letters and can have combination any of following substring: CS, IS,EC and ME
//     · 8th,9th and 10th characters must be digits and can have values between 0-9
    
// Create class called TestUSN which has main() method to initialize USN variable
// with string value,  validate USN against above constraints and print
// "Success" or "Failure" message based on result of validation

import java.util.Scanner;
import java.util.regex.Matcher;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USN: ");
        String usn = sc.nextLine();
        System.out.println("USN: " + usn);
        System.out.println("USN Validation Result: " + validateUSN(usn));
    }
    
    public static String validateUSN(String usn) {
        String regex = "^[1-2][A-Z][A-Z][0-9][A-Z][A-Z][0-9][0-9][0-9][0-9]$";
        Matcher matcher = Pattern.compile(regex).matcher(usn);
        if (matcher.matches()) {
            return "Success";
        } else {
            return "Failure";
        }
    }
}