package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class MutableImmutable {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();//immutable collection
		lst.add("java");
		lst.add("Luminar");
		lst.add("Technolab");
		
		for(String str:lst) {
			str+="course";//cannot modify immutable object
		}
		System.out.println(lst);
		
		List<StringBuilder> list=new ArrayList<StringBuilder>();
		list.add(new StringBuilder("java"));
		list.add(new StringBuilder("Luminar"));
		list.add(new StringBuilder("Technolab"));
		for(StringBuilder str:list) {
			str.append(" course");//can modify mutable object
		}
		System.out.println(list);
	}
}
