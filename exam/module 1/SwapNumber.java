package exam;

import java.util.Scanner;

public class SwapNumber {

	public static void swap(int numOne,int numTwo) {
		numOne=numOne+numTwo;
		numTwo=numOne-numTwo;
		numOne=numOne-numTwo;
		System.out.println("After swapping");
		System.out.println("num one= "+numOne);
		System.out.println("num Two= "+numTwo);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOne;
		int numTwo;
		System.out.println("enter 2 numbers");
		numOne=sc.nextInt();
		numTwo=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("num one= "+numOne);
		System.out.println("num Two= "+numTwo);
		
		swap(numOne,numTwo);
		sc.close();
	}

}
