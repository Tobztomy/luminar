//function with arguments and with return value

package methods;

import java.util.Scanner;

public class SumDemo {//called method with return value
	public static int sum(int firstNo,int secondNo) {//parameters
		//int result;
		//result = firstNo+secondNo;
		//return result;
		return firstNo+secondNo;
	}

	public static void main(String[] args) {//calling method with arguments
		Scanner sc = new Scanner(System.in);
		int firstNo;
		int secondNo;
		//int result;
		System.out.println("enter 2 nos");
		firstNo = sc.nextInt();
		secondNo = sc.nextInt();
		//result =sum(firstNo,secondNo);//arguments->acutal value
		//System.out.println(result);
		System.out.println("sum = "+sum(firstNo,secondNo));
		sc.close();
	}

}
