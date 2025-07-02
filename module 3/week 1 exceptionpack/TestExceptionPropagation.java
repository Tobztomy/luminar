package exceptionpack;

public class TestExceptionPropagation {

	void print() {//------4
		int data = 50 / 0;
	}

	void display() {
		print();//-------3
	}

	void test() {
		try {
			display();//----2
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.test();//---1
		System.out.println("normal flow");
	}

}
