import java.util.Scanner;

class MultiplicationTable {
	public static void main(String[] args) {
		int number;
		int start;
		int end;
		Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter the number");
        	number = scanner.nextInt();

        	System.out.println("Enter the start of the range ");
        	start = scanner.nextInt();

        	System.out.println("Enter the end of the range ");
        	end = scanner.nextInt();


        	for (int i = start; i <= end; i++) {
            		System.out.println(number + " x " + i + " = " + (number * i));
        	}

    	}
}
