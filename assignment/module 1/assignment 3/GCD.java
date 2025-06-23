import java.util.Scanner;

public class GCD {
    public static int findGCD(int numOne, int numTwo) {
        int gcd = 1;

        for (int i = 1; i <= numOne && i <= numTwo; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int numOne;
		int numTwo;
		int result;
		
        System.out.print("Enter first number: ");
        numOne = sc.nextInt();

        System.out.print("Enter second number: ");
        numTwo = sc.nextInt();

        result = findGCD(numOne, numTwo);

        System.out.println("GCD of " + numOne + " and " + numTwo + " is: " + result);

        sc.close();
    }
}
