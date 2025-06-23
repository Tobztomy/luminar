import java.util.Scanner;

public class ArraySmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int smallest;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		smallest = anArray[0];
		for (int i = 0; i < size; i++) {
			if (anArray[i] < smallest) {
			smallest=anArray[i];
			}
		}
		System.out.println("Smallest element is " + smallest);
		

	}

}
