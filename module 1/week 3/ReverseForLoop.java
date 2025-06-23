import java.util.Scanner;

class ReverseForLoop {
    public static void main(String args[]) {
        int num; 
		int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number: " + reverse);
    }
}