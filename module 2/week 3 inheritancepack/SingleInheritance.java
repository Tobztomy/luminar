package inheritancepack;
class Doctor{//super class
	String skills="MBBS";
	public void showSkill() {
		System.out.println(skills);
	}

	
}
class Ortho extends Doctor{//derived class
	String qualification="MS";
	public void showDetails() {
		System.out.println(qualification);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Ortho obj = new Ortho();
		System.out.println(obj.skills);
		System.out.println(obj.qualification);
		obj.showDetails();
		obj.showSkill();
	}

}
