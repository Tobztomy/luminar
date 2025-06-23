package methods;

import java.util.Scanner;

public class Reverse {
	public static void reverseNo(int num) {
		int mod;
		int no=0;
		
		while(num>0){
			mod=num%10;
			no=(no*10)+mod;
			num=num/10;
		}
		System.out.println("Reversed number is "+no);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		System.out.println("Actual Number is "+num);
		reverseNo(num);
		sc.close();
	}

}
