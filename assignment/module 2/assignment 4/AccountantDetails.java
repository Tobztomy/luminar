import java.util.Scanner;

class Accountant {
	String accountantName;
	String accountantType;
	double accountantBasicSalary;
	double totalSalary;

	Accountant(String name, String type, double basicSalary) {
		accountantName = name;
		accountantType = type;
		accountantBasicSalary = basicSalary;
	}

	public void calculateTotalSalary() {
		double da = 0.10 * accountantBasicSalary;
		double hra = 0.0;

		if (accountantType.equals("full-time")) {
			hra = 0.20 * accountantBasicSalary;
		}

		totalSalary = accountantBasicSalary + da + hra;
	}

	public void showDetails() {
		System.out.println("-------------------------------");
		System.out.println("Accountant Name: " + accountantName);
		System.out.println("Type: " + accountantType);
		System.out.println("Basic Salary: " + accountantBasicSalary);
		System.out.println("Total Salary: " + totalSalary);
	}
}

public class AccountantDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		String type;
		double basicSalary;

		System.out.print("Enter Accountant Name: ");
		name = sc.nextLine();

		System.out.print("Enter Type (part-time/full-time): ");
		type = sc.nextLine().toLowerCase();

		System.out.print("Enter Basic Salary: ");
		basicSalary = sc.nextDouble();
		sc.nextLine();

		Accountant fullTime = new Accountant(name, type, basicSalary);

		System.out.print("Enter Accountant Name: ");
		name = sc.nextLine();

		System.out.print("Enter Type (part-time/full-time): ");
		type = sc.nextLine().toLowerCase();

		System.out.print("Enter Basic Salary: ");
		basicSalary = sc.nextDouble();
		sc.nextLine();
		Accountant partTime = new Accountant(name, type, basicSalary);

		fullTime.calculateTotalSalary();
		partTime.calculateTotalSalary();

		System.out.println("\nAccountant Details:");
		fullTime.showDetails();
		partTime.showDetails();

		sc.close();
	}
}
