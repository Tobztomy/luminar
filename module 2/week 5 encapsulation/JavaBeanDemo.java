package encapsulation;

class Employee {
	private int empId;
	private String empName;
	private float empSalary;

	public void setId(int empId) {
		this.empId = empId;
	}

	public int getId() {
		return empId;
	}

	public void setName(String empName) {
		this.empName = empName;
	}

	public String getName() {
		return empName;
	}

	public void setSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public float getSalary() {
		return empSalary;
	}

	public String toString() {
		return empId + " " + empName + " " + empSalary;
	}

}

public class JavaBeanDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(11);
		employee.setName("tobin");
		employee.setSalary(25.48f);
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
		System.out.println(employee);
	}

}
