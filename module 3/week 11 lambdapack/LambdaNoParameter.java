package lambdapack;

@FunctionalInterface
interface DemoInterface{
	double getPiValue();
}

public class LambdaNoParameter {

	public static void main(String[] args) {
		DemoInterface di;
		di=()->3.1415;
		
		DemoInterface dil=()->3.14;
		
		System.out.println("value of pi "+di.getPiValue());
		System.out.println("value of pi "+di.getPiValue());
		
	}

}
