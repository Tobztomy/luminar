package callbypack;

class Student{
	
}
class Library{
	
}
class College{
	void details(Student s,Library l) {
		
	}
}
public class CallByReference {

	public static void main(String[] args) {
		College obj = new College();
		//Student obj1= new Student();
		//Library obj2= new Library();
		//obj.details(obj1, obj2);
		obj.details(new Student(), new Library());
	}

}
