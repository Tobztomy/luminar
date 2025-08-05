package collectionssortpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int empno;
	String name;
	int age;

	Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {// system identifies object
		if (e1.age == e2.age)
			return 0;
		else if (e1.age > e2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(114, "Devi", 28));
		al.add(new Employee(105, "Benz", 25));
		al.add(new Employee(108, "Kevin", 22));
		System.out.println("Before Sorting");

		for (Employee emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}

		System.out.println("sorting by age");
		Collections.sort(al, new AgeComparator());//implementation of object
		
		for (Employee emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		for (Employee emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}

	}

}
