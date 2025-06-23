
import java.util.Scanner;

public class ArraySum{
	public static int calculateSum(int[] array, int size) {
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
            sum += array[i];
        }
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalSum;
		
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        totalSum = calculateSum(array, size);
        System.out.println("Sum of array elements is: " + totalSum);

	}
}
