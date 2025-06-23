import java.util.Scanner;

public class MatrixSubstration {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		int rows;
		int cols;

        	System.out.print("Enter number of rows: ");
        	rows = sc.nextInt();
        	System.out.print("Enter number of columns: ");
        	cols = sc.nextInt();

        	int[][] matrixOne = new int[rows][cols];
        	int[][] matrixTwo = new int[rows][cols];
        	int[][] difference = new int[rows][cols];

        	System.out.println("Enter elements of Matrix 1:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print("matrix1[" + i + "][" + j + "]: ");
                		matrixOne[i][j] = sc.nextInt();
            		}
        	}

        	System.out.println("Enter elements of Matrix 2:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print("matrix2[" + i + "][" + j + "]: ");
                		matrixTwo[i][j] = sc.nextInt();
            		}
        	}

        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		difference[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            		}
        	}

		System.out.println("\nThe Matrix 1 is:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print(matrixOne[i][j] + "\t");
            		}
            		System.out.println(); 
        	}

		System.out.println("\nThe Matrix 2 is:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print(matrixTwo[i][j] + "\t");
            		}
            		System.out.println(); 
        	}


        	System.out.println("\nResultant Matrix after Subtraction:");
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		System.out.print(difference[i][j] + "\t");
            		}
            		System.out.println();
        	}
    	}
}
