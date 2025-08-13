package optionalpack;

public class BeforJDK8 {

	public static String getValue(String str) {
		String result=null;
		if (str.equals("luminar")){
			result="yes";
		}
		return result;
	}
	public static void main(String[] args) {
		String value=getValue("luminar");
		if(value!=null) {
			System.out.println(value.toUpperCase());
		}
	}

}
