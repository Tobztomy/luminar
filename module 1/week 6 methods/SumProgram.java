//function with arguments and without return value

package methods;

import java.util.Scanner;

public class SumProgram {
	public static void sum(int firstNo, int secondNo) {// parameters
		System.out.println("sum = " + (firstNo + secondNo));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNo;
		int secondNo;
		System.out.println("enter 2 nos");
		firstNo = sc.nextInt();
		secondNo = sc.nextInt();
		sum(firstNo, secondNo);
		sc.close();
	}

}
