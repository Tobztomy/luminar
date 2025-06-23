//function without arguments and without return value
package methods;

public class PrintingDemo {
	public static void printStar() {
		for (int i = 1; i <= 60; i++) {//called method without return value
			System.out.print("*");
		}
	}

	public static void main(String[] args) {//calling method without arguments
		System.out.println("Welcome");
		printStar();
		System.out.println("\nTo");
		printStar();
		System.out.println("\nLuminar");
		printStar();
		System.out.println("\nKochi");
		printStar();
	}

}
