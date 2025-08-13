package streamapipack;

import java.util.ArrayList;
import java.util.List;

public class CountryFilter {

	public static void main(String[] args) {
		List<String>  myPlaces=new ArrayList<String>();
		myPlaces.add("Australia,Melbourne");
		myPlaces.add("Australia,sydney");
		myPlaces.add("India,Mysore");
		myPlaces.add("India,Kerala");
		myPlaces.add("India,Tamil Nadu");
		myPlaces.add("USA,New York");
		
		myPlaces.stream()
		.filter((p)->p.startsWith("India"))
		.map((p)->p.toUpperCase())
		.sorted()
		.forEach((p)->System.out.println(p));
				
	}

}
