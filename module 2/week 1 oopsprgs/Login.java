package oopsprgs;

import java.util.Scanner;

class Students {
	int rollNo;
	String studentName;

	public void saveDetails(int roll, String name) {
		rollNo = roll;
		studentName = name;
	}

	public void print() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + studentName);
	}
}

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll;
		String name;
		Students obj = new Students();

		System.out.println("Enter Student Details");
		System.out.println("enter the Roll No");
		roll = sc.nextInt();
		sc.nextLine();

		System.out.println("enter the Name");
		name = sc.nextLine();

		obj.saveDetails(roll, name);
		obj.print();
		sc.close();
	}

}
