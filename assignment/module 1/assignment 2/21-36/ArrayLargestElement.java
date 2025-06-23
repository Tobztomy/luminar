import java.util.Scanner;

public class ArrayLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int largest;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		largest = anArray[0];
		for (int i = 0; i < size; i++) {
			if (anArray[i] > largest) {
			largest=anArray[i];
			}
		}
		System.out.println("Largest element is " + largest);
		

	}

}
