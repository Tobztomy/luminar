package innerclass;

class Outer {
	int count = 0;

	public void display() {
		Inner obj2= new Inner();//call inner class method from outer class method by creating object
		obj2.show();
	}

	class Inner {// member Inner Class
		public void show() {
			System.out.println("inside inner class " + count);
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Outer obj1= new Outer();
		obj1.display();
	}

}
