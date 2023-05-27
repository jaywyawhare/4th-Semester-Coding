// Write a Java program to illustrate try..catch..finally block.


public class three {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println(a[5]);
        } 
    }
}