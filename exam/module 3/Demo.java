package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		String text = "java is fast java is powerful";
        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Convert map to list
        List<Map.Entry<String, Integer>> list = 
                new ArrayList<>(map.entrySet());

     // Print result
        System.out.println("unique words.");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey());
        }
        
     // Print result
        System.out.println("count words");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        // Sort by highest count
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print result
        System.out.println("sorted");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey());
        }
        
        System.out.println("sorted result");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
	}

}
