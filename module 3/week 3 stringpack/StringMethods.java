package stringpack;

public class StringMethods {

	public static void main(String[] args) {
		int empNo=1001;
		String empName="E"+empNo;
		System.out.println(empName);
		String s1="Luminar";
		String s2="Technolab";
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s4="Java";
		String s5=s4.concat("program");
		System.out.println(s5);
		
		String s="LuminarTechnolab";
		System.out.println(s.substring(7));//Technolab
		System.out.println(s.substring(0,7));//Luminar
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String str="   Luminar  ";
		System.out.println(str);
		System.out.println(str.trim());
		
		System.out.println(s.startsWith("Lu"));
		System.out.println(s.endsWith("b"));
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		
		System.out.println(s.length());
		
		System.out.println(s.replace("ar", "art"));
		
		
	}

}
