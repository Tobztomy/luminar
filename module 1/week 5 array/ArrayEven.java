package com.array;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
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
				System.out.println(anArray[i]);
			}
		}
	}

}
