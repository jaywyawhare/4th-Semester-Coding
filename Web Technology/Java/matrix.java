//read a matrix and display it using user input

import java.util.Scanner;
public class matrix {
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
	}
}