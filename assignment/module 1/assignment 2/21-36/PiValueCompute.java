import java.util.Scanner;

class PiValueCompute {
    	public static void main(String[] args) {
		int terms;
        	double pi = 0.0;

        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter the number of terms: ");
        	terms = scanner.nextInt();

        	for (double i = 0; i < terms; i++) {
            		if (i % 2 == 0) {
                		pi += 1 / (2 * i + 1);
            	} else {
                	pi -= 1 / (2 * i + 1);
            		}
        	}

        	pi *= 4;

        	System.out.println("Value of pi using "+terms+" is "+ pi);

   	 }
}
