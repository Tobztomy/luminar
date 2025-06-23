import java.util.Scanner;

class StudentGrade {
	public static void main(String args[]) {
	int marks;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
		System.out.println("Grade: A");
        } else if (marks >= 80 && marks <= 89) {
		System.out.println("Grade: B");
        } else if (marks >= 70 && marks <= 79) {
		System.out.println("Grade: C");
        } else if (marks >= 60 && marks <= 69) {
		System.out.println("Grade: D");
        } else {
		System.out.println("Grade: F");
        }

    }
}
