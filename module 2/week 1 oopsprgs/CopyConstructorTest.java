package oopsprgs;

class Admin {
	int roll;
	String name;
	Admin(int rollNo,String nameOne){
		roll=rollNo;
		name=nameOne;
	}
	Admin(Admin first){
		roll=first.roll;
		name=first.name;
		
	}
	public void printDetails() {
		System.out.println("Enroll="+roll+"\tName="+name);
	}
}
public class CopyConstructorTest {

	public static void main(String[] args) {
		int rollNo;
		String	nameOne;
		Admin first= new Admin(23,"bini");
		System.out.println("Enroll="+first.roll+"\tName="+first.name);
		Admin second = new Admin(first);
		second.printDetails();
	}

}
