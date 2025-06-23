package com.luminar;

import java.util.Scanner;

public class ReverseSumDigits {

	public static void main(String[] args) {
		int num;
		int mod;
		int actualNo;
		int sum = 0;
		int reverseNo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		actualNo = num;
		while (num > 0) {
			mod = num % 10;
			reverseNo = reverseNo * 10 + mod;
			sum = sum + mod;
			num = num / 10;

		}
		System.out.println("actual no "+actualNo);
		System.out.println("reverse no "+reverseNo);
		System.out.println("sum " + sum);

	}

}
