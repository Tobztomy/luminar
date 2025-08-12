package streamapipack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Binibindu","Rukku","Nitya","Ani");
		
		Stream<String> allNames=names.stream();//stream(gems sweets)
		
		Stream<String> longNames=allNames.filter(str->str.length()>6);//different color
		
		longNames.forEach(str->System.out.println(str+" "));//lambda
		
		List filteredList=names.stream()
				.filter(s->s.length()==5)
				.filter(s->!s.startsWith("d"))
				.filter(s->s.contains("R"))
				.collect(Collectors.toList());
		System.out.println(filteredList);
		
		filteredList.forEach(System.out::println);
	}

}
