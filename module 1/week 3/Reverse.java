import java.util.Scanner;
class Reverse {
	public static void main(String args[]) {
		int num;
		int mod;
		int actualNo;
		int reverseNo=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		actualNo=num;
		
		while(num>0){
			mod=num%10;
			reverseNo=(reverseNo*10)+mod;
			num=num/10;
		}
		System.out.println(actualNo);
		System.out.println(reverseNo);

	}
}
