package collectionpack;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class TestHashset {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("JAVA");
		set.add("JSP");
		set.add("STRUTS");
		set.add("HIBERNATE");
		set.add("JAVA");//duplicate
		set.add("JSP");//duplicate
		
		Enumeration e =Collections.enumeration(set);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
		for(String str:set)
			System.out.println(str);
	}

}
