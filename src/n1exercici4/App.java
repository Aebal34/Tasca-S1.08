package n1exercici4;

import java.util.*;

public class App {

	public static void main(String[] args) {
		//Month list creation
		List<String> months = new ArrayList<String>();
		months.add("Januray");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		//Method reference to print them
		
		months.forEach(System.out::println);

	}

}
