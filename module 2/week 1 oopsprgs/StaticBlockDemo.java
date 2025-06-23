package oopsprgs;

class BlockDemo{
	
	//static block
	static {
		System.out.println("inside static block");
	}
	
	//non static block
	{
		System.out.println("inside non static block");
	}
	
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		BlockDemo obj1=new BlockDemo();
		BlockDemo obj2=new BlockDemo();
		
	}

}
