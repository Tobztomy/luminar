package com.demo;
class Student{
	private int rollNo=34;
	float salary=34500.0f;
	protected String skills="java";
	public String name="tobin";
	
	private void print() {
		System.out.println("hi");
	}
	
	void display() {
		System.out.println("hello");
	}
	protected void show() {
		print();
		System.out.println("hai");
	}
	public void value() {
		System.out.println("luminar");
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.display();
		s.show();
		s.value();
		
		
		System.out.println(s.salary);
		System.out.println(s.skills);
		System.out.println(s.name);
	}

}
