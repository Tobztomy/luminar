import java.util.Scanner;

public class MatrixDisplay {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		int rows;
		int cols;
        	System.out.print("Enter number of rows: ");
        	rows = sc.nextInt();
        	System.out.print("Enter number of columns: ");
        	cols = sc.nextInt();

        	int[][] matrix = new int[rows][cols];

        	System.out.println("Enter the elements of the matrix:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print("Element [" + i + "][" + j + "]: ");
                		matrix[i][j] = sc.nextInt();
            		}
        	}

        	System.out.println("\nThe Matrix is:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print(matrix[i][j] + "\t");
            		}
            		System.out.println(); 
        	}
    	}
}
