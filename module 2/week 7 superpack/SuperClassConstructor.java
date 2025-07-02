package superpack;

class Parent {
	Parent() {
		System.out.println("in superclass constructor");
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("in child class constructor");
	}
}

public class SuperClassConstructor {

	public static void main(String[] args) {
		Child child = new Child();

	}

}
