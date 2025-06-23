package thispack;

class CurrentTest{
	CurrentTest(){
		
	}
	public void show() {
		System.out.println("inside show method");
	}
	public CurrentTest getDisplay() {
		System.out.println("inside display method");
		return this;
	}
}
public class ThisCurrentInstanceClass {

	public static void main(String[] args) {
		CurrentTest  obj = new CurrentTest();
		obj.getDisplay().show();

	}

}
