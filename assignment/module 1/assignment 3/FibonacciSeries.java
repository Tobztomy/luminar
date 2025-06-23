
import java.util.Scanner;

public class FibonacciSeries {
	public static void printFibonacci(int num) {
		int a = 0;
		int b = 1;
		
		System.out.println("Fibonacci Series: ");
		for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		num = sc.nextInt();
		if (num <= 0) {
            System.out.println("Please enter a positive number");
        } else {
            printFibonacci(num);
        }
	}

}
