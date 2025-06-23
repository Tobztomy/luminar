package abstractpack;

interface student{
	public abstract void printDetails(int id,String name);
}
interface studentDetails{
	public abstract void showDetails(float marks,double fees);
}
public class StudentInterface implements student,studentDetails {
	public void printDetails(int id,String name) {
		System.out.println(id+" "+name);
	}
	public void showDetails(float marks,double fees){
		System.out.println(marks+" "+fees);
	}
	public static void main(String[] args) {
		StudentInterface obj= new StudentInterface();
		obj.printDetails(11,"tobin");
		obj.showDetails(23.6f,25000.00);

	}

}
