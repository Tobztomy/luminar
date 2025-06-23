package thispack;

class ConstructorDemo {
	int first;
	int second;

	ConstructorDemo() {
		this(10, 20);
	}

	ConstructorDemo(int first) {
		this(first,20);
	}

	ConstructorDemo(int first, int second) {
		this.first=first;
		this.second=second;
	}

	public void show() {
		System.out.println(first + " " + second);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

		ConstructorDemo obj1 = new ConstructorDemo();
		obj1.show();
		ConstructorDemo obj2 = new ConstructorDemo(15);
		obj2.show();
		ConstructorDemo obj3 = new ConstructorDemo(14, 13);
		obj3.show();
	}

}
