import java.util.Scanner;

class Student {
	int rollNo;
	String studentName;
	String courseName;

	public void saveDetails(int roll, String name, String course) {
		rollNo = roll;
		studentName = name;
		courseName = course;
	}

	public void displayDetails() {
		System.out.println("------------------------");
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Name: " + studentName);
		System.out.println("Course: " + courseName);
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll;
		String name;
		String course;
		System.out.print("Enter Roll Number: ");
		roll = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		name = sc.nextLine();

		System.out.print("Enter Course: ");
		course = sc.nextLine();

		Student studentOne = new Student();
		studentOne.saveDetails(roll, name, course);

		System.out.print("Enter Roll Number: ");
		roll = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		name = sc.nextLine();

		System.out.print("Enter Course: ");
		course = sc.nextLine();

		Student studentTwo = new Student();
		studentTwo.saveDetails(roll, name, course);
		
		studentOne.displayDetails();
		studentTwo.displayDetails();

		sc.close();
	}
}
