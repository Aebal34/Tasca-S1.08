package n2exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Ana");
		names.add("Maria");
		names.add("antonio");
		names.add("alf");
		names.add("John");
		names.add("Didac");
		names.add("Abel");
		
		List<String> filteredNames = names.stream().filter(s -> s.charAt(0)== 'A' && s.length()== 3)
							  					   .collect(Collectors.toList());
		
		System.out.println(filteredNames);
	}

}
