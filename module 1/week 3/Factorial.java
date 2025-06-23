import java.util.Scanner;
class Factorial {
	public static void main(String args[]) {
		int num;
		int fact=1;

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = scan.nextInt();
		
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
	}
}
