import java.util.Scanner;
class MultiplicationTable {
	public static void main(String args[]) {
		int startNo;
		int endNo;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start number :");
		startNo = sc.nextInt();
		System.out.print("Enter the End number :");
		endNo = sc.nextInt();
		System.out.print("Enter the number :");
		num = sc.nextInt();
		
		while(startNo<=endNo){
			System.out.println(startNo+"x"+num+"="+(startNo*num));
			startNo++;
		}
	}
}
