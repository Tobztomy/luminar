package methods;

import java.util.Scanner;

public class Swap {

	public static void SwapNo(int firstNo, int secondNo) {// parameters
		firstNo = firstNo + secondNo;
		secondNo = firstNo - secondNo;
		firstNo = firstNo - secondNo;
		System.out.println("After swapping");
		System.out.println("num one " + firstNo);
		System.out.println("num Two " + secondNo);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNo;
		int secondNo;
		System.out.println("enter 2 nos");
		firstNo = sc.nextInt();
		secondNo = sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("num one " + firstNo);
		System.out.println("num Two " + secondNo);
		SwapNo(firstNo, secondNo);
	}

}
