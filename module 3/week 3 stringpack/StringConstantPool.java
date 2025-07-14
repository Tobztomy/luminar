package stringpack;

public class StringConstantPool {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		String s3=new String("java");
		String s4=new String("java");
		if(s1==s2){//constant pool,literal(same memory reference)
			System.out.println("s1==s2 "+(s1==s2));
		}else {
			System.out.println("s1==s2 "+(s1==s2));
		}
		if(s1==s3){//s1constant pool,s3 heap,separate memory address
			System.out.println("s1==s3 "+(s1==s3));
		}else {
			System.out.println("s1==s3 "+(s1==s3));
		}
		if(s3==s4){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		s1.concat("luminar");
		System.out.println("s1 "+s1);
		s1=s1.concat("luminar");//assignment operator used
		System.out.println("after concatenation s1 "+s1);
		System.out.println(s2);
	
	}

}
