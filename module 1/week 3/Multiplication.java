import java.util.Scanner;
class Multiplication {
	public static void main(String args[]) {
		int startNo;
		int endNo;
		int num;

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start number :");
		startNo = scan.nextInt();
		System.out.println("Enter the end number :");
		endNo = scan.nextInt();
		System.out.println("Enter the number :");
		num = scan.nextInt();
		
		for(;startNo<=endNo;startNo++){
			System.out.println(num+" x "+startNo+" = "+(num*startNo));
		}
		
	}
}
