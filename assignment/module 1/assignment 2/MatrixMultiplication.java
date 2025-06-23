import java.util.Scanner;

public class MatrixMultiplication {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		int rowOne;
		int colOne;
		int rowTwo;
		int colTwo;

        	System.out.print("Enter number of rows for Matrix 1: ");
        	rowOne = sc.nextInt();
        	System.out.print("Enter number of columns for Matrix 1: ");
        	colOne = sc.nextInt();

        	System.out.print("Enter number of rows for Matrix 2: ");
        	rowTwo = sc.nextInt();
        	System.out.print("Enter number of columns for Matrix 2: ");
        	colTwo = sc.nextInt();

        	if (colOne != rowTwo) {
            		System.out.println("Matrix multiplication is not possible. Columns of Matrix 1 must equal rows of Matrix 2.");
            		return;
        	}

        	int[][] matrixOne = new int[rowOne][colOne];
        	int[][] matrixTwo = new int[rowTwo][colTwo];
        	int[][] result = new int[rowOne][colTwo];

        	System.out.println("Enter elements of Matrix 1:");
        	for (int i = 0; i < rowOne; i++) {
            		for (int j = 0; j < colOne; j++) {
                		System.out.print("matrix1[" + i + "][" + j + "]: ");
                		matrixOne[i][j] = sc.nextInt();
            		}
        	}

        	System.out.println("Enter elements of Matrix 2:");
        	for (int i = 0; i < rowTwo; i++) {
            		for (int j = 0; j < colTwo; j++) {
                		System.out.print("matrix2[" + i + "][" + j + "]: ");
                		matrixTwo[i][j] = sc.nextInt();
            		}
        	}

        	for (int i = 0; i < rowOne; i++) {
            		for (int j = 0; j < colTwo; j++) {
                		result[i][j] = 0;
                		for (int k = 0; k < colOne; k++) {
                    			result[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                		}
            		}
        	}


		System.out.println("\nThe Matrix 1 is:");
        	for (int i = 0; i < rowOne; i++) {
            		for (int j = 0; j < colOne; j++) {
                		System.out.print(matrixOne[i][j] + "\t");
            		}
            		System.out.println(); 
        	}

		System.out.println("\nThe Matrix 2 is:");
        	for (int i = 0; i < rowTwo; i++) {
            		for (int j = 0; j < colTwo; j++) {
                		System.out.print(matrixTwo[i][j] + "\t");
            		}
            		System.out.println(); 
        	}

        	System.out.println("\nResultant Matrix after Multiplication:");
        	for (int i = 0; i < rowOne; i++) {
            		for (int j = 0; j < colTwo; j++) {
                		System.out.print(result[i][j] + "\t");
            		}
            		System.out.println();
        	}
    	}
}
