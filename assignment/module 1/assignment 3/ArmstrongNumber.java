
import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean checkArmstrong(int num) {
		int original=num;
		int result=0;
		int digit;
		
		while(num>0){
			digit = num % 10;
            result = result + (digit * digit * digit);
            num /= 10;
		}
		return result == original;//returns true or false
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		if (checkArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
		sc.close();
	}

}
