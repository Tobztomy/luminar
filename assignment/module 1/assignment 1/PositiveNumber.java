import java.util.Scanner;

class PositiveNumber {
	public static void main(String args[]) {
	double number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextDouble();

        if (number > 0) {
		System.out.println(number + " is a positive number");
        } else if (number < 0) {
		System.out.println(number + " is a negative number");
        } else {
		System.out.println("The number is zero");
        }

    }
}
