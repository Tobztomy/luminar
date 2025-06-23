import java.util.Scanner;

class VotingEligibility {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=scan.nextInt();
		if (age>=18) {
			System.out.println("You are Eligible to vote");

		} else {
			System.out.println("not Eligible to vote");

		}

	}

}