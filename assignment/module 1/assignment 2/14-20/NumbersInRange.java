import java.util.Scanner;

class NumbersInRange {
    	public static void main(String[] args) {
		int start;
		int end;
        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter the start of the range ");
        	start = scanner.nextInt();

        	System.out.println("Enter the end of the range ");
        	end = scanner.nextInt();


        	System.out.println("Numbers from " + start + " to " + end + ":");
        	for (int i = start; i <= end; i++) {
            		System.out.println(i);
        	}

    	}
}
