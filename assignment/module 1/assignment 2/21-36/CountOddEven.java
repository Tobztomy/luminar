import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int oddNumbers=0;
		int evenNumbers=0;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		System.out.println("even elements are ");
		for (int i = 0; i < size; i++) {
			if (anArray[i] % 2 == 0) {
				evenNumbers+=1;
			} else{
				oddNumbers+=1;
			}
		}
		System.out.println("Number of odd elements are "+ oddNumbers);
		System.out.println("Number of even elements are "+ evenNumbers);
	}

}
