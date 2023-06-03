package n2exercici2;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(3);
		numbers.add(55);
		numbers.add(44);
		numbers.add(82);
		
		String numString = numbers.stream()
									.map(num -> num%2 == 0 ? "e" + num  : "o" + num)
									.collect(Collectors.joining(", "));
									
		System.out.println(numString);
	}

}
