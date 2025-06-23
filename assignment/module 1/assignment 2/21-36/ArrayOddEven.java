import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int oddSum=0;
		int evenSum=0;
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
				evenSum+=anArray[i];
			} else{
				oddSum+=anArray[i];
			}
		}
		System.out.println("sum of odd elements are "+ oddSum);
		System.out.println("sum of even elements are "+ evenSum);
	}

}
