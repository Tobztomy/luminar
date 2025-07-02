package superpack;

class Employee{
	public void printDetails() {
		System.out.println("inside Employee");
	}
}

class Accountant extends Employee{
	public void printDetails() {
		System.out.println("inside Accountant");
	}
	public void print() {
		printDetails();
		super.printDetails();
		System.out.println("Print name");
	}
}

public class SuperClassMethod {

	public static void main(String[] args) {
		Accountant ac = new Accountant();
		//ac.printDetails();
		ac.print();
		
	}

}
