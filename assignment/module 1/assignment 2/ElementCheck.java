import java.util.Scanner;

public class ElementCheck {

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
		if (count > 0) {
            		System.out.println("Element " + element + " is present and occurs " + count + " times");
        	} else {
            		System.out.println("Element " + element + " is not present in the array");
        	}
	}

}
