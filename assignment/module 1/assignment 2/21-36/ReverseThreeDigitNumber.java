import java.util.Scanner;

class ReverseThreeDigitNumber {
    	public static void main(String[] args) {
		int num;
		int digit;
		int reverse=0;
		int actualNum;
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a 3-digit number ");
        	num = sc.nextInt();
		actualNum=num;

        	if (num >= 100 && num <= 999) {
			while (num > 0) {
                		digit = num % 10;
                		reverse = reverse * 10 + digit;
                		num /= 10;
            			}
				System.out.println("Actual number: " + actualNum);
            			System.out.println("Reversed number: " + reverse);	
        	} else {
            		System.out.println("Please enter a 3-digit number");
        	}
    	}
}
