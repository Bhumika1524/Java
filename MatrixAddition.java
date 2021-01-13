package Matrix;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows = n.nextInt();
		System.out.println("Enter the number of columns : ");
		int cols = n.nextInt();
		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] res = new int[rows][cols];
		int i, j;
		System.out.println("Enter the elements of first matrix :");
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				matrix1[i][j] = n.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the elements of second matrix :");
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				matrix2[i][j] = n.nextInt();
			}
			System.out.println();
		}
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				res[i][j] = matrix1[i][j] + matrix2[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of matrices :");
		
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
