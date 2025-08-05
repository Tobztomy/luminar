package collectionpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListCollectionDemo {

	public static void main(String[] args) {
		List<Integer> listArray=new ArrayList<>();

		List<Integer> listLinked=new LinkedList<>();

		List<Integer> listVector=new Vector<>();

		List<Integer> listStack=new Stack<>();

		listArray.add(11);
		listArray.add(22);
		listArray.add(33);

		listLinked.add(11);
		listLinked.add(22);
		listLinked.add(33);

		listVector.add(11);
		listVector.add(22);
		listVector.add(33);

		listStack.add(11);
		listStack.add(22);
		listStack.add(33);
		
		System.out.println("arraylist");
		for(Integer i: listArray)
		System.out.println(i);

		System.out.println("linked list");
		for(Integer i: listLinked)
		System.out.println(i);

		System.out.println("vector");
		for(Integer i: listVector)
		System.out.println(i);

		System.out.println("stack");
		for(Integer i: listStack)
		System.out.println(i);
	}

}
