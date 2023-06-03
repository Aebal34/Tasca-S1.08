package n1exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		//String list
		List<String> strings = new ArrayList<String>();
		strings.add("Murciélago");
		strings.add("Silla");
		strings.add("Terminal");
		strings.add("Gato");
		
		List<String> filteredStrings = new ArrayList<String>();
		
		//Lambda expression
		filteredStrings = strings.stream()
									.filter(string -> string.contains("o"))
									.collect(Collectors.toList());
		
		System.out.println(filteredStrings);
	}
}
