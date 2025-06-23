import java.util.Scanner;
class ReverseNumber {
	public static void main(String args[]) {
		int num;
		int mod;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		
		while(num>0){
			mod=num%10;
			System.out.print(mod);
			num=num/10;
		}

	}
}
