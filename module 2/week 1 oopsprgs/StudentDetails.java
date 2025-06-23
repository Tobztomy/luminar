package oopsprgs;

class Student {
	int rollNo;
	String name;

	Student() {// constructor
		System.out.println("hi");
	}

	Student(int x) {// constructor
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.name + " " + obj.rollNo);
	}

}
