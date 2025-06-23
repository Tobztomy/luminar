import java.util.Scanner;

class ScannerMethodsDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int rollNo;
		String studentName;
		char divison;
		float marks;
		double fees;
		String teacherName;

		System.out.println("Enter a roll No");
		rollNo=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter a student Name");
		studentName=sc.nextLine();

		System.out.println("Enter divison");
		divison=sc.next().charAt(0);

		System.out.println("Enter a mark");
		marks=sc.nextFloat();

		System.out.println("Enter fees");
		fees=sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter Teacher Name");
		teacherName=sc.nextLine();

		System.out.println("roll no "+rollNo);
		System.out.println("student name "+studentName);				System.out.println("divison "+divison);						System.out.println("marks "+marks);						System.out.println("fees "+fees);
		System.out.println("Teacher name "+teacherName);


	}

}