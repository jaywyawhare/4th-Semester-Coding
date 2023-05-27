// Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch
// statement.


public class one {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        }
        System.out.println(a[5]);
    }
}