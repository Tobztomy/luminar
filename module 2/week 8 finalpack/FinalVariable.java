package finalpack;

class Test{
	final int num=100;
	public void print() {//overriding
		System.out.println(num);
		
	}
	public void display() {
		System.out.println("hai");
	}
}
class Demo extends Test{//inherit
	public void display() {
		
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		Demo d= new Demo() ;
		

	}

}
