package lambdapack;

@FunctionalInterface
interface MyInterface{
	String reverse(String s);
}

public class LambdaWithParameter {

	public static void main(String[] args) {
		MyInterface mi=(str)->{//lambda expression
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
				
			}
			return result;	
		};
		System.out.println("reversed "+mi.reverse("Luminar"));
	}

}
