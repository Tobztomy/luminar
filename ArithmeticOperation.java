import java.util.Scanner;

class ArithmeticOperation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int first;
		int second;

		System.out.println("Enter a first number");
		first=sc.nextInt();

		System.out.println("Enter a second number");
		second=sc.nextInt();

		System.out.println("ARITHMETIC OPERATION");
		System.out.println("====================");
		System.out.println("first + second = "+(first+second));
		System.out.println("first - second = "+(first-second));
		System.out.println("first * second = "+(first*second));
		System.out.println("first / second = "+(first/second));

	}

}