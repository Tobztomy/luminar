package oopsprgs;

import java.util.Scanner;

class Employee {
	int empId;
	String empName;
	int empSalary;

	Employee(int id, String name, int salary) {
		empId = id;
		empName = name;
		empSalary = salary;
	}

	public void print() {// only printing so variables not used therefore no arguments passed
		System.out.println(empId);// object values
		System.out.println(empName);
		System.out.println(empSalary);
	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		int salary;
		System.out.println("enter the Id");
		id = sc.nextInt();
		sc.nextLine();

		System.out.println("enter the Name");
		name = sc.nextLine();
		System.out.println("enter the salary");
		salary = sc.nextInt();
		Employee empOne = new Employee(id, name, salary);
		System.out.println("enter the Id");
		id = sc.nextInt();
		sc.nextLine();

		System.out.println("enter the Name");
		name = sc.nextLine();
		System.out.println("enter the salary");
		salary = sc.nextInt();
		Employee empTwo = new Employee(id, name, salary);
		empOne.print();
		empTwo.print();

	}

}
