package oopsprgs;

import java.util.Scanner;

class Participants{
	int rollNo;
	String name;
	static String collegeName="Rajagiri";
	Participants(int roll, String studentName){
		rollNo=roll;
		name=studentName;
	}
	public void printParticipantsList() {
		System.out.println("Roll no= "+rollNo+"\t Name= "+name+"\tcollege= "+collegeName);
	}
}
public class YouthFestival {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll;
		String studentName;
		System.out.println("enter roll no");
		roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter student name");
		studentName=sc.nextLine();
	
		
		Participants obj1=new Participants(roll,studentName);
		
		obj1.printParticipantsList();
		sc.close();
	}

}
