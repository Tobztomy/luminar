package oopssampleprogram;

class Tata {
	public void enquiry() {
		System.out.println("enquiry for a new car");
	}
}

class Tiago extends Tata {
	// override
	public void enquiry() {
		System.out.println("enquiry for a new trendy car");
	}

	public int quote(int onRoadPrice, int discount) {
		return onRoadPrice - discount;
	}

	// overload
	public double quote(double onRoadPrice, double discount) {
		return onRoadPrice - discount;
	}
}

//encapsulation
class Owner {
	private String name;

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}
}

//Abstraction

abstract class TestDrive {
	public abstract void run();

	void preBooked() {
		System.out.println("Booked for Test drive");
	}
}

class Test extends TestDrive {
	public void run() {
		System.out.println("car is running");
	}
}

//Interface Abstraction
interface VehicleInsurance {
	int numberOfYears = 15; // static final

	public abstract void insurance();
}

interface VehiclePollution {
	public abstract void pollutionCertificate();
}

class RCBook implements VehicleInsurance, VehiclePollution {
	public void insurance() {
		System.out.println("Insurance paid for " + numberOfYears + " years");
	}

	public void pollutionCertificate() {
		System.out.println("pollution test conducted");
	}
}

public class MainClass {

	public static void main(String[] args) {
		Tata tata = new Tata();
		tata.enquiry();
		Tiago tiago = new Tiago();
		tiago.enquiry();
		System.out.println("Tiago variant x2 quote amount = " + tiago.quote(60000, 4500));
		System.out.println("Tiago variant x2+ quote amount = " + tiago.quote(72000.00, 4000.00));

		Owner owner = new Owner();
		owner.setName("tobin");
		System.out.println("Name : " + owner.getName());

		Test test = new Test();
		test.preBooked();
		test.run();

		RCBook rcBook = new RCBook();
		rcBook.insurance();
		rcBook.pollutionCertificate();

	}

}
