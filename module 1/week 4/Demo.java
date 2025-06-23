package com.luminar;

import java.util.Scanner;

class Receptionist {
	String ReceptionistName;
	static String shift;

	Receptionist(String name) {
		ReceptionistName = name;
	}

	public void greetVisitor(String visitorName) {
		System.out.println("Hello " + visitorName + ", welcome! I am " + ReceptionistName + ", your receptionist.");
	}

	static void displayShift() {
		System.out.println("Current Shift: " + shift);
	}
}

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String visitorName;
		System.out.print("Enter the shift for all receptionists(Morning/Evening): ");
		Receptionist.shift = sc.nextLine();

		System.out.print("Enter Receptionist's Name: ");
		name = sc.nextLine();

		Receptionist receptionist = new Receptionist(name);

		System.out.print("Enter Visitor's Name: ");
		visitorName = sc.nextLine();

		receptionist.greetVisitor(visitorName);
		Receptionist.displayShift();

		sc.close();
	}
}
