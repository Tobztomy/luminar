package methods;

import java.util.Scanner;

public class Factorial {
	public static void Fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is " + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter the Number");
		num = sc.nextInt();
		Fact(num);
	}

}
