import java.util.Scanner;

public class StudentAge {

	public static void main(String[] args) {
		int[] age = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("enter the age of students");
			age[i] = sc.nextInt();
		}
		System.out.println("Age of 5 students are ");
		for (int i = 0; i < 5; i++) {
			System.out.println(age[i]);
		}

	}

}
