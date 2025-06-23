import java.util.Scanner;

public class MatrixTranspose {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		int rows;
		int cols;
        	System.out.print("Enter number of rows: ");
        	rows = sc.nextInt();
        	System.out.print("Enter number of columns: ");
        	cols = sc.nextInt();

        	int[][] matrix = new int[rows][cols];
        	int[][] transpose = new int[cols][rows];

        	System.out.println("Enter the elements of the matrix:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print("matrix[" + i + "][" + j + "]: ");
                		matrix[i][j] = sc.nextInt();
            		}
        	}

        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		transpose[j][i] = matrix[i][j];
            		}
        	}

		System.out.println("\nThe original Matrix is:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print(matrix[i][j] + "\t");
            		}
            		System.out.println(); 
        	}

        	System.out.println("\nTransposed Matrix:");
        	for (int i = 0; i < cols; i++) {
            		for (int j = 0; j < rows; j++) {
                		System.out.print(transpose[i][j] + "\t");
            		}
            		System.out.println();
        	}
    	}
}
