
import java.util.Scanner;

public class MaximumInArray {
	public static int findMax(int[] array, int size) {
		int max = array[0];
		
		for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxElement;
		int size;
		
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        maxElement = findMax(array,size);
        System.out.println("Maximum element in the array is: " + maxElement);

	}
}
