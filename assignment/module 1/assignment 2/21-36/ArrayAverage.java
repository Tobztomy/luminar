import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int sum=0;
		double average;
		System.out.println("enter the size");
		size = sc.nextInt();
		int[] anArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		for (int array:anArray) {
			sum+=array;
		}
		average=(double) sum/size;
		System.out.println("sum of Array elements is "+ sum);
		System.out.println("Average of Array elements is "+ average);
	}

}
