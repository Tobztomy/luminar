
import java.util.Scanner;

public class PalindromeNumber {
	public static boolean checkPalindrome(int num) {
		int original=num;
		int reverse=0;
		int digit;
		
		while(num>0){
			digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
		}
		return original == reverse;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		if (checkPalindrome(num)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }
		sc.close();
	}

}
