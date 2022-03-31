// Write a program to create user defined exceptions called HrsException, MinException and
// SecException. Create a class Time which contains data members hours, minutes, seconds and throw
// the
// user defined exceptions if hours(&gt;24 &amp; &lt;0),
// minutes(&gt;60 &amp; &lt;0), seconds(&gt;60 &amp;
// &lt;0).

import java.util.*;
public class five {
    public static void main(String[] args) {
        try {
            Time time = new Time(24, 60, 60);
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinException e) {
            System.out.println(e.getMessage());
        } catch (SecException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ProcessInput() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        int hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new HrsException("Hours should be between 0 and 24");
        }
        System.out.println("Enter minutes");
        int minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Minutes should be between 0 and 60");
        }
        System.out.println("Enter seconds");
        int seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Seconds should be between 0 and 60");
        }
    }
}