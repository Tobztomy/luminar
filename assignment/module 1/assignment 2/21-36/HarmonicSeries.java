import java.util.Scanner;

class HarmonicSeries {
    	public static void main(String[] args) {
		int num;
        	double sum = 0.0;
        	Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Enter the number of terms ");
        	num = scanner.nextInt();

        	for (double i = 1; i <= num; i++) {
            		sum += 1 / i;
        	}

        	System.out.println("The sum of the harmonic series up to "+ num +" terms is "+ sum);
        
    	}
}
