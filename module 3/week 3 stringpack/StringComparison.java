package stringpack;

public class StringComparison {

	public static void main(String[] args) {
		String s1="Luminar";
		String s2="Luminar";
		String s3=new String("Luminar");
		String s4="LUminar";
		String s5=new String("Oracle");
		System.out.println(s1.equals(s2));//actual value
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1==s2);//memory address
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		//compare+sort
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s3.compareTo(s5));//-,s3<s5
		System.out.println(s5.compareTo(s3));//+,s5>s3
		
	}

}
