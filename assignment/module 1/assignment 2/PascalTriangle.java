import java.util.Scanner;

public class PascalTriangle {
    	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
		int rows;

        	System.out.print("Enter the number of rows for Pascal's Triangle ");
        	rows = scanner.nextInt();

        	for (int i = 0; i < rows; i++) {
			int number = 1;

            		for (int j = 0; j < rows - i - 1; j++) {
                		System.out.print(" ");
            		}


            		for (int j = 0; j <= i; j++) {
                		System.out.print(number + " ");
                		number = number * (i - j) / (j + 1);
            		}
            		System.out.println();
        	}

    	}
}
