package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("C");
		list.add("Core java");
		list.add("Advanced java");
		
		System.out.println("inital collection "+list);
		
		Collections.addAll(list, "Servlet","JSP");
		
		System.out.println("After adding collection "+list);
		
		String[] strArr= {"c##",".Net"};
		Collections.addAll(list, strArr);
		System.out.println("After adding collection "+list);
		
		Collections.sort(list);
		System.out.println("sorted collection "+list);
		
	}

}
