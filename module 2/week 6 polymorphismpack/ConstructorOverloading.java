package polymorphismpack;
class Employee{
	int id;
	float salary;
	int age;
	double experience;
	Employee(){
		
	}
	Employee(int id,float salary,int age){
		this.id=id;
		this.salary=salary;
		this.age=age;
	}
	
	Employee(int id,float salary,double experience){
		this.id=id;
		this.salary=salary;
		this.experience=experience;
	}
	
	Employee(int id,float salary){
		this.id=id;
		this.salary=salary;
	}
	
	Employee(int id,int age,double experience){
		this.id=id;
		this.age=age;
		this.experience=experience;
	}

	public void print() {
		System.out.println("Employee [id=" + id + ", salary=" + salary + ", age=" + age + ", experience=" + experience + "]");
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", age=" + age + ", experience=" + experience + "]";
	}
	
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee empOne = new Employee(12,25000.0f,36);
		Employee empTwo = new Employee(12,25000.0f,3.5);
		Employee empThree = new Employee(12,25000.0f);
		Employee empFour = new Employee(12,36,3.5);
		System.out.println(emp);
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(empFour);
		emp.print();
		empOne.print();
		empTwo.print();
		empThree.print();
		empFour.print();
		
	}

}
