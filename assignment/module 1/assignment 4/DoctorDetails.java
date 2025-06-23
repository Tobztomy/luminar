import java.util.Scanner;

class Doctor {
	String doctorName;
	String doctorSpecialization;
	int doctorExperience;
	double doctorBasicPay;
	double da;
	double hra;
	double totalSalary;

	Doctor(String name, String specialization, int experience, double basicPay) {
		doctorName = name;
		doctorSpecialization = specialization;
		doctorExperience = experience;
		doctorBasicPay = basicPay;
	}

	public void calculateTotalSalary() {
		da = 0.10 * doctorBasicPay;
		hra = 0.20 * doctorBasicPay;
		totalSalary = doctorBasicPay + da + hra;
	}

	public void showDetails() {
		System.out.println("-----------------------------");
		System.out.println("Doctor Name: " + doctorName);
		System.out.println("Specialization: " + doctorSpecialization);
		System.out.println("Experience: " + doctorExperience + " years");
		System.out.println("Basic Pay: " + doctorBasicPay);
		System.out.println("Dearness Allowance (DA): " + da);
		System.out.println("House Rent Allowance (HRA): " + hra);
		System.out.println("Total Salary (with DA + HRA): " + totalSalary);

	}
}

public class DoctorDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String specialization;
		int experience;
		double basicPay;

		System.out.print("Enter Doctor Name: ");
		name = sc.nextLine();

		System.out.print("Enter Specialization: ");
		specialization = sc.nextLine();

		System.out.print("Enter Years of Experience: ");
		experience = sc.nextInt();

		System.out.print("Enter Basic Pay: ");
		basicPay = sc.nextDouble();
		sc.nextLine();

		Doctor doctorOne = new Doctor(name, specialization, experience, basicPay);

		System.out.print("Enter Doctor Name: ");
		name = sc.nextLine();

		System.out.print("Enter Specialization: ");
		specialization = sc.nextLine();

		System.out.print("Enter Years of Experience: ");
		experience = sc.nextInt();

		System.out.print("Enter Basic Pay: ");
		basicPay = sc.nextDouble();
		sc.nextLine();

		Doctor doctorTwo = new Doctor(name, specialization, experience, basicPay);

		doctorOne.calculateTotalSalary();
		doctorOne.showDetails();
		doctorTwo.calculateTotalSalary();
		doctorTwo.showDetails();

		sc.close();
	}
}
