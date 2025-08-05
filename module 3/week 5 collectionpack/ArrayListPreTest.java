package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPreTest {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("luminar");
		list.add("technolab");
//		list.add(23);
		//System.out.println(list);
		Iterator iter =list.iterator();
		
		System.out.println(list);
		
		while(iter.hasNext()) {
//			String str=(String)iter.next();//casting
//			System.out.println(str);
			if (iter.next().equals("luminar"))
				iter.remove();
		}
		System.out.println(list);
		Iterator i =list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		for (String str:list)
			System.out.println(str);
	}

}
