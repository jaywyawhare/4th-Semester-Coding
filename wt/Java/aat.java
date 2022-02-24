//find A*At for a matrix

import java.util.Scanner;

public class aat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();
        double[][] matrix = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Your matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double[][] transpose = new double[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        //multiply the two matrices
        double[][] product = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                product[i][j] = 0;
                for (int k = 0; k < row; k++) {
                    product[i][j] += matrix[i][k] * transpose[k][j];
                }
            }
        }
        System.out.println("Product: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

}