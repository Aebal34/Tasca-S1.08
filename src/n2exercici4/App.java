package n2exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		list.add("Gatsby");
		list.add("Great");
		list.add(23);
		list.add("Amber");
		list.add(34);
		
		
		//1. Order by first character
		list.stream()
				.filter(obj -> obj instanceof String)
				.sorted(Comparator.comparing(obj -> ((String)obj).charAt(0)))
				//2. Added sort condition by containing character "e" first
				.sorted(Comparator.comparing(obj -> ((String)obj).contains("e")).reversed())
				//3. Added mapper that replaces "a" for "4"
				.map(obj -> ((String)obj).replace("a", "4"))
				.forEach(obj -> System.out.println(obj));
		
		
		System.out.println(); //For better reading
		
		//Just to add a String with numbers
		list.add("F4E");

		//We make a new stream because in the other one we need to filter Strings first,
		//and we can't apply the new filter afterwards
		list.stream()
				.filter(obj -> {
					boolean filter = false;
					if(obj instanceof String) {
						filter = ((String)obj).matches(".*\\d.*");
					}else if (obj instanceof Integer) {
						filter = true;
					}
					return filter;
				})
				.forEach(obj -> System.out.println(obj));
		
		list.stream()
		.filter(obj -> {
			return ((obj instanceof String)&&((String)obj).matches(".*\\d.*"))
				     ||(obj instanceof Integer);
		})
		.forEach(obj -> System.out.println(obj));
	}
}
