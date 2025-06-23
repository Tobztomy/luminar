package com.array;

import java.util.Scanner;

public class ArrayGreatestElement {

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
		int greatest = anArray[0];
		for (int i = 0; i < size; i++) {
			if (anArray[i] > greatest) {
			greatest=anArray[i];
			}
		}
		System.out.println("greatest element is " + greatest);
		

	}

}
