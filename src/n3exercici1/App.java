package n3exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Jordi", "JAVA", 30, 9.8f));
		students.add(new Student("Abel", "PHP", 27, 4.2f));
		students.add(new Student("Laia", "JAVA", 14, 6.3f));
		students.add(new Student("Marta", "PHP", 24, 5f));
		students.add(new Student("Fran", "JAVA", 35, 4.5f));
		students.add(new Student("Alba", "PHP", 29, 2.2f));
		students.add(new Student("Joan", "PHP", 32, 10f));
		students.add(new Student("Marc", "PHP", 52, 8.7f));
		students.add(new Student("Marina", "JAVA", 18, 3.6f));
		students.add(new Student("Vanessa", "JAVA", 17, 8.9f));
		
		//1. We show age and name of every Student
		students.forEach(student -> System.out.println("Name: "+student.getName()+
													   "  "+
													   "Age: "+student.getAge()));
		
		System.out.println();//To separate exercises
		
		//2. We filter students whose name starts with 'a' and assign them to a new list
		List<Student> studentsNameA = students.stream()	
												.filter(student -> student.getName().charAt(0)=='A'
																	||student.getName().charAt(0)=='a')
												.collect(Collectors.toList());
		//We print the list with method reference
		studentsNameA.forEach(System.out::println);
		
		System.out.println();//To separate exercises
		
		//3. We filter the list to show all students with a grade of 5 or more
		students.stream()
					.filter(student -> student.getGrade()>= 5)
					.forEach(System.out::println);
		
		System.out.println();//To separate exercises
		
		//4. We filter the list to show all students with grade greater or equal than 5 and not from PHP
		students.stream()
					.filter(student -> student.getGrade()>= 5
										&& !student.getCourse().equals("PHP"))
					.forEach(System.out::println);
		
		System.out.println();//To separate exercises
		
		//5. We filter the list with students from JAVA and whose age >= 18
		students.stream()
					.filter(student -> student.getCourse().equals("JAVA")
										&& student.getAge() >= 18)
					.forEach(System.out::println);
	}
}
