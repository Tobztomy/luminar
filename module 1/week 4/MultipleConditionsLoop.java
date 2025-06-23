package com.luminar;

public class MultipleConditionsLoop {

	public static void main(String[] args) {
		for (int i = 1, j = 10; i <= 5 && j >= 6; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}

	}

}
