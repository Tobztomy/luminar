package polymorphismpack;

class Employees {
	public void duty(String str) {
		System.out.println("employee is responsible to do" + str);
	}
}

class Accountant extends Employees {
	double salary;

	Accountant(double salary) {
		this.salary = salary;
	}

	public void duty(String str) {
		System.out.println("Accountant is responsible to do " + str);
		System.out.println("Accountant salary is " + salary);
	}
}

class Manager extends Employees {
	double salary;
	double increment;

	Manager(double salary,double increment) {
		this.salary = salary;
		this.increment=increment;
	}

	public void duty(String str) {
		System.out.println("Manager is responsible to do " + str);
		System.out.println("Manager salary is " + salary);
		System.out.println("Manager increment is " + increment);
		System.out.println("total salary "+(salary+increment));
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		Employees emp1 = new Accountant(2500.25);//late binding
		emp1.duty("accounts");
		Employees emp2 = new Manager(2500.25,250.00);//late binding
		emp2.duty("management");
	}

}
