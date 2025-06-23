
import java.util.Scanner;

public class HashPatternTwo {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		num = sc.nextInt();
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num-i+1;j++){
				System.out.print("#"+" ");
			}
			System.out.println(" ");
		}
			

	}

}
