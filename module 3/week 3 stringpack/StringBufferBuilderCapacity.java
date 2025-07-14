package stringpack;

public class StringBufferBuilderCapacity {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("");//default capacity,empty string 16
		System.out.println("capacity "+buff.capacity());//16+0
		System.out.println("Length "+buff.length());
		
		buff = new StringBuffer("java");//16+4
		System.out.println("capacity "+buff.capacity());
		System.out.println("Length "+buff.length());
		
		StringBuffer sb = new StringBuffer(6);
		System.out.println("capacity "+sb.capacity());//6
		System.out.println("Length "+sb.length());
		sb.append("merit campus luminar");
		System.out.println("Length "+sb.length());
		System.out.println("capacity "+sb.capacity());
	}

}
