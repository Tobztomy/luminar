package jdk8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> foodList = new ArrayList<String>();

		foodList.add("cake");
		foodList.add("biscuit");
		foodList.add("cheese");

		System.out.println(foodList);
		
		Iterator iter = foodList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		for (String item : foodList)
			System.out.println(item);

		foodList.forEach(food -> System.out.println(food));

		foodList.forEach(System.out::println);

	}

}
