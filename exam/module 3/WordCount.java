package exam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		String text="Java and python are programming language but Java is a powerful programming language";
		String[] words= text.toLowerCase().split("\\s+");
		
		Map<String, Integer> map=new LinkedHashMap<>();
		
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		List<Map.Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
		
		System.out.println("*******Unique words*******");
		for(Map.Entry<String, Integer> e:list) {
			System.out.println(e.getKey());
		}
		
		System.out.println("\n*******count of words*******");
		for(Map.Entry<String,Integer> e:list) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		list.sort((a,b)->b.getValue().compareTo(a.getValue()));
		
		System.out.println("\n*******Sorted words based on most frequency*******");
		for(Map.Entry<String,Integer>e:list) {
			System.out.println(e.getKey());
		}
		
		System.out.println("\n*******Sorted result*******");
		for(Map.Entry<String,Integer>e:list) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
