package inheritancepack;

class Student{
	String name ="bini";
}

class CollegeStudent extends Student{
	String courseName="MCA";
}

class McaStudent extends CollegeStudent{
	String semester="3rd sem";
	public void showDetails() {
		System.out.println(name+" "+courseName+" "+semester);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		McaStudent obj= new McaStudent();
		obj.showDetails();
	}

}
