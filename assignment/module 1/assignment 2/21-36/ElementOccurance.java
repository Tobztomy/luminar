import java.util.Scanner;

public class ElementOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int element;
		int count=0;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element to count occurrences of ");
        	element = sc.nextInt();

		for (int num:anArray) {
			if (num==element){
				count++;
			}
		}
		System.out.println("Element " + element + " occurs " + count + " times in the array");

	}

}
