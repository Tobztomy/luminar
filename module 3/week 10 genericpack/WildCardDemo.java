package genericpack;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

	public static void printList(List <?> list) {
		System.out.println(list);
	}
	public static void main(String[] args) {
		List <Integer> intList=new ArrayList<>();
		intList.add(20);
		intList.add(10);
		
		printList(intList);
		
		List <Double> doubleList=new ArrayList<>();
		doubleList.add(20.1);
		doubleList.add(10.2);
		
		printList(doubleList);
	}

}
