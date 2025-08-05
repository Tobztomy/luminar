package collectionpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		Set<Integer> setHash = new HashSet<>();
		Set<Integer> setLinked = new LinkedHashSet<>();
		Set<Integer> setTree = new TreeSet<>();
		
		
		setHash.add(23);
		setHash.add(79);
		setHash.add(6);
		setHash.add(14);
		setHash.add(75);
		setHash.add(2);
		
		System.out.println("setHash"); //any order
		for (Integer h : setHash) {
		System.out.println(h);
		}
		
		
		setLinked.add(23);
		setLinked.add(79);
		setLinked.add(6);
		setLinked.add(14);
		setLinked.add(75);
		setLinked.add(2);
		
		System.out.println("setLinked"); //insertion order
		
		for(Integer l:setLinked){
		System.out.println(l);
		}
		
		setTree.add(79);
		setTree.add(6);
		setTree.add(14);
		setTree.add(75);
		setTree.add(2);
		
		System.out.println("setTree"); //sorted order
		for(Integer t:setTree){
		System.out.println(t);
		}
		}
	}


