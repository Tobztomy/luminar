package jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] stringArray = new String[] { "manu", "jose", "kevin", "anu" };

		List stringList = Arrays.asList(stringArray);

		System.out.println("original");
		for (String s : stringArray) {
			System.out.println(s);
		}
		System.out.println(stringList);
		
		stringList.set(0, "Evelin");
		
		System.out.println("after modification");//original changed
		for (String s : stringArray) {
			System.out.println(s);
		}
		System.out.println(stringList);
		
		String[] stringArrays = new String[] { "manu", "jose", "kevin", "anu" };

		List stringLists = new ArrayList<>(Arrays.asList(stringArray));

		stringLists.set(0, "akshay");
		
		System.out.println("after modification");//original not changed
		for (String s : stringArrays) {
			System.out.println(s);
		}
		System.out.println(stringLists);
		
	}

}
