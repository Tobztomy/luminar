import java.util.Scanner;

class Teacher {
	int teacherId;
	String teacherName;
	static String department = "MCA";

	Teacher(int id, String name) {
		teacherId = id;
		teacherName = name;
	}

	public void displayDetails() {
		System.out.println("------------------------");
		System.out.println("Teacher ID: " + teacherId);
		System.out.println("Teacher Name: " + teacherName);
		System.out.println("Department: " + department);
	}
}

public class TeacherDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name;

		System.out.print("Enter Teacher ID: ");
		id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Teacher Name: ");
		name = sc.nextLine();

		Teacher teacherOne = new Teacher(id, name);

		System.out.print("Enter Teacher ID: ");
		id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Teacher Name: ");
		name = sc.nextLine();

		Teacher teacherTwo = new Teacher(id, name);

		teacherOne.displayDetails();
		teacherTwo.displayDetails();

		sc.close();
	}
}
