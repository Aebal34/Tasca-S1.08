package n1exercici6;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		list.add("This");
		list.add("in not a");
		list.add(23);
		list.add("number, instead ");
		list.add("it's just text.");
		
		List<Object> orderedList = list.stream()
										.filter(o -> o instanceof String)
										.sorted(Comparator.comparingInt(o -> ((String)o).length()))
										.collect(Collectors.toList());
		
		System.out.println(orderedList);
	}
}
