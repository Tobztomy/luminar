package inheritancepack;

class Manager{
	int id=11;
	String name="tobin";
}
class Developer extends Manager{
	int dId=145;
	String dName="manu";
	public void showDetails() {
		System.out.println(id+" "+name+" "+dId+" "+dName);
	}
}
class Tester extends Manager{
	int tId=148;
	String tName="sonu";
	public void showDetails() {
		System.out.println(id+" "+name+" "+tId+" "+tName);
	}
}
class Designer extends Manager{
	int dId=150;
	String dName="nani";
	public void showDetails() {
		System.out.println(id+" "+name+" "+dId+" "+dName);
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		Developer developer=new Developer();
		Tester tester= new Tester();
		Designer designer=new Designer();
		developer.showDetails();
		tester.showDetails();
		designer.showDetails();
	}

}
