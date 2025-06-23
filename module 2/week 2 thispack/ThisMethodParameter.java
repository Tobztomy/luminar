package thispack;

class Parametermethod{
	public void display() {
		System.out.println("display");
		show(this);
	}
	public void show(Parametermethod ob) {
		System.out.println("show");
	}
}


public class ThisMethodParameter {

	public static void main(String[] args) {
		Parametermethod obj = new Parametermethod();
		obj.display();
	}

}
