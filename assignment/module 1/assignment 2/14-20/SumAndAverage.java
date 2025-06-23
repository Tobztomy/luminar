import java.util.Scanner;

class SumAndAverage {
    	public static void main(String[] args) {
		int start;
		int end;
        	int sum = 0;
        	int count = 0;
        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter the start of the range ");
        	start = scanner.nextInt();

        	System.out.println("Enter the end of the range ");
        	end = scanner.nextInt();



        	for (int i = start; i <= end; i++) {
            		sum =sum + i;
            		count++;
        	}

        	double average = (double) sum / count;

        	System.out.println("The sum of " + start + " to " + end + " is " + sum);
        	System.out.println("The average is " + average);


    	}
}
