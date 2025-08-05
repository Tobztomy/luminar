package collectionpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMethods {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("spring");
		list.add("hibernate");
		
		Set<String> set=new HashSet<>();
		
		Map<Integer,String> map=new HashMap<>();
		
		System.out.println("List "+list);
		System.out.println("size of list "+list.size());
		list.remove("java");
		System.out.println("List after removal"+list);
		list.set(1, "core java");
		
		System.out.println("List after addition"+list);
		System.out.println("size of list "+list.size());
		
		System.out.println(list.get(0));
		
		list.add("spring");
		list.add("java");
		
		System.out.println(list.contains("java"));
		
		System.out.println("List after addition"+list);
		System.out.println("size of list "+list.size());
		
		set.add("java");
		set.add("spring");
		set.add("spring");
		
		System.out.println("set"+set);
		System.out.println(set.contains("java"));
		set.remove("spring");
		System.out.println("set after removal"+set);

		
		map.put(101, "java");
		map.put(102, "spring");
		map.put(103, "hibernate");
		
		System.out.println(map);
		System.out.println(map.get(101));
		System.out.println(map.remove(102));
		System.out.println(map);
		
		map.put(104, "boot");
		map.put(105, "spring boot");
		
		System.out.println("keyset"+map.keySet());
		System.out.println("values"+map.values());
		System.out.println("entryset"+map.entrySet());
	}

}
