package iopack;

import java.io.Serializable;

public class Employee implements Serializable{
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
