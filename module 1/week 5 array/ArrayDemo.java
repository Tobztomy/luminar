package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] anArray = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 3; i < 5; i++) {
			System.out.println("enter the no");
			anArray[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(anArray[i]);
		}

	}

}
