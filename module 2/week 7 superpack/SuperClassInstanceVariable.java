package superpack;

class Employees{
	int empId=100;
	String empName="tobin";
}

class Accountants extends Employees{
	int empId=105;
	String empName="manu";
	
	public void print() {
		System.out.println("sub class "+empId+" "+empName);
		System.out.println("super class "+super.empId+" "+super.empName);
		
	}
}

public class SuperClassInstanceVariable {

	public static void main(String[] args) {
		Accountants ac = new Accountants();
		ac.print();
	}

}
