import java.util.Scanner;

public class IncrementedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}

		System.out.println("Original array ");
        	for (int array:anArray) {
			System.out.print(array+" ");
		}
        	System.out.println();
		
		for (int i = 0; i < size; i++) {
			anArray[i] += 1;
		}

		System.out.println("Incremented array ");
		for (int array:anArray) {
			System.out.print(array+" ");
		}
		
		

	}

}
