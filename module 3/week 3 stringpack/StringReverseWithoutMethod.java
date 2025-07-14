package stringpack;

public class StringReverseWithoutMethod {

	public static void main(String[] args) {
		String name="tobin";
		System.out.print("Reverse of String "+name+" is ");
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
		
	}

}
