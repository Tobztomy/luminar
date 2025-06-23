import java.util.Scanner;

public class SortedElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int temp;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		
		System.out.print("Original Array ");
		for (int array:anArray) {
			System.out.print(array+" ");
		}
		
		for (int i = 0; i < size - 1; i++) {
            		for (int j = 0; j < size - i - 1; j++) {
                		if (anArray[j] > anArray[j + 1]) {
                    			temp = anArray[j];
                    			anArray[j] = anArray[j + 1];
                    			anArray[j + 1] = temp;
                		}
            		}
       		}

		System.out.println("\nSorted array in ascending order");
		for (int array:anArray) {
			System.out.print(array+" ");
		}

	}

}
