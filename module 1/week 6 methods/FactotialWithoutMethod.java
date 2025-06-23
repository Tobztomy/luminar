package methods;

import java.util.Scanner;

public class FactotialWithoutMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int fact = 1;
		System.out.println("enter the Number");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is " + fact);
		System.out.println("Welcome");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		System.out.println("\nTo");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		System.out.println("\nLuminar");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
		System.out.println("\nKochi");
		for (int i = 1; i <= 60; i++) {
			System.out.print("*");
		}
	}

}
