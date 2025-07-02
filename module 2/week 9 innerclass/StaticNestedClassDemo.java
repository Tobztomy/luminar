package innerclass;

class OuterClass{
	private static int count=10;
	
	public static class StaticNested{//static nested class
		public void display() {
			System.out.println("inside static nested class,inside nonstatic method"+count);
			
		}
	}
	
	public void showOuter() {
		System.out.println("inside outer class"+count);
	}
	class innerclass{//innerclass
		int num=20;
		public void show() {
			System.out.println("inside inner class,inside nonstatic method"+count++);
			showOuter();
		}
		
	}
}

public class StaticNestedClassDemo {

	public static void main(String[] args) {
		OuterClass.StaticNested sn = new OuterClass.StaticNested();
		sn.display();
		
		OuterClass obj= new OuterClass();
		OuterClass.innerclass obj1= obj.new innerclass();
		obj1.show();
	}

}
