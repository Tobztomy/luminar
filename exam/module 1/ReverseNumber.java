package exam;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int digit;
		
		int reverse=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		int original =num;
		while(num>0) {
			digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
			
		}
		System.out.println("original no: "+original);
		System.out.println("Reverse no: "+reverse);
		
	}

}
