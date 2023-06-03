package n2exercici3;

public class App {

	public static void main(String[] args) {

		Calculator sum = (num1, num2)-> num1+num2;
		Calculator substract = (num1, num2) -> num1-num2;
		Calculator multiply = (num1, num2) -> num1 * num2;
		Calculator divide = (num1, num2) -> num1 / num2;

		System.out.println(sum.operation(2, 2));
		System.out.println(substract.operation(10, 5.8f));
		System.out.println(multiply.operation(2.5f, 8.7f));
		System.out.println(divide.operation(15, 3));
	}

}
