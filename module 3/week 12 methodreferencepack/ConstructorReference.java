package methodreferencepack;

@FunctionalInterface
interface C {
	public Employee getEmployee();
}

@FunctionalInterface
interface D {
	public Employee getEmployee(String name, int age);
}

class Employee{
	String name;
	int age;
	
	public Employee() {//default constructor
		
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getInfo(){
		System.out.println(name+" "+age);
	}
	
}

public class ConstructorReference {

	public static void main(String[] args) {
		C c1=()->new Employee();
		c1.getEmployee().getInfo();
		
		D d1=(name,age)->new Employee(name,age);
		d1.getEmployee("tony",36).getInfo();
		
		C c2=Employee::new;
		c2.getEmployee().getInfo();
		
		D d2=Employee::new;
		d2.getEmployee("aby",56).getInfo();
		
	}

}
