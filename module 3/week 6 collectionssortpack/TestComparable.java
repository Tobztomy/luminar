package collectionssortpack;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return rollno + "\t" + name + "\t" + age ;
	}
	
}

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"bini",23));
		al.add(new Student(105,"devu",22));
		al.add(new Student(106,"rukku",29));
		al.add(new Student(109,"aswin",25));
		al.add(new Student(110,"manu",24));
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("rollno\tname\tage");
		for(Student st:al){
		System.out.println(st.rollno+"\t"+st.name+"\t"+st.age);
		}
	}

}
