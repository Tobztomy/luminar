package thispack;

class MethodChaining{
	public void display() {
		System.out.println("inside display method");
		show();
	}
	public void show() {
		System.out.println("inside show method");
	}
	
}


public class ThisMethodDemo {

	public static void main(String[] args) {
		MethodChaining obj= new MethodChaining();
		obj.display();
	}

}
