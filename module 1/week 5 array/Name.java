package com.array;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("enter the size");
		size = sc.nextInt();
		sc.nextLine();
		String[] names = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the names");
			names[i] = sc.nextLine();
		}
		System.out.println(names.length);
		System.out.println("Names are: ");
		for (String str : names) {
			System.out.println(str);
		}

	}

}
