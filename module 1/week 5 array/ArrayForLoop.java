package com.array;

import java.util.Scanner;

public class ArrayForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mark = new int[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("enter the marks");
				mark[i][j] = sc.nextInt();
			}
		}
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 2; j++) {
		 * System.out.println(mark[i][j]);
		 * 
		 * } }
		 */

		for (int[] rowValue : mark) {
			for (int colValue : rowValue) {
				System.out.print(colValue + "\t");
			}
			System.out.println("");
		}
	}
}
