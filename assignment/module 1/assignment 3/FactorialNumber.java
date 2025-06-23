
import java.util.Scanner;

public class FactorialNumber {
	public static int factorial(int num) {
		int fact=1;
		
		for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
		return fact;
	}

	public static void main(String[] args) {
		int num;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
		sc.close();
	}

}
