import java.util.Scanner;

class SumofOddEven {
    	public static void main(String[] args) {
		int start;
		int end;
        	int sumEven = 0;
        	int sumOdd = 0;
        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter the start of the range ");
        	start = scanner.nextInt();

        	System.out.println("Enter the end of the range ");
        	end = scanner.nextInt();

        	for (int i = start; i <= end; i++) {
            		if (i % 2 == 0) {
                		sumEven += i;
            		} else {
                		sumOdd += i;
            		}
       		 }

      
        	System.out.println("Sum of even numbers from " + start + " to " + end + " is: " + sumEven);
        	System.out.println("Sum of odd numbers from " + start + " to " + end + " is: " + sumOdd);

    	}
}
