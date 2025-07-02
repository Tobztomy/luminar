package innerclass;

abstract class piValueDetect{
	public abstract double getPiValue();
}
public class AnonymousAbstract{
	
	public static void main(String[] args) {
		piValueDetect demo=new piValueDetect() {//anonymous inner class
			public double getPiValue() {
				return 3.14;
			}	
		};
		System.out.println(demo.getPiValue());
		
	}

}
