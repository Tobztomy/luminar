
import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		if (num <= 1) {
            return false; 
        }
		
		for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
		return true; //prime if no divisors found
	}

	public static void main(String[] args) {
		int num;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		if (isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
		sc.close();
	}

}
