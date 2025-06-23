import java.util.Scanner;
class ReverseNo {
	public static void main(String args[]) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		
		while(num>0){
			System.out.print(num%10);
			num=num/10;
		}

	}
}
