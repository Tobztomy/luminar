package abstractpack;

abstract class AbstractDemo{
	int num=50;
	static String str="abstract class";
	abstract void display();
	public void print(String str) {
		System.out.println(str);
	}
	static void show() {
		System.out.println("inside show method");
	}
}
class Test extends AbstractDemo{

	void display() {
		System.out.println(num+" "+str);
		
	}
	
}

public class AbstractClassMembers {

	public static void main(String[] args) {
		//Test test =new Test();
		AbstractDemo obj = new Test();//super class contain them,abstract class cannot have constructor
		
		obj.print("hello Tobin");//non-static method
		AbstractDemo.show();//static method
		obj.display();//non-static method
	}

}
