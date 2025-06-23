import java.util.Scanner;

class BusDriver {
	String busName;
	String busNumber;
	static int driverCount = 0;

	BusDriver(String name, String number) {
		busName = name;
		busNumber = number;
		driverCount++;
	}

	public void displayDetails() {
		System.out.println("--------------------------");
		System.out.println("Driver Name: " + busName);
		System.out.println("Bus Number: " + busNumber);
	}
}

public class BusDriverDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		String number;

		System.out.println("Enter details for Driver 1:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Bus Number: ");
		number = sc.nextLine();
		BusDriver driverOne = new BusDriver(name, number);

		System.out.println("Enter details for Driver 2:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Bus Number: ");
		number = sc.nextLine();
		BusDriver driverTwo = new BusDriver(name, number);

		System.out.println("\nDriver Details:");
		driverOne.displayDetails();
		driverTwo.displayDetails();

		System.out.println("--------------------------");
		System.out.println("Total number of drivers created: " + BusDriver.driverCount);

		sc.close();
	}
}
