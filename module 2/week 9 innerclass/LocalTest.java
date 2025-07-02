package innerclass;

class OuterTest {
	int count = 1;
	static int num = 2;

	public void display() {
		for (int i = 1; i <= 5; i++) {
			class LocalTest {
				public void show() {
					System.out.println(count + " " + num);
				}
			}
			LocalTest obj1 = new LocalTest();
			obj1.show();
		}
		
	}
}

public class LocalTest {

	public static void main(String[] args) {
		OuterTest obj = new OuterTest();
		obj.display();
	}

}
