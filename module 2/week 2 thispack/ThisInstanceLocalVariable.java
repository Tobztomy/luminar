package thispack;

import java.util.Scanner;

class Student{
	int rollNo;
	Student(int rollNo){
		this.rollNo=rollNo;
	}
}
public class ThisInstanceLocalVariable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int rollNo;
		System.out.println("enter roll no");
		rollNo=sc.nextInt();
		Student obj1=new Student(rollNo);
		System.out.println(obj1.rollNo);
	}

}
