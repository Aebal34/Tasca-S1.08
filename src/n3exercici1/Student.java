package n3exercici1;

public class Student {

	//ATTRIBUTES
	String name;
	String course;
	int age;
	float grade;
	
	//CONSTRUCTOR
	public Student(String name, String course, int age, float grade) {
		this.name = name;
		this.course = course;
		this.age = age;
		this.grade = grade;
	}
	
	//GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Student [name=" + name + "\n"
						+", course=" + course + "\n"
						+", age=" + age + "\n"
						+ ", grade=" + grade + "]";
	}
}
